package cn.base.base15;

/**
 * 二分查找的递归与非递归实现
 */
public class BinarySearch {
    public int binarySearchNonRecursion(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public int binarySearchByRecursion(int[] nums, int target) {
        return binarySearchByRecursion(nums, 0, nums.length - 1, target);
    }

    private int binarySearchByRecursion(int[] nums, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (target == nums[mid]) return mid;
        else if (nums[mid] > target)
            return binarySearchByRecursion(nums, start, mid - 1, target);
        else
            return binarySearchByRecursion(nums, mid + 1, end, target);
    }
}
