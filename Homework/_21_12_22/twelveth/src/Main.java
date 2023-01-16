import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            String str = FReader.readFile("text.txt", StandardCharsets.UTF_8);
            System.out.println(ex12(str));
            System.out.println(reverse(str));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String reverse(String string) {
        return Stream.of(string)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    static String ex12(String str) {
        String[] strSplit = str.split(" ");
        String res = "";
        for(int i = strSplit.length - 1; i >= 0; i--) {
            res += strSplit[i] + " ";
        }
        return res;
    }
}
