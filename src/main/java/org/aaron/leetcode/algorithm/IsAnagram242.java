package org.aaron.leetcode.algorithm;

import java.util.Arrays;

public class IsAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);

        return chars.equals(chars1);
    }
}
