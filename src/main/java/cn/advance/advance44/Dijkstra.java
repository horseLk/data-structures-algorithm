package cn.advance.advance44;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Dijkstra {
    // 寻找在图中从某个点出发到其他所有点的最短路径
    public Map<Integer, Integer> findLowestPath(Graph graph, int s) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        int[] preNode = new int[graph.getV()];
        for (int i = 0; i < preNode.length; i++) {
            preNode[i] = -1;
        }
        Map<Integer, Integer> tmpRes = new HashMap<Integer, Integer>();
        LinkedList<Graph.Edge>[] adj = graph.getAdj();
        tmpRes.put(s, 0);
        while (!tmpRes.isEmpty()) {
            int key = findMinValueKey(tmpRes);
            int value = tmpRes.remove(key);
            LinkedList<Graph.Edge> edges = adj[key];
            for (Graph.Edge edge : edges) {
                int x = edge.tid;
                if (res.containsKey(x) || (tmpRes.containsKey(x) && tmpRes.get(x) < value + edge.w)) continue;
                tmpRes.put(x, value + edge.w);
                preNode[x] = key;
            }
            res.put(key, value);
        }
        System.out.println(Arrays.toString(preNode));
        return res;
    }

    private int findMinValueKey(Map<Integer, Integer> map) {
        Integer minKey = null;
        Integer minValue = Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            if (map.get(key) < minValue) {
                minValue = map.get(key);
                minKey = key;
            }
        }
        return minKey;
    }
}
