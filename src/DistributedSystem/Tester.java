public class Tester {
    public static void main(String[] args) {
        long begin = System.nanoTime();
        int x = 0;
        int y = 10;
        int sum = x + y;
        if (x > y) {
            x = 100;
        } else {
            y = y + 50;
        }
        long end = System.nanoTime();
        System.out.println(end - begin);
    }
}