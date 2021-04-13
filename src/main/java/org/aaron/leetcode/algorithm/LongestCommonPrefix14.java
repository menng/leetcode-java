package org.aaron.leetcode.algorithm;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (String str : strs) {
            while (!str.startsWith(res)) {
                res = res.substring(0, res.length() - 1);
                if (res.isEmpty()) {
                    return "";
                }
            }
        }
        return res;
    }

    /**
     * 以此比较前后两个字符串，得出前缀后，继续比较，直到得出结果。
     * @param strs
     * @return
     */
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for(int i=1; i < strs.length; i++) {
            prefix = longcp(prefix, strs[i]);
            if (prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }

    private static String longcp(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int idx = 0;
        while(idx < length && str1.charAt(idx) == str2.charAt(idx)) {
            idx++;
        }

        return str1.substring(0, idx);
    }


    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abc", "ab", "abcd"}));
        System.out.println(longestCommonPrefix(new String[]{"abc", "cd", "ef"}));
        System.out.println(longestCommonPrefix2(new String[]{"abc", "cd", "ef"}));
    }
}
