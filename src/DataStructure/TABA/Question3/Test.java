package DataStructure.TABA.Question3;

/**
 * Test
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class Test {
    public static void main(String[] args) {
        String text1Right = "\\begin Data Structure Course \\end"; // true
        String text1Wrong = "\\begin Data Structure Course"; // false

        String text2Right = "\\begin Data structures are organizational \\begin formats that store and manage data \\begin for efficient processing. \\end They define how data is stored, \\end accessed, \\end and manipulated, enabling streamlined operations. \\begin Examples include arrays, lists, trees, and graphs. Choosing the right structure enhances algorithm efficiency and application performance in software development. \\end"; // true

        String text2Wrong = "Data structures are organizational \\begin formats that store and manage data \\begin for efficient processing. \\end They define how data is stored, \\end accessed, \\end and manipulated, enabling streamlined operations. \\begin Examples include arrays, lists, trees, and graphs. Choosing the right structure enhances algorithm efficiency and application performance in software development. \\end"; // false

        System.out.println("The validation of text1Right is: " + Validator.validate(text1Right));
        System.out.println("The validation of text1Wrong is: " + Validator.validate(text1Wrong));
        System.out.println("The validation of text2Right is: " + Validator.validate(text2Right));
        System.out.println("The validation of text2Wrong is: " + Validator.validate(text2Wrong));
    }
}
