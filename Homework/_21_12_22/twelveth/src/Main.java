import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(ex12("Hello my name is"));
        System.out.println(reverse("Hello my name is"));
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
