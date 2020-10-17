package cn.base.base40;

/**
 * 带价值的背包问题
 */
public class BackpackWithValue {
    public int backpack(int[] items, int[] values, int w) {
        int n = items.length;
        int[][] status = new int[n][w + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w + 1; j++) {
                status[i][j] = -1;
            }
        }
        status[0][0] = 0;
        if (items[0] <= w)
            status[0][items[0]] = values[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) { // 不选择 第 i 个物品
                if (status[i - 1][j] < 0) continue;
                status[i][j] = status[i - 1][j];
            }
            for (int j = 0; j <= w; j++) { // 选择第 i 个物品
                if (status[i - 1][j] < 0) continue;
                int v = status[i -1][j] + values[i];
                if (v > status[i][j + items[i]])
                    status[i][j + items[i]] = v;
            }
        }
        int maxV = -1;
        for (int j = 0; j <= w; j++) {
            if (status[n - 1][j] > maxV)
                maxV = status[n - 1][j];
        }
        return maxV;
    }
}
