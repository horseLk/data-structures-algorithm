package cn.base.base42;

public class LevenshteinDistance {
    int minDist = Integer.MAX_VALUE;
    public int getLevenshteinDistance(String s, String t) {
        getLevenshteinDistance(0, s.toCharArray(), 0, t.toCharArray(), 0);
        return minDist;
    }

    public int getLevenshteinDistanceDP(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] res = new int[m][n];
        // 初始化第一列
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) == t.charAt(0)) res[i][0] = i;
            else if (i != 0) res[i][0] = res[i - 1][0] + 1;
            else res[i][0] = 1;
        }
        // 初始化第一行
        for (int i = 0; i < n; i++) {
            if (s.charAt(0) == t.charAt(i)) res[0][i] = i;
            else if (i != 0) res[0][i] = res[0][i - 1] + 1;
            else res[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    res[i][j] = Math.min(Math.min(res[i - 1][j], res[i][j - 1]) + 1, res[i - 1][j - 1]);
                } else {
                    res[i][j] = Math.min(Math.min(res[i - 1][j], res[i][j - 1]), res[i - 1][j - 1]) + 1;
                }
            }
        }
        return res[m - 1][n - 1];
    }

    private void getLevenshteinDistance(int i, char[] s, int j, char[] t, int curDist) {
        if (i == s.length || j == t.length) {
            if (i < s.length) curDist += s.length - i;
            if (j < t.length) curDist += t.length - j;
            if (curDist < minDist)
                minDist = curDist;
            return;
        }
        if (s[i] == t[j])
            getLevenshteinDistance(i + 1, s, j + 1, t, curDist);
        else {
            getLevenshteinDistance(i + 1, s, j, t, curDist + 1); // 删除s[i] 或者在 t[j]前加一个字符
            getLevenshteinDistance(i, s, j + 1, t, curDist + 1);// 删除t[i] 或者在 s[j]前加一个字符
            getLevenshteinDistance(i + 1, s, j + 1, t, curDist + 1);// 将s[i] 和 t[j] 替换成相同的字符
        }
    }
}
