package org.aaron.leetcode.algorithm;

/**
 * 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
class Solution {
    public LinkedListNode mergeTwoLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode preHead = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                preHead.next = l1;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                preHead.next = l2;
                l2 = l2.next;
            }
            preHead = preHead.next;
        }

        preHead.next = l1 == null ? l2 : l1;

        return dummy.next;
    }
}


class ListNode {
    int val;
    LinkedListNode next;

    ListNode() { }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }
}
