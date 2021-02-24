package org.aaron.leetcode.algorithm;

/**
 * 136. 只出现一次的数字
 * https://leetcode-cn.com/problems/single-number/
 */
public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i : nums) {
            num = num^nums[i];
        }

        return num;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3,2};
        System.out.println(new SingleNumber136().singleNumber(nums));
    }
}
