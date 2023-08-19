package TABA.Question3;

/**
 * Validator
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class Validator {
    public static boolean validate(String text) {
        // Split text into array
        String[] textArr = text.split(" ");
        Stack stack = new Stack();

        for (String str : textArr) {
            if (str.equals("\\begin")) {
                stack.push("begin");
            }

            if (str.equals("\\end")) {
                String tag = stack.pop();
                // If there is no begin tag, return false
                if (tag == null) {
                    return false;
                }
            }
        }

        // Whether there is no begin tag in the stack
        return stack.size() == 0;
    }
}
