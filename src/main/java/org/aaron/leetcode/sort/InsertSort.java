package org.aaron.leetcode.sort;

/**
 * 插入排序
 */
public class InsertSort {
    public static void insertSort(int[] s){
        int tmp;
        for(int i=1; i < s.length; i++) {
            tmp = s[i];
            int j;
            for(j=i-1; j>=0 && s[j] > tmp; j--) {
                s[j+1] = s[j];
            }

            s[j+1] = tmp;
        }
    }

    public static void insertSort2(int[] s){
      for(int i=1; i < s.length; i++) {
          int value = s[i];
          int j = i - 1;
          for(; j >= 0; j--) {
              if (s[j] > value) {
                  s[j+1] = s[j];
              } else {
                  break;
              }
          }

          s[j+1] = value;
      }
    }

    public static void main(String[] args) {
        int[] s = new int[]{5, 4, 3, 2, 1};
        int[] t = new int[]{5, 4, 3, 2, 1};
        insertSort(s);
        insertSort2(t);
        for (int i=0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println("--------------");
        for (int i=0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }
}
