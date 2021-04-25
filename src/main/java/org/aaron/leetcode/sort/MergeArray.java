package org.aaron.leetcode.sort;

/**
 * 合并两个有序数组
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1,4,6,9};
        int[] b = {2};
        int length = a.length + b.length;
        int[] c = new int[length];

        merge(a, b, c, length);

        for(int i : c) {
            System.out.println(i);
        }

    }

    public static void merge(int[] nums1 , int[] nums2 , int [] c, int length){
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                c[k++] = nums2[j];
                j++;
            } else if (nums1[i] < nums2[j]) {
                c[k++] = nums1[i];
                i++;
            }
        }

        if (i < nums1.length) {
            while (k < length) {
                c[k++] = nums1[i++];
            }
        }

        if (j < nums2.length) {
            while (k < length) {
                c[k++] = nums2[j++];
            }
        }
    }
}
