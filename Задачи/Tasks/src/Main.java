import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,5};
        System.out.println(isHasDuplicated(arr));
        System.out.println(hasDuplicated(arr));
    }

    private static boolean hasDuplicated(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true; // обнаружен дубликат
                }
            }
        }
        return false; // дубликаты не найдены
    }

    private static boolean isHasDuplicated ( int[] arr){
        Set<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i])) {
                    return true;
                }
                set.add(arr[i]);
            }
            return false;
        }

}
