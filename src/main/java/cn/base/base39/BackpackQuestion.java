package cn.base.base39;

/**
 * 背包问题
 */
public class BackpackQuestion {
    int maxWeight = Integer.MIN_VALUE;
    public int maxWeight(int[] items, int w) {
        int curWeight = 0;
        dfs(items, w, 0, curWeight);
        return maxWeight;
    }

    private void dfs(int[] items, int w, int index, int curWeight) {
        if (index == items.length) return;
        if (curWeight > maxWeight) {
            maxWeight = curWeight;
        }
        if (maxWeight == w) return;
        dfs(items, w, index + 1, curWeight);
        if (curWeight + items[index] <= w) {
            dfs(items, w, index + 1, curWeight + items[index]);
        }
    }
}
