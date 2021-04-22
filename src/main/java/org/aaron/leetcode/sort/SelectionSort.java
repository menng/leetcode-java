package org.aaron.leetcode.sort;

public class SelectionSort {
    public static void selectionSort(int[] s){
        for (int i=0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                // 控制排序顺序，这里是升序排列
                if (s[i] > s[j]) {
                    int tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] s = new int[]{6, 5, 3, 2, 4};
        selectionSort(s);
        for (int j : s) {
            System.out.println(j);
        }
    }
}
