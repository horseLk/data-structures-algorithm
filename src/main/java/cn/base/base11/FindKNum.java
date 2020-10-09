package cn.base.base11;

import java.util.NoSuchElementException;

public class FindKNum {
    public int findNoKNum(int[] nums, int k) {
        if (k <= 0 || k > nums.length) throw new IllegalArgumentException();
        return findNoKNum(nums, 0, nums.length - 1, k);
    }

    private int findNoKNum(int[] nums, int start, int end, int k) {
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
            nums[s] = tk;
        }
        if (nums.length - k == s) {
            return tk;
        } else if (nums.length - k > s) {
            return findNoKNum(nums, s + 1, end, k);
        }
        return findNoKNum(nums, start, s - 1, k);
    }
}
