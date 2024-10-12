package Test;

/**
 * @author 刘祥楠
 * @date 2024-10-12 19:46
 */
public class Test {
    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else {
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
