package org.aaron.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class HasCycle141 {
    /**
     * 哈希遍历
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null) {
            if(!set.add(head)) {
                return true;
            }

            head = head.next;
        }
        return false;
    }
}
