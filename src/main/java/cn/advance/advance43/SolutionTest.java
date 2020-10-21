package cn.advance.advance43;

public class SolutionTest {
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(1, 3);
        graph.addEdge(1, 7);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(3, 7);
        graph.addEdge(7, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 6);
        graph.addEdge(2, 0);
        graph.addEdge(2, 5);
        graph.addEdge(6, 0);
        graph.addEdge(0, 5);

        System.out.println(new Kahn().topSortByKahn(graph));
        System.out.println(new DFS().topSortByDFS(graph));
    }
}
