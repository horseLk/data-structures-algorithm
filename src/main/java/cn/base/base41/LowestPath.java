package cn.base.base41;

import java.util.Arrays;

public class LowestPath {
    public int findLowestPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            res[i][0] = matrix[i][0];
        }
        for (int i = 1; i < n; i++) {
            res[0][i] = matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
        return res[m- 1][n - 1];
    }
}
