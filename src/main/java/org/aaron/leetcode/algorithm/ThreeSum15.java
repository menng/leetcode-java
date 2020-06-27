package org.aaron.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] sums) {
        if (sums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(sums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i=0; i < sums.length; i++) {
            for (int j = i+1; j < sums.length; j++) {
                for (int k = j+1; k < sums.length; k++) {
                    if (sums[i] + sums[j] + sums[k] == 0) {
                        List<Integer> list = Arrays.asList(sums[i], sums[j], sums[k]);
                        result.add(list);
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

    }
}
