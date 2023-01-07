import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(recFibbonachi(11));
        fib(11);
        streamFibbonchi(11);
    }

    public static int recFibbonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recFibbonachi(n - 1) + recFibbonachi(n - 2);
        }
    }

    public static void streamFibbonchi(long num) {
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]})
                .limit(num)
                .map(y -> y[0])
                .forEach(x -> System.out.println(x));
    }

    public static void fib(int N) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for(int i = 3; i <= N; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

}
