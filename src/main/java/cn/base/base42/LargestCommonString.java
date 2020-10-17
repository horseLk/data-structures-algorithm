package cn.base.base42;

/**
 *  求两个字符串的最长公共子串
 */
public class LargestCommonString {
    public int getLargestCommonString(String s, String t) {
        int m = s.length();
        int n = s.length();
        int[][] res = new int[m][n];
        // 初始化第 0 行
        for (int i = 0; i < n; i++) {
            if (s.charAt(0) == t.charAt(i)) res[0][i] = 1;
            else if (i != 0) res[0][i] = res[0][i - 1];
            else res[0][i] = 0;
        }
        // 初始化第 0 列
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) == t.charAt(0)) res[i][0] = 1;
            else if (i != 0) res[i][0] = res[i - 1][0];
            else res[i][0] = 0;
        }
        // 动态规划填表过程
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    res[i][j] = Math.max(Math.max(res[i - 1][j], res[i][j - 1]), res[i - 1][j - 1]);
                } else {
                    res[i][j] = Math.max(Math.max(res[i - 1][j], res[i][j - 1]), res[i - 1][j - 1] + 1);
                }
            }
        }
        return res[m - 1][n - 1];
    }
}
