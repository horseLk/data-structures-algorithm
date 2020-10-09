package cn.base.base10;

public class BubbleSort {
    public void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int changeCount = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    changeCount++;
                }
            }
            if (changeCount == 0) break;
        }
    }
}
