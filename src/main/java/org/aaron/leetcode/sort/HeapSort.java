package org.aaron.leetcode.sort;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i, nums.length);
        }

        for (int j = nums.length - 1; j > 0; j--) {
            swap(nums, 0, j);
            adjustHeap(nums, 0, j);
        }
    }

    private static void adjustHeap(int[] nums, int i, int length) {
        int tmp = nums[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && nums[k + 1] > nums[k]) {
                k = k + 1;
            }

            if (nums[k] > tmp) {
                nums[i] = nums[k];
                i = k;
            } else {
                break;
            }
        }

        nums[i] = tmp;
    }

    private static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
