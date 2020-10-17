package cn.base.base40;

public class SolutionTest {
    public static void main(String[] args) {
        int[] items = {2,2,4,6,3};
        System.out.println(new BackpackQuestion().backpack(items, 16));

        int[][] numbers = {{5}, {7, 8}, {2, 3, 4}, {4, 9, 6, 1}, {2, 7, 9, 4, 5}};
        System.out.println(new YangHuiLowestPath().yanghui(numbers));
    }
}
