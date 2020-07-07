package org.aaron.leetcode.structure;

import javax.swing.tree.TreeNode;

/**
 * tree traversal 树的遍历
 */
public class TreeTraversal {

    /**
     * 前序遍历，根 - 左 - 右
     *
     * @param node
     */
    public static void preOrder(BinaryTree node) {
        System.out.println(node.value);

        BinaryTree left = node.left;
        if (left != null) {
            preOrder(left);
        }

        BinaryTree right = node.right;
        if (right != null) {
            preOrder(right);
        }

    }

    public static void main(String[] args) {
        BinaryTree[] node = new BinaryTree[10];
        for (int i = 0; i < 10; i++) {
            node[i] = new BinaryTree(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 10)
                node[i].right = node[i * 2 + 2];
        }

        preOrder(node[0]);
    }
}

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
        this.value = value;
    }
}