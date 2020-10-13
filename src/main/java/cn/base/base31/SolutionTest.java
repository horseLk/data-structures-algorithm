package cn.base.base31;

public class SolutionTest {
    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(1 - 1, 2 - 1);
        graph.addEdge(1 - 1, 3 - 1);
        graph.addEdge(2 - 1, 4 - 1);
        graph.addEdge(2 - 1, 5 - 1);
        graph.addEdge(3 - 1, 4 - 1);
        graph.addEdge(4 - 1, 6 - 1);
        graph.addEdge(4 - 1, 7 - 1);
        graph.addEdge(5 - 1, 6 - 1);
        graph.addEdge(6 - 1, 8 - 1);
        graph.addEdge(7 - 1, 8 - 1);
        graph.addEdge(2, 8);
        graph.addEdge(6, 8);

        System.out.println(new BFS().bfs(graph, 0));
        System.out.println(new BFS().lowestDistance(graph, 0, 8));

        Graph graph1 = new Graph(10);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 3);
        graph1.addEdge(1, 8);
        graph1.addEdge(1, 9);
        graph1.addEdge(2, 5);
        graph1.addEdge(3, 5);
        graph1.addEdge(3, 7);
        graph1.addEdge(4, 9);
        graph1.addEdge(5, 6);

        System.out.println(new DFS().dfs(graph1, 0));
    }
}
