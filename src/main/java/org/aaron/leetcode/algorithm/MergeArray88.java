package org.aaron.leetcode.algorithm;

/**
 * 88. 合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class MergeArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 || j >= 0) {
            if (i == -1) {
                nums1[k--] = nums2[j--];
            } else if (j == -1) {
                nums1[k--] = nums1[i--];
            } else if(nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

}
