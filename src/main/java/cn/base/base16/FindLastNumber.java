package cn.base.base16;

/**
 * 查找最后出现的某个元素
 */
public class FindLastNumber {
    public int findLastNumber(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) return mid;
                else left = mid + 1;
            }
        }
        return -1;
    }
}
