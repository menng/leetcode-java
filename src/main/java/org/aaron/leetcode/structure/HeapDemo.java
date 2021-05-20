package org.aaron.leetcode.structure;

import java.nio.channels.IllegalChannelGroupException;
import java.util.ArrayList;
import java.util.List;

/**
 * 堆
 */
public class HeapDemo {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.add(6);
        maxHeap.add(7);
        maxHeap.extractMax();
        List<Integer> data = maxHeap.getData();
        for(Integer i : data) {
            System.out.println(i);
        }
    }
}

class MaxHeap {
    private List<Integer> data;

    public List<Integer> getData() {
        return data;
    }

    public MaxHeap() {
        data = new ArrayList<>();
    }

    public int getSize() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 获取父节点索引
     */
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("");
        }

        return (index - 1) / 2;
    }

    /**
     * 获取左子节点索引
     */
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    /**
     * 获取右子节点索引
     */
    private int rightChild(int index) {
        return index * 2 + 2;
    }

    /**
     * 上浮
     * @param k
     */
    private void siftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            swap(parent(k), k);
            k = parent(k);
        }
    }

    private void swap(int i, int j) {
        Integer tmp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, tmp);
    }

    public void add(Integer e) {
        data.add(e);
        siftUp(data.size() - 1);
    }

    public Integer findMax() {
        if (data.size() == 0) {
            throw new IllegalArgumentException("");
        }

        return data.get(0);
    }

    /**
     * 下沉
     * @param k
     */
    private void siftDown(int k) {
        while (leftChild(k) < data.size()) {
            int j = leftChild(k);
            if (j + 1 < data.size() && data.get(j+1).compareTo(data.get(j)) > 0) {
                j = rightChild(k);
//                j = j + 1;
            }

            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }

            swap(k, j);
            k = j;
        }
    }

    public Integer extractMax() {
        int ret = findMax();
        swap(0, data.size() - 1);
        data.remove(data.size() - 1);
        siftDown(0);

        return ret;
    }
}
