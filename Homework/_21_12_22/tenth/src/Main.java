import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            String ss1 = FReader.readFile("text.txt", StandardCharsets.UTF_8);
            System.out.println(myIndexOf(ss1, 'i'));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static int myIndexOf(String str, char ch) {
        if(str == null || str == "") {
            return 0;
        }
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(ch == chars[i]) {
                return i;
            }
        }
        return 0;
    }
}
