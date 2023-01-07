package nitro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("abc");
        list.add("aw");

        for (String s: list) {
            System.out.println(s);
        }
    }
}
