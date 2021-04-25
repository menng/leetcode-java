package org.aaron.leetcode.other;

/**
 * 把数组首尾弄成环，给定数字N，求N个元素的最大值。
 */
public class ArrayCicleMaxValue {

    public static int solution(int[] nums, int n) {
        int [] newNums = new int[nums.length + n - 1];
        int length = nums.length;
        int max = 0;
        // copy
        for(int i=0; i < length; i++) {
            newNums[i] = nums[i];
        }

        // 补成环
        for (int i=0; i < n - 1; i++) {
            newNums[length + i] = nums[i];
        }

        // 计算最大值
        for(int i = 0; i < newNums.length - n + 1; i++) {
           int newMax = calcMax(newNums, i, i + n);
           if (newMax > max) {
               max = newMax;
           }
        }

        return max;
    }

    public static int calcMax(int[] nums, int start, int end) {
        int total = 0;
        for(int i = start; i < nums.length && i < end; i++) {
            total = total + nums[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 9, -1, 2, 20};
        int n = 4;
        System.out.println(solution(nums, n));
    }
}
