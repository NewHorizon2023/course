package LeetCode.Medium;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * LongestSubstring
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">...</a>
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-18
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            int subCount = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (charSet.contains(c)) {
                    break;
                }
                charSet.add(c);
                subCount++;
            }

            if (subCount > count) {
                count = subCount;
            }
        }
        return count;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int ans = 1;
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
                int sz = set.size();
                ans = Math.max(ans, sz);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            Random random = new Random();
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);

        }
        String str1 = sb.toString();
        String str2 = sb.toString();

        long start1 = System.currentTimeMillis();
        int count1 = lengthOfLongestSubstring(str1);
        long end1 = System.currentTimeMillis();
        System.out.println("count: " + count1 + ", time: " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        int count2 = lengthOfLongestSubstring2(str2);
        long end2 = System.currentTimeMillis();
        System.out.println("count: " + count2 + ", time: " + (end2 - start2) + "ms");

    }
}
