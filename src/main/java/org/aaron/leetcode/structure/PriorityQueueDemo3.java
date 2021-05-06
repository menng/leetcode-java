package org.aaron.leetcode.structure;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 优先队列 PriorityQueue
 * PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法时，返回的总是优先级最高的元素。
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1265120632401152
 * 要使用PriorityQueue，就需要给每个元素定义优先级。
 */
public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        Queue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        q.offer(new int[]{1, 3});
        q.offer(new int[]{2, 9});
        q.offer(new int[]{3, 7});
        q.offer(new int[]{4, 5});
        System.out.println(q.poll()[1]);
        System.out.println(q.poll()[1]);
        System.out.println(q.poll()[1]);
        System.out.println(q.poll()[1]);
    }
}
