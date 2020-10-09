package cn.base.base11;

public class QuickSort {
    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int s = start;
        int t = end;
        int tk = nums[s];
        while (s < t) {
            while (s < t && nums[t] > tk) {
                t--;
            }
            if (s < t) {
                nums[s] = nums[t];
            }
            while (s < t && nums[s] < tk) {
                s++;
            }
            if (s < t) {
                nums[t] = nums[s];
            }
        }
        nums[s] = tk;
        quickSort(nums, start, s - 1);
        quickSort(nums, s + 1, end);
    }
}
