package org.aaron.leetcode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组分割成多段，每段k个一组
 * origin: [1, 2, 3, 4, 5, 6, 7, 8]    k = 3
 * expect: [[1, 2, 3], [4, 5, 6], [7, 8]]
 */
public class ArrayPartition {

    public static List<List<Integer>> partition(List<Integer> list, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int size = list.size();

        List<Integer> item = new ArrayList<>();
        for(int i=0; i < size; i++) {
            int c = (i + 1) % k;
            if (c != 0) {
                item.add(list.get(i));
            } else {
                item.add(list.get(i));
                res.add(item);

                item = new ArrayList<>();
            }
        }

        if (!item.isEmpty()) {
            res.add(item);
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int k1 = 3;
        List<List<Integer>> result1 = partition(list, k1);
        //expect: [[1, 2, 3], [4, 5, 6], [7, 8]]
        System.out.println(Arrays.toString(result1.toArray()));

         int k2 = 4;
         List<List<Integer>> result2 = partition(list, k2);
         //expect: [[1, 2, 3, 4], [5, 6, 7, 8]]
         System.out.println(Arrays.toString(result2.toArray()));
    }
}
