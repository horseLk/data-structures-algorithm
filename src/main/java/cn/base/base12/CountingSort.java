package cn.base.base12;

/**
 * 计数排序
 */
public class CountingSort {
    public void countingSort(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int m = max - min + 1;
        int count[] = new int[m];
        for (int num : nums) {
            count[num - min]++;
        }
        for (int i = 1; i < m; i++) {
            count[i] += count[i - 1];
        }
        int res[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = nums[i] - min;
            res[--count[index]] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
