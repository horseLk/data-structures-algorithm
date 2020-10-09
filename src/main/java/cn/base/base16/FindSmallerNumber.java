package cn.base.base16;

/**
 * 查找最后一个小于等于给定值的元素
 */
public class FindSmallerNumber {
    public int findSmallerNumber(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                if (mid == nums.length - 1 || nums[mid + 1] > target) return mid;
                else left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
