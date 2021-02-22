package org.aaron.leetcode.algorithm;

/**
 * 83. 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DeleteDuplicates83 {
    public ListNode deleteDuplicates(ListNode head) {
        // currentHead 为操作指针，用于操作head的next结点指向。
        ListNode currentHead = head;
        while (currentHead != null && currentHead.next != null) {
            if (currentHead.val == currentHead.next.val) {
                // 相等时移动两步。
                currentHead.next = currentHead.next.next;
            } else {
                // 不相等时移动一步。
                currentHead = currentHead.next;
            }
        }
        return head;
    }
}
