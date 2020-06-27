package org.aaron.leetcode.structure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("a");
        queue.add("e");
        queue.add("c");

        System.out.println(queue);
        System.out.println(queue.size());

        queue.forEach(a -> System.out.println(a));

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
