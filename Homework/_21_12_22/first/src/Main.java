import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "hello my name is my name is";
        List<String> list = Arrays.asList(str.split(" "));
        for(int i = 0; i < list.size(); i++) {
            long count = list.stream().filter(list.get(i)::equals).count();
            System.out.println(list.get(i) + " : " + count);
        }
    }
}
