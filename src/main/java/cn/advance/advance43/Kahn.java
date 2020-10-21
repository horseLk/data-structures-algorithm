package cn.advance.advance43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *  实现拓扑排序的 Kahn 算法
 */
public class Kahn {
    public List<Integer> topSortByKahn(Graph graph) {
        int v = graph.getV();
        int[] inDegree = new int[v];
        LinkedList<Integer>[] adj = graph.getAdj();
        for (int i = 0; i < v; i++) {
            for (int j : adj[i]) {
                inDegree[j]++;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while (res.size() != v) {
            int i = 0;
            for (; i < v; i++) {
                if (inDegree[i] == 0 && !res.contains(i)) {
                    res.add(i);
                    break;
                }
            }
            if (i == v) break;
            for (int j : adj[i]) {
                inDegree[j]--;
            }
        }
        return res;
    }
}
