package org.aaron.leetcode.algorithm;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 */
public class TopKFrequent347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for(int i : nums) {
            occurrences.put(i, occurrences.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if(queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            } else {
                queue.offer(new int[]{num, count});
            }
        }

        int[] ret = new int[k];
        for(int i=0; i < k; i++) {
            ret[i] = queue.poll()[0];
        }

        return ret;
    }

    public static int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            } else {
                queue.offer(new int[]{num, count});
            }
        }

        int[] ret = new int[k];
        for(int i=0; i < k; i++) {
            ret[i] = queue.poll()[0];
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ret = topKFrequent(nums, k);
        for(int i : ret) {
            System.out.println(i);
        }
    }
}
