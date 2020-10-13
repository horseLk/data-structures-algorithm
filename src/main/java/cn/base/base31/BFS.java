package cn.base.base31;

import java.util.*;

/**
 * 图的广度优先算法代码实现
 */
public class BFS {
    /**
     * 广度优先遍历结果
     * @param graph
     * @param s
     * @return
     */
    public List<Integer> bfs(Graph graph, int s) {
        List<Integer> res = new ArrayList<Integer>();
        if (!graph.contains(s)) return res;
        List<Integer> tmpRes = new ArrayList<Integer>();
        tmpRes.add(s);
        while (!tmpRes.isEmpty()) {
            List<Integer> tmp = new ArrayList<Integer>();
            for (Integer m : tmpRes) {
                for (Integer n : graph.getAdj(m)) {
                    if (res.contains(n) || tmp.contains(n)) continue;
                    tmp.add(n);
                }
                res.add(m);
            }
            tmpRes.clear();
            tmpRes.addAll(tmp);
        }
        return res;
    }

    /**
     * 利用广度优先比例求最短路径
     * @param graph
     * @param s
     * @param t
     * @return
     */
    public int lowestDistance(Graph graph, int s, int t) {
        if (!graph.contains(s) || !graph.contains(t)) return -1;
        int[] prev = new int[graph.getV()]; // 用于记录每个节点最短路径的前一个路径
        prev[s] = -1; // 起始点的前一个点为 -1
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        Map<Integer, Integer> tmpRes = new HashMap<Integer, Integer>();
        tmpRes.put(s, 0);
        while (!tmpRes.isEmpty()) {
            Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
            for (Integer m : tmpRes.keySet()) {
                for (Integer n : graph.getAdj(m)) {
                    if (res.containsKey(n) || tmpRes.containsKey(n)) continue;
                    tmp.put(n, tmpRes.get(m) + 1);
                    prev[n] = m;
                }
                res.put(m, tmpRes.get(m));
            }
            tmpRes.clear();
            tmpRes.putAll(tmp);
        }
        System.out.println(Arrays.toString(prev));
        return res.get(t);
    }
}
