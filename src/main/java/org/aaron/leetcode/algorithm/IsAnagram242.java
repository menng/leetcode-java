package org.aaron.leetcode.algorithm;

public class IsAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        sort(chars);
        sort(chars1);

        return String.valueOf(chars).equals(String.valueOf(chars1));
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] all = new int[26];
        for(int i=0; i < s.length(); i++) {
            all[s.charAt(i) - 'a']++;
            all[t.charAt(i) - 'a']--;
        }

        for(int i=0; i < 26; i++) {
            if (all[i] < 0) {
                return false;
            }
        }

        return true;
    }

    public void sort(char[] ch) {
        int size = ch.length;
        for (int i=0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if (ch[i] > ch[j]) {
                    char tmp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new IsAnagram242().isAnagram("anagram", "nagaram"));;
        System.out.println(new IsAnagram242().isAnagram2("anagram", "nagaram"));;
        System.out.println('z' - 'a');
    }
}
