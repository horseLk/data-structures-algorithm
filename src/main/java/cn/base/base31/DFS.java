package cn.base.base31;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    /**
     * 递归实现深度遍历
     * @param graph
     * @param s
     * @return
     */
    public List<Integer> dfs(Graph graph, int s) {
        List<Integer> res = new ArrayList<Integer>();
        if (!graph.contains(s)) return res;
        dfs(res, graph, s);
        return res;
    }

    private void dfs(List<Integer> res, Graph graph, int s) {
        if (res.size() == graph.getV()) return;
        res.add(s);
        for (int i = 0; i < graph.getAdj(s).size(); i++) {
            int cur = graph.getAdj(s).get(i);
            if (res.contains(cur))
                continue;
            dfs(res, graph, cur);
        }
    }
}
