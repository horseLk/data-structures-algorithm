package cn.base.base41;

/**
 *  已知有1元、 3元 和 5元的纸币，如果支付 n 元最少需要多数张纸币
 */
public class FindCoin {
    public int findCoin(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            int val1 = res[i - 1];
            int val3 = Integer.MAX_VALUE;
            int val5 = Integer.MAX_VALUE;
            if (i - 3 >= 0)
                val3 = res[i - 3];
            if (i - 5 >= 0)
                val5 = res[i - 5];
            res[i] = Math.min(val1, Math.min(val3, val5)) + 1;
        }
        return res[n];
    }
}
