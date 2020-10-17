package cn.base.base40;

/**
 * 动态规划实现的背包问题
 */
public class BackpackQuestion {
    public int backpack(int[] items, int w) {
        boolean[][] status = new boolean[items.length][w + 1];
        status[0][0] = true;
        if (items[0] <= w)
            status[0][items[0]] = true;
        for (int i = 1; i < items.length; i++) {
            for (int j = 0; j < w; j++) {
                if (status[i - 1][j] == true) {
                    status[i][j] = true;
                    if (j + items[i] <= w) {
                        status[i][j + items[i]] = true;
                    }
                }
            }
        }
        for (int i = w; i >= 0; --i) {
            if (status[items.length - 1][i] == true) return i;
        }
        return 0;
    }
}
