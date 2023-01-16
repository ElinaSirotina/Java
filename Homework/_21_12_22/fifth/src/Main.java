import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        try {
            String[] strings = FReader.readFile("text.txt", StandardCharsets.UTF_8).split("\n");
            Collections.addAll(phones, strings);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        phones.stream()
                .filter(p->p.length()<12)
                .sorted() // сортировка по возрастанию
                .forEach(s->System.out.println(s));
    }
}
