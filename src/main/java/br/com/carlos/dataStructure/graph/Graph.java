package br.com.carlos.dataStructure.graph;

import java.util.*;

public class Graph<Data> {
    private final List<Vertex<Data>> vertices;
    private final List<Edge<Data>> edges;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public void insertVertex(Data data) {
        Vertex<Data> newVertex = new Vertex<>(data);
        this.vertices.add(newVertex);
    }

    public void insertEdge(double relationNumber, Data startData, Data endData) {
        Vertex<Data> start = getVertex(startData);
        Vertex<Data> end = getVertex(endData);
        Edge<Data> edge = new Edge<>(relationNumber, start, end);
        start.insertOutEdge(edge);
        end.insertEnterEdge(edge);
        this.edges.add(edge);
    }

    public Vertex<Data> getVertex(Data data) {
        return vertices.stream().filter(vertex -> vertex.getData().equals(data)).findFirst().orElse(null);
    }

    public void breadthFirstSearch() {
        Set<Vertex<Data>> visited = new HashSet<>();
        Queue<Vertex<Data>> queue = new LinkedList<>();

        Vertex<Data> startVertex = vertices.get(0);
        visited.add(startVertex);
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex<Data> currentVertex = queue.poll();
            System.out.println(currentVertex.getData());

            for (Edge<Data> edge : currentVertex.getOutEdges()) {
                Vertex<Data> nextVertex = edge.getEnd();
                if (!visited.contains(nextVertex)) {
                    visited.add(nextVertex);
                    queue.add(nextVertex);
                }
            }
        }
    }

    public void depthFirstSearch() {
        Set<Vertex<Data>> visited = new HashSet<>();
        for (Vertex<Data> vertex : vertices) {
            if (!visited.contains(vertex)) {
                depthFirstSearchRecursive(vertex, visited);
            }
        }
    }

    private void depthFirstSearchRecursive(Vertex<Data> vertex, Set<Vertex<Data>> visited) {
        visited.add(vertex);
        System.out.println(vertex.getData());
        for (Edge<Data> edge : vertex.getOutEdges()) {
            Vertex<Data> nextVertex = edge.getEnd();
            if (!visited.contains(nextVertex)) {
                depthFirstSearchRecursive(nextVertex, visited);
            }
        }
    }
}
