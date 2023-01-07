import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        int[] test = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};

        //Arrays.stream(arr) == stream
        Stream<Integer> stream = Stream.of(1,1,2,2,3,3,4,4,5);
        Stream<Integer> stream1 = Stream.of(5,6,6,7,7,8,8,9,9);
    }
}
