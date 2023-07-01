package start.part2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.removeEdge("A", "C");
        graph.print();
    }
}
