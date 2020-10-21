package cn.advance.advance43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 深度优先遍历实现的拓扑排序
 */
public class DFS {
    public List<Integer> topSortByDFS(Graph graph) {
        int v = graph.getV();
        LinkedList<Integer>[] adj = graph.getAdj();
        // 构建逆邻接表
        LinkedList<Integer>[] inverseAdj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            inverseAdj[i] = new LinkedList<Integer>();
        }
        // 通过邻接表生成逆邻接表
        for (int i = 0; i < v; i++) {
            for (int j : adj[i]) {
                inverseAdj[j].add(i);
            }
        }
        boolean[] visited = new boolean[v];
        List<Integer> res = new ArrayList<Integer>();
        // 深度优先遍历图
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, inverseAdj, visited, res);
            }
        }
        return res;
    }

    private void dfs(int index, LinkedList<Integer>[] inverseAdj, boolean[] visited, List<Integer> res) {
        for (int i = 0; i < inverseAdj[index].size(); i++) {
            int w = inverseAdj[index].get(i);
            if (visited[w]) continue;
            visited[w] = true;
            dfs(w, inverseAdj, visited, res);
        }
        res.add(index);
    }
}
