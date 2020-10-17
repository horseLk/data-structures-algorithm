package cn.base.base37;

/**
 * 找钱问题
 *  加入有100，50，20，10，5，1的钱币各若干张，请问支付n元前最少需要几张钞票
 */
public class GetCoin {
    public int getCoin(int[] count, int n) {
        int len = count.length;
        int money[] = {100, 50, 20, 10, 5, 1};
        int res = 0;
        for (int i = 0; i < len; i++) {
            while (n >= money[i] && count[i] > 0) {
                n -= money[i];
                count[i]--;
                res++;
            }
        }
        return res;
    }
}
