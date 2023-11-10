package br.com.carlos.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<Data> {
    private Data data;
    private final List<Edge<Data>> enterEdges;
    private final List<Edge<Data>> outEdges;

    public Vertex(Data data) {
        this.data = data;
        this.enterEdges = new ArrayList<>();
        this.outEdges = new ArrayList<>();
    }

    public Data getData() {
        return this.data;
    }

    public List<Edge<Data>> getOutEdges() {
        return this.outEdges;
    }

    public void insertEnterEdge(Edge<Data> edge) {
        this.enterEdges.add(edge);
    }

    public void insertOutEdge(Edge<Data> edge) {
        this.outEdges.add(edge);
    }
}
