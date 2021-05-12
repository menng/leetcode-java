package org.aaron.leetcode.other;

/**
 * 数组左边减去右边数值的最大差值
 * [1,3,5,9,0] 结果：9
 */
public class MaxDValue {
    public static void main(String[] args) {
//        int[] nums = {1, 4, 9, 2, -2, -1};
        int[] nums = {1, 2, 3, 4, 5, 6};
//        int[] nums = {6, 5, 4, 3, 2, 1};
//        int[] nums = {0, 1};
        System.out.println(solution(nums));
        System.out.println(solution2(nums));
    }

    public static int solution(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(nums[i] - nums[j], max);
            }
        }

        return max;
    }

    public static int solution2(int[] nums) {
        int n = nums.length;
        int max = nums[n - 2] - nums[n - 1];
        int min = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] <= min) {
                min = nums[i];
            } else {
                max = Math.max(max, nums[i] - min);
            }
        }

        return max;
    }
}
