package cn.base.base40;

public class YangHuiLowestPath {
    public int yanghui(int[][] numbers) {
        int[][] status = new int[numbers.length][numbers.length];
        status[0][0] = numbers[0][0];
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0)
                    status[i][j] = status[i - 1][0] + numbers[i][j];
                else if (j == i)
                    status[i][j] = status[i - 1][j - 1] + numbers[i][j];
                else {
                    status[i][j] = Math.min(status[i - 1][j - 1], status[i - 1][j]) + numbers[i][j];
                }
            }
        }
        int minV = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (status[numbers.length - 1][i] < minV)
                minV = status[numbers.length - 1][i];
        }
        return minV;
    }
}
