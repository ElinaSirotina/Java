import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

        public static void main(String[] args) {
            //1236 5478 9654 1258 12/54 655
            String card = "12365478965412581254655";
            Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
            Matcher matcher = pattern.matcher(card);
            String cardString = matcher.replaceAll("($1)($2)($3)($4)($5)($6)($7)");


            // System.out.println(cardString);
        }
    }
