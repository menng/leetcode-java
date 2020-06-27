package org.aaron.leetcode.structure;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        deque.push("d");

        System.out.println(deque.peek());
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);


        Deque<String> newDepue = new LinkedList<>();
        newDepue.addFirst("a");
        newDepue.addFirst("b");
        newDepue.addFirst("c");
        newDepue.addFirst("d");

        System.out.println(newDepue.peekFirst());
        System.out.println(newDepue);

        while (newDepue.size() > 0) {
            System.out.println(newDepue.pollFirst());
        }

        System.out.println(newDepue);

    }
}
