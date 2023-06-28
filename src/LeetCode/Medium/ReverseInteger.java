package LeetCode.Medium;

/**
 * ReverseInteger
 * <a href="https://leetcode.com/problems/reverse-integer/">...</a>
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-28
 */
public class ReverseInteger {
    public static int reverse(int x) {
        if (x == -2147483648) {
            return 0;
        }
        int y = x < 0 ? -x : x;
        String str = String.valueOf(y);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        long z = Long.parseLong(sb.toString());
        int a = z > Integer.MAX_VALUE ? 0 : (int) z;
        return x < 0 ? -a : a;
    }

    public static void main(String[] args) {
        int i = -2147483648;
        System.out.println(-i);
    }
}
