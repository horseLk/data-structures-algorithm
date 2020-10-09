package cn.base.base16;

/**
 * 查找第一个大于等于给定值的元素
 */
public class FindLargerNumber {
    public int findLargerNumber(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                if (mid == 0 || nums[mid - 1] < target) return mid;
                else right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
