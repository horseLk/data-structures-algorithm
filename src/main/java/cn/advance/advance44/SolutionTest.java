package cn.advance.advance44;

public class SolutionTest {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 1);
        graph.addEdge(1, 3, 3);
        graph.addEdge(1, 4, 10);
        graph.addEdge(2, 0, 4);
        graph.addEdge(2, 5, 5);
        graph.addEdge(3, 2, 2);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 8);
        graph.addEdge(3, 6, 4);
        graph.addEdge(4, 6, 6);
        graph.addEdge(6, 5, 1);

        System.out.println(new Dijkstra().findLowestPath(graph, 0));
    }
}
