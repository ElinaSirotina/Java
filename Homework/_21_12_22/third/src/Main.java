import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            String ss = FReader.readFile("text.txt", StandardCharsets.UTF_8);
            System.out.printf("%d", ss.chars()
                    .filter(Character::isLetter)
                    .filter(c -> c - Character.toLowerCase(c) == 0)
                    .count());
            System.out.println();
            System.out.printf("%d", ss.chars()
                    .filter(Character::isLetter)
                    .filter(c -> c - Character.toUpperCase(c) == 0)
                    .count());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
