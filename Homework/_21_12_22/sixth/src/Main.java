import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{1, 5, 6, 11, 3, 15, 7, 8};
        Arrays.stream(data).forEach(e -> {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        });
    }
}
