package org.aaron.leetcode.structure;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 优先队列 PriorityQueue
 * PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法时，返回的总是优先级最高的元素。
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1265120632401152
 * 要使用PriorityQueue，就需要给每个元素定义优先级。
 */
public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>((o1, o2) -> {
            if (o1.number.charAt(0) == o2.number.charAt(0)) {
                return Integer.valueOf(o1.number.substring(1)).compareTo(Integer.valueOf(o2.number.substring(1)));
            }

            if (o1.number.charAt(0) == 'V') {
                return -1;
            }

            return 1;
        });
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Aaron", "A10"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number='" + number + '\''
                ;
    }
}