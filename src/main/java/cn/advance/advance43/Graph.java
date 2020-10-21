package cn.advance.advance43;

import java.util.LinkedList;

public class Graph {
    private int v; // 顶点个数
    private LinkedList<Integer> adj[]; // 每个顶点的邻接表

    public Graph(int n) {
        v = n;
        adj = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int s, int t) {
        if (s > v || t > v) throw new IllegalArgumentException();
        adj[s].add(t);
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(LinkedList<Integer>[] adj) {
        this.adj = adj;
    }
}
