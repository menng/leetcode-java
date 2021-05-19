package org.aaron.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuickSort {
    public static void quickSort(int[] s, int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                // 从右向左找第一个小于x的数
                while (i < j && s[j] >= x)
                    j--;
                if (i < j)
                    s[i++] = s[j];

                // 从左向右找第一个大于等于x的数
                while (i < j && s[i] < x)
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quickSort(s, l, i - 1);
            quickSort(s, i + 1, r);
        }
    }

    public static void quickSort2(int[] s, int low, int high) {
        if (low < high) {
            int tmp = s[low];
            int left = low;
            int right = high;
            while (left < right) {
                while (left < right && s[right] >= tmp) {
                    right--;
                }

                if (left < right) {
                    s[left] = s[right];
                    left++;
                }

                while (left < right && s[left] < tmp) {
                    left++;
                }

                if (left < right) {
                    s[right] = s[left];
                    right--;
                }
            }

            s[left] = tmp;
            int index = left;

            quickSort2(s, low, index - 1);
            quickSort2(s, index + 1, high);
        }
    }

    public static void quickSort3(int[] s, int low, int high) {
        if (low < high) {
            int tmp = s[low];
            int left = low;
            int right = high;
            while (left < right) {
                while (left < right && s[right] > tmp) {
                    right--;
                }

                if (left < right) {
                    s[left] = s[right];
                    left++;
                }

                while (left < right && s[left] < tmp) {
                    left++;
                }

                if (left < right) {
                    s[right] = s[left];
                    right--;
                }
            }

            int index = left;
            s[left] = tmp;

            quickSort3(s, low, index - 1);
            quickSort3(s, index + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] t = new int[]{6, 5, 4, 3, 2, 1};
        quickSort3(t, 0, t.length - 1);

        System.out.println(Arrays.toString(t));
    }
}
