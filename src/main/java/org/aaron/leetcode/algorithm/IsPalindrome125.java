package org.aaron.leetcode.algorithm;

/**
 * 125. 验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/
 */
public class IsPalindrome125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i=0; i < length; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        StringBuilder reverse = new StringBuilder(sb.reverse()).reverse();

        return reverse.toString().equals(sb.toString());
    }

    public boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i=0; i < length; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int newLength = sb.length();
        int head = 0;
        int tail = newLength - 1;
        while (head < tail) {
            if (Character.toLowerCase(sb.charAt(head)) != Character.toLowerCase(sb.charAt(tail))) {
                return false;
            }

            head++;
            tail--;
        }

        return true;
    }

    public boolean isPalindrome3(String s) {
        int length = s.length();
        int left = 0;
        int right = length - 1;
        while (left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        IsPalindrome125 is = new IsPalindrome125();
        System.out.println(is.isPalindrome3("A man, a plan, a c2anal: Panama"));
    }
}
