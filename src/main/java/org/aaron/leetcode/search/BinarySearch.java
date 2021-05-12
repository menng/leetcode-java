package org.aaron.leetcode.search;

/**
 * 704. 二分查找
 * https://leetcode-cn.com/problems/binary-search/
 * 给定一个个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class BinarySearch {

    public static int solution3(int[] nums, int target) {
        int low = 0;
        int height = nums.length - 1;
        while(low <= height) {
            int mid = (low + height) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(solution3(nums, target));
    }
}
