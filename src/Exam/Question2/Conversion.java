package Exam.Question2;

import java.util.regex.Pattern;

/**
 * @author Xiangnan Liu
 * @date 2023-07-27 15:46
 */
public class Conversion {

    /**
     * Design and explanation:
     * <p>
     * By recursively converting a binary number to a decimal number,
     * the basic idea is to first convert the highest digit to a decimal number,
     * and then call this method to convert the remaining digits
     *
     * @param binary
     * @return
     */
    public static int binaryToDecimal(String binary) {
        // Check if the number is a binary number, if not, throw IllegalArgumentException.
        String binaryPattern = "^[01]+$";
        if (!Pattern.matches(binaryPattern, binary)) {
            throw new IllegalArgumentException("This number is not a binary number!");
        }

        // If the number has only one digit, convert to integer directly
        if (binary.length() == 1) {
            return Integer.parseInt(binary);
        }

        // If the number has more than one digit, convert the highest bit to binary, and add to the value of the remaining bits
        int i = Character.getNumericValue(binary.charAt(0)) * (int) Math.pow(2, binary.length() - 1);

        return i + binaryToDecimal(binary.substring(1));
    }
}
