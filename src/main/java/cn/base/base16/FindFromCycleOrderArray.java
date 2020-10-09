package cn.base.base16;

/**
 * 从循环有序数组中查找
 * 如[4,5,6,1,2,3]
 * 解题思路：
 *      我们发现循环数组存在一个性质：以数组中间点为分区，会将数组分成一个有序数组和一个循环有序数组。
 *
 *      如果首元素小于 mid，说明前半部分是有序的，后半部分是循环有序数组；
 *      如果首元素大于 mid，说明后半部分是有序的，前半部分是循环有序的数组；
 *      如果目标元素在有序数组范围中，使用二分查找；
 *      如果目标元素在循环有序数组中，设定数组边界后，使用以上方法继续查找。
 *
 *      时间复杂度为 O(logN)。
 */
public class FindFromCycleOrderArray {
    public int findInCycle(int[] nums, int target) {
        return findInCycle(nums, 0, nums.length - 1, target);
    }

    private int findInCycle(int[] nums, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > nums[start]) {
            int index = binaryFind(nums, start, end, target);
            if (index != -1) return index;
            else return findInCycle(nums, mid + 1, end, target);
        } else {
            int index = binaryFind(nums, mid, end, target);
            if (index != -1) return index;
            else return findInCycle(nums, start, mid - 1, target);
        }
    }

    private int binaryFind(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
