public class Tester {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int x = 0;
        int y = 10;
        int sum = x + y;
        if (x > y) {
            x = 100;
        } else {
            y = y + 50;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}