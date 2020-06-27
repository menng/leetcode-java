package org.aaron.leetcode.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MoveZeroes283 {

    /**
     * 双指针
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int flag = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int a = nums[flag];
                nums[flag] = nums[i];
                nums[i] = a;
                flag++;
            }
        }
    }

    /**
     * 两次遍历
     * 先把非零元素往前移，最后补0
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i=0; i < nums.length; i++) {
            // 非0元素往前移
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // 补0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 0, 0, 3};
//        int[] nums = new int[] {};
//        moveZeroes(nums);
        moveZeroes2(nums);
        for (int i: nums) {
            System.out.println(i);
        }
    }
}
