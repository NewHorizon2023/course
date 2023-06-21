package FreePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * HexadecimalConversion
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-21
 */
public class HexadecimalConversion {
    private static final String PATTERN = "^[0-9A-Fa-f]+$";

    private static final Map<Character, Integer> HEX_TO_DECIMAL_MAP = new HashMap<>();

    static {
        int value = 10;
        for (char i = 'a'; i <= 'f'; i++) {
            HEX_TO_DECIMAL_MAP.put(i, value);
            value++;
        }
        value = 10;
        for (char i = 'A'; i <= 'F'; i++) {
            HEX_TO_DECIMAL_MAP.put(i, value);
            value++;
        }

    }

    /**
     * Convert hexadecimal number to decimal
     *
     * @param hex
     * @return
     */
    public static int HexToDec(String hex) {
        Pattern regexPattern = Pattern.compile(PATTERN);
        Matcher matcher = regexPattern.matcher(hex);

        if (!matcher.find()) {
            throw new IllegalArgumentException();
        }

        int index = 0;
        int total = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int value = Character.isDigit(c) ? Character.getNumericValue(c) : HEX_TO_DECIMAL_MAP.get(c);
            total = total + value * ((int) Math.pow(16, index));
            index++;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(HexToDec("3039"));
    }
}
