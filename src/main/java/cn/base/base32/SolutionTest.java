package cn.base.base32;

public class SolutionTest {
    public static void main(String[] args) {
        String s = "baddef";
        String t = "add";
        System.out.println(new BruteForce().indexOf(s, t));

        System.out.println(new RabinKarp().indexOf(s, t));
    }
}
