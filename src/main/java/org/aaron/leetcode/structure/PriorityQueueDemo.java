package org.aaron.leetcode.structure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 优先队列 PriorityQueue
 * PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法时，返回的总是优先级最高的元素。
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1265120632401152
 * 要使用PriorityQueue，就需要给每个元素定义优先级。
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("apple");
        queue.offer("pear");
        queue.offer("banana");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.remove());


//        queue.add("a");
//        queue.add("e");
//        queue.add("c");
//
//        System.out.println(queue);
//        System.out.println(queue.size());
//
//        queue.forEach(a -> System.out.println(a));
//
//        Iterator<String> iterator = queue.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
