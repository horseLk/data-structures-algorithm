package cn.base.base32;

/**
 * 暴力字符串匹配算法
 */
public class BruteForce {
    public int indexOf(String s, String t) {
        char[] chsS = s.toCharArray();
        char[] chsT = t.toCharArray();
        int len1 = chsS.length;
        int len2 = chsT.length;
        int i = 0;
        while (i <= len1 - len2) {
            if (chsS[i] == chsT[0]) {
                int j = 1;
                while (j < len2) {
                    if (chsS[i + j] != chsT[j])
                        break;
                    j++;
                }
                if (j == len2) return i;
            }
            i++;
        }
        return -1;
    }
}
