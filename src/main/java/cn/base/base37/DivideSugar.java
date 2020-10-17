package cn.base.base37;

import java.util.Arrays;

/**
 * 分糖果问题
 *      我们有 m 个糖果和 n 个孩子。我们现在要把糖果分给这些孩子吃，但是糖果少，孩子多（m<n），
 *      所以糖果只能分配给一部分孩子。每个糖果的大小不等，这 m 个糖果的大小分别是 s1，s2，s3，……，sm。
 *      除此之外，每个孩子对糖果大小的需求也是不一样的，只有糖果的大小大于等于孩子的对糖果大小的需求的时候，孩子才得到满足。
 *      假设这 n 个孩子对糖果大小的需求分别是 g1，g2，g3，……，gn。我的问题是，如何分配糖果，能尽可能满足最多数量的孩子？
 *      我们可以把这个问题抽象成，从 n 个孩子中，抽取一部分孩子分配糖果，让满足的孩子的个数（期望值）是最大的。这个问题的限制值就是糖果个数 m。
 */
public class DivideSugar {
    public int divideSugar(int[] m, int[] n) {
        Arrays.sort(m);
        Arrays.sort(n);
        int res = 0;
        int len1 = m.length;
        int len2 = n.length;
        int i = 0,j = 0;
        while (i < len1 && j < len2) {
            if (m[i] >= n[j]) {
                res++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return res;
    }
}