package cn.base.base41;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 9}, {2, 1, 3, 4}, {5, 2, 6, 7}, {6, 8, 4, 3}};
        System.out.println(new LowestPath().findLowestPath(matrix));

        System.out.println(new FindCoin().findCoin(16));
    }
}
