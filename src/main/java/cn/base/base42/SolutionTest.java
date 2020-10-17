package cn.base.base42;

public class SolutionTest {
    public static void main(String[] args) {
        String s = "mitcmu";
        String t = "mtacnu";

        System.out.println(new LevenshteinDistance().getLevenshteinDistance(s, t));
        System.out.println(new LevenshteinDistance().getLevenshteinDistanceDP(s, t));
    }
}
