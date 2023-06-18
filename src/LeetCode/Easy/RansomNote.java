package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Ransom Note
 * <a href="https://leetcode.com/problems/ransom-note/?envType=featured-list&envId=challenges-for-new-users">...</a>
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-17
 */
public class RansomNote {
    private static Map<Character, Integer> map = new HashMap<>();

    static {
        int i = 0;
        for (char key = 'a'; key <= 'z'; key++) {
            map.put(key, i);
            i++;
        }
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[map.get(magazine.charAt(i))]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = map.get(ransomNote.charAt(i));
            if (arr[index] == 0) {
                return false;
            }
            arr[index]--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}
