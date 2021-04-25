package org.aaron.leetcode.other;

/**
 * 打印等边三角形
 *    *
 *   * *
 *  * * *
 */
public class PrintAsterisk {
    public int solution(int n) {
        print(n, n);
        return 1;
    }

    private void print(int n, int n2) {
        if (n < 1) {
            return;
        }

        // 打印*号
        printAsterisk(n, n2);

        // 继续
        print(n-1, n2);
    }

    /**
     * @param n  第几行
     * @param n2 总行数
     */
    public void printAsterisk(int n, int n2) {
        // 该行*的数量
        int num = n2 - n + 1;
        for(int j =0; j < n2-num; j++) {
            System.out.print(" ");
        }
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new PrintAsterisk().solution(6);
    }
}
