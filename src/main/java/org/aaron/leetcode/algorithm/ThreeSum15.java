package org.aaron.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 15. 三数之和
 * https://leetcode-cn.com/problems/3sum/
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum15 {
    /**
     * 在leetcode会超时
     * @param sums
     * @return
     */
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


    public static List<List<Integer>> treeSum2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for(int first =0; first < n; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int third = n - 1;
            int target = -nums[first];
            for(int second = first + 1; second < n; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }

                if (second == third) {
                    break;
                }

                if (nums[second] + nums[third] == target) {
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[first]);
                    a.add(nums[second]);
                    a.add(nums[third]);

                    res.add(a);
                }
            }

        }


        return res;
    }

    public static List<List<Integer>> treeSum3(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for(int first = 0; first < n; first++) {
            if (nums[first] > 0) {
                break;
            }

            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int left = first + 1;
            int right = n - 1;

            while (left < right) {
                if (nums[first] + nums[left] + nums[right] == 0) {
                    res.add(Arrays.asList(nums[first], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (nums[first] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[first] + nums[left] + nums[right] < 0) {
                    left ++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
//        int[] nums = new int[]{0,0,0};
//        List<List<Integer>> res = treeSum2(nums);
        List<List<Integer>> res = treeSum3(nums);
        for(List<Integer> list: res) {
            list.forEach(System.out::println);
        }
    }
}
