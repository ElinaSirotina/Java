import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Read {
    public static  void read(){
        Path path = Paths.get("C://Users//Элина//Desktop//Programming//TelRan//Java//Card//src//info.txt");
        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
            System.out.println("Данные из файла--->>>");
            stream.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
