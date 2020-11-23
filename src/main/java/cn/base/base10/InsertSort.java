package cn.base.base10;

public class InsertSort {
    public void insertSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int cur = nums[i + 1];
            int j = i + 1;
            for (; j > 0; j--) {
                if (nums[j - 1] <= cur) {
                    break;
                }
            }
            for (int k = i + 1; k > j ; k--) {
                nums[k] = nums[k - 1];
            }
            nums[j] = cur;
        }
    }

    public void insertSort2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int cur = nums[i + 1];
            int j = i;
            while (j >= 0) {
                if (nums[j] > cur) {
                    nums[j + 1] = nums[j];
                } else {
                    nums[j + 1] = cur;
                }
                j--;
            }
        }
    }
}
