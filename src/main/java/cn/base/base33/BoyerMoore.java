package cn.base.base33;

/**
 * BM算法实现，已完成坏字符规则，好后缀规则后续再看。
 */
public class BoyerMoore {
    private static final int SIZE = 256;

    public int indexOf(String s, String t) {
        return bm(s.toCharArray(), s.length(), t.toCharArray(), t.length());
    }

    // BM算法
    private int bm(char[] s, int n, char[] t, int m) {
        int[] bc = new int[SIZE];
        generateBC(t, m, bc); // 构建坏字符串对应的哈希表
        int i = 0; // i 表示主串与模式串对齐的第一个字符

        // 坏字符规则
        while (i <= n - m) {
            int j;
            for (j = m - 1; j >= 0; --j) { // 模式串从后往前匹配
                if (s[i + j] != t[j])
                    break;
            }
            // 匹配成功
            if (j < 0) return i;
            // 匹配失败，找到下一个位置
            i = i + (j - bc[(int)s[i + j]]);
        }
        return -1;
    }

    // 在坏字符规则中，需要知道坏字符在模式串中小于坏字符对应坐标的最后索引。
    // 使用 bc 数组存储，每一个字符的最后索引可以快速查找。
    // 其本质是某个字母的ascii码值作为起哈希值构建哈希表
    private void generateBC(char[] b, int m, int[] bc) {
        for (int i = 0; i < SIZE; ++i) {
            bc[i] = -1;
        }
        for (int i = 0; i < m; ++i) {
            int ascii = (int)b[i];
            bc[ascii] = i;
        }
    }
}
