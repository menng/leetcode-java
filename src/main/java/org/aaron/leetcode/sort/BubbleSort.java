package org.aaron.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] s) {
        int length = s.length;
        // length - 1次
        for(int i = 0; i < length - 1; i++) {
            // 减去i，可以把已排序的排除
            for(int j=0; j < length - 1 - i; j++) {
                if (s[j] > s[j+1]) {
                    int tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }

        return s;
    }

    public static void main(String[] args) {
        int[] s = new int[]{5, 4, 3, 2, 1};
        bubbleSort(s);
        for(int i=0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
