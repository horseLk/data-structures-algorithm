package cn.base.base31;

import java.util.LinkedList;

public class Graph {
    private int v; // 节点个数
    private LinkedList<Integer> adj[]; // 每个节点的邻接表组成的数组

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int s, int t) {
        // 因为是无向图，因此一条边连接的两个节点都要各保存一次
        adj[s].add(t);
        adj[t].add(s);
    }

    public int getV() {
        return v;
    }

    public LinkedList<Integer> getAdj(int i) {
        return adj[i];
    }

    public boolean contains(int s) {
        return s < v && s >= 0;
    }
}
