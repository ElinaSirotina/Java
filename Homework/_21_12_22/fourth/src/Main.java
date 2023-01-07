import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Supplier<Stream<String>> stream =()-> Stream.of("we", "wee", "qwer", "oooo", "ooooo");
        int maxLong = stream.get().max(Comparator.comparingInt(String::length)).get().length();
        stream.get().filter(s -> s.length() == maxLong).forEach(System.out::println);
    }
}
