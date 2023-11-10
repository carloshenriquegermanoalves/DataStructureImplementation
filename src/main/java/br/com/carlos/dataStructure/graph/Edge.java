package br.com.carlos.dataStructure.graph;

public class Edge<Data> {
    private double relationNumber;
    private final Vertex<Data> start;
    private final Vertex<Data> end;

    public Edge(Double relationNumber, Vertex<Data> start, Vertex<Data> end) {
        this.relationNumber = relationNumber;
        this.start = start;
        this.end = end;
    }

    public Vertex<Data> getEnd() {
        return this.end;
    }
}
