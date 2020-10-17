package cn.base.base39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EightQueen {
    public int resultCount(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        char[][] M = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = 'O';
            }
        }
        dfs(res, M, 0, n);
        System.out.println(res);
        return res.size();
    }

    private void dfs(List<List<String>> res, char[][] m, int index, int length) {
        if (index == length) {
            StringBuilder builder = new StringBuilder();
            List<String> tmp = new ArrayList<String>();
            for (int i = 0; i < length; i++) {
                tmp.add(String.valueOf(m[i]));
            }
            res.add(tmp);
        }
        for (int i = 0; i < length; i++) {
            if (judge(m, index, i)) {
                m[index][i] = 'X';
                dfs(res, m, index + 1, length);
                m[index][i] = 'O';
            }
        }
    }

    private boolean judge(char[][] m, int row, int col) {
        // 左上角
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; --i, --j) {
            if (m[i][j] == 'X') return false;
        }
        // 正上方
        for (int i = row - 1; i >= 0; i--) {
            if (m[i][col] == 'X') return false;
        }

        // 右上角
        for (int i = row - 1, j = col + 1; i >= 0 && j < m.length; --i, ++j) {
            if (m[i][j] == 'X') return false;
        }
        return true;
    }
}
