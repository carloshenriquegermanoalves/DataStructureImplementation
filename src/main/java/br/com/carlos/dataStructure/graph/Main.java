package br.com.carlos.dataStructure.graph;

public class Main {

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        graph.insertVertex(10);
        graph.insertVertex(20);
        graph.insertVertex(30);
        graph.insertVertex(40);
        graph.insertVertex(50);

        graph.insertEdge(2.0, 10, 20);
        graph.insertEdge(3.0, 20, 40);
        graph.insertEdge(1.0, 40, 30);
        graph.insertEdge(1.0, 10, 30);
        graph.insertEdge(2.0, 50, 20);
        graph.insertEdge(3.0, 50, 10);

        graph.breadthFirstSearch();
        graph.depthFirstSearch();
    }
}
