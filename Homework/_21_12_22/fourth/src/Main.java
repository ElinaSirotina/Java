import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            String[] strings = FReader.readFile("text.txt", StandardCharsets.UTF_8).split(" ");
            Supplier<Stream<String>> stream = () -> Stream.of(strings);
            int maxLong = stream.get().max(Comparator.comparingInt(String::length)).get().length();
            stream.get().filter(s -> s.length() == maxLong).forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
