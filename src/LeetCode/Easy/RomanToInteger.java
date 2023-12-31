package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 * <a href="https://leetcode.com/problems/roman-to-integer/?envType=featured-list&envId=challenges-for-new-users">...</a>
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-17
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            int next = ((i + 1) == s.length()) ? 0 : map.get(s.charAt(i + 1));
            if (current >= next) {
                value = value + current;
            } else {
                value = value - current;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        //System.out.println(map.get('a'));
        System.out.println(romanToInt("MMCDXLV"));
    }
}
