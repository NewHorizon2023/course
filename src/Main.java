import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int i = -123;
        String str = String.valueOf(i);
        String k = "0123-";
        System.out.println(Integer.parseInt(k));

        List list = new ArrayList<>();
        list.add(123);
        list.add("abc");
        System.out.println(list);
    }
}