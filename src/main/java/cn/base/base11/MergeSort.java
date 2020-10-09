package cn.base.base11;

public class MergeSort {
    public void mergeSort(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0,nums.length - 1);
    }

    private void mergeSort(int[] nums, int[] temp, int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        mergeSort(nums, temp, start, mid);
        mergeSort(nums, temp, mid + 1, end);
        merge(nums, temp, start, mid, end);
    }

    private void merge(int[] nums, int[] temp, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int index = start;
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[index++] = nums[i++];
            } else {
                temp[index++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = nums[i++];
        }
        while (j <= end) {
            temp[index++] = nums[j++];
        }
        for (int k = start; k <= end; k++) {
            nums[k] = temp[k];
        }
    }
}
