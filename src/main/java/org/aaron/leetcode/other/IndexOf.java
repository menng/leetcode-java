package org.aaron.leetcode.other;

/**
 * 实现indexOf
 */
public class IndexOf {
    public static void main(String[] args) {
        String[][] strs = {
                {"abcdef", "cde"},
                {"abcdef", "cdf"},
                {"abcdef", "aaaaaaa"},
                {"aaabcde", "aab"},
                {"aaabcde", "aaabcdecde"}
        };

        for (int i = 0; i < strs.length; i++) {
            String p = strs[i][0];
            String c = strs[i][1];
            int result = indexOf(p.toCharArray(), c.toCharArray());
            if (result != p.indexOf(c)) {
                System.out.println("Error! p = " + p + ", c = " + c + ", your result is " + result);
            } else {
                System.out.println("Passed!");
            }
        }

    }

    //  {"abcdef", "cde"},
    private static int indexOf(char[] p, char[] c) {
        if (c.length > p.length) {
            return -1;
        }

        for (int i=0; i < p.length; i++) {
            int flat = 0;
            for (int j=0; j < c.length; j++) {
                if (p[i + j] == c[j]) {
                    flat++;
                } else {
                    break;
                }

                if (flat == c.length) {
                    return i;
                }
            }
        }

        return -1;
    }
}
