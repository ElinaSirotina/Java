import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String str = FReader.readFile("text.txt", StandardCharsets.UTF_8);
            List<String> list = Arrays.asList(str.split(" "));
            for (int i = 0; i < list.size(); i++) {
                long count = list.stream().filter(list.get(i)::equals).count();
                System.out.println(list.get(i) + " : " + count);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            String str = FReader.readFile("text2.txt", StandardCharsets.UTF_8);
            List<String> list = Arrays.asList(str.split(" "));
            for (int i = 0; i < list.size(); i++) {
                long count = list.stream().filter(list.get(i)::equals).count();
                System.out.println(list.get(i) + " : " + count);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
