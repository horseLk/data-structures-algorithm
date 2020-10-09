package cn.base.base15;

public class MySqrt {
    public double mySqrt(double n) {
        double left = 0.0;
        double right = n;
        double mid = n / 2;
        while (Math.abs(n - mid * mid) >= 0.0000000001) {
            if (mid * mid < n) {
                left = mid;
                mid = (mid + right) / 2;
            }
            if (mid * mid > n) {
                right = mid;
                mid = (left + mid) / 2;
            }
        }
        return mid;
    }
}
