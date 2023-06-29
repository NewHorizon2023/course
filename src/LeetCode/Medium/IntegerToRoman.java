package LeetCode.Medium;

/**
 * IntegerToRoman
 * <a href="https://leetcode.com/problems/integer-to-roman/">...</a>
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-28
 */
public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i = num / 1000;
        if (i != 0) {
            sb.append("M".repeat(i));
            num = num - i * 1000;
        }

        i = num / 100;
        switch (i) {
            case 9 -> sb.append("C").append('M');
            case 5, 6, 7, 8 -> sb.append('D').append("C".repeat(i - 5));
            case 4 -> sb.append("C").append('D');
            default -> sb.append("C".repeat(i));
        }
        num = num - i * 100;

        i = num / 10;
        switch (i) {
            case 9 -> sb.append("X").append('C');
            case 5, 6, 7, 8 -> sb.append('L').append("X".repeat(i - 5));
            case 4 -> sb.append("X").append('L');
            default -> sb.append("X".repeat(i));
        }
        i = num - i * 10;

        switch (i) {
            case 9 -> sb.append("I").append('X');
            case 5, 6, 7, 8 -> sb.append('V').append("I".repeat(i - 5));
            case 4 -> sb.append("I").append('V');
            default -> sb.append("I".repeat(i));
        }

        return sb.toString();
    }

    public static String intToRoman2(int num) {
        StringBuilder sb = new StringBuilder();
        int i = num / 1000;
        if (i != 0) {
            sb.append("M".repeat(i));
            num = num - i * 1000;
        }

        i = num / 100;
        build(sb, i, "C", 'M', 'D');
        num = num - i * 100;

        i = num / 10;
        build(sb, i, "X", 'C', 'L');
        i = num - i * 10;

        build(sb, i, "I", 'X', 'V');

        return sb.toString();
    }

    private static void build(StringBuilder sb, int i, String str, char c1, char c2) {
        switch (i) {
            case 9 -> sb.append(str).append(c1);
            case 5, 6, 7, 8 -> sb.append(c2).append(str.repeat(i - 5));
            case 4 -> sb.append(str).append(c2);
            default -> sb.append(str.repeat(i));
        }
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman2(1994));
    }
}
