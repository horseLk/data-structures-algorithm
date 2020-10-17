package cn.base.base34;

public class KMP {
    public int indexOf(String s, String t) {
        return indexOf(s.toCharArray(), s.length(), t.toCharArray(), t.length());
    }

    private int indexOf(char[] s, int n, char[] t, int m) {
        int[] next = getNext(t, m); // 构建失效数组
        int j = 0;
        for (int i = 0; i < n; i++) {
            // j == 0切不匹配，则将 i 自增 1即可，j不变表示始终从模式串头部开始
            while (j > 0 && s[i] != t[j]) { // 如果出现了不匹配
                j = next[j - 1] + 1; // 模式串中需要重新比较的字符
            }
            if (s[i] == t[j]) { // 匹配则表示
                ++j;
            }
            if (j == m) { // 匹配完成，此时 i 指向主串中最后一个匹配成功的坐标
                return i - m + 1;
            }
        }
        return -1;
    }

    private int[] getNext(char[] t, int m) {
        int[] next = new int[m];
        next[0] = -1;
        int k = -1;
        for (int i = 1; i < m; i++) {
            // 因为前一个的最长串的下一个字符不与最后一个相等，需要找前一个的次长串，问题就变成了求0到next(k)的最长串
            // 如果下个字符与最后一个不等，继续求次长串，也就是下一个next(k)，直到找到，或者完全没有
            while (k != -1 && t[k + 1] != t[i]) {
                k = next[k];
            }
            if (t[k + 1] == t[i]) {
                ++k;
            }
            next[i] = k;
        }
        return next;
    }
}
