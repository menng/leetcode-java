package org.aaron.leetcode.algorithm;

/**
 * 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement26 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        removeElement(nums, 3);
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
