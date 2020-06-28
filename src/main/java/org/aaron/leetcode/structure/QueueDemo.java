package org.aaron.leetcode.structure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");

//        System.out.println(queue.poll());
//        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
