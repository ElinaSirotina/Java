public class Main {
    public static void main(String[] args) {
        int[] nums = {3,7,11,15};
        int[] res = twoSum(nums, 9);

        int[] nums2 = {2,7,11,15};
        int[] res2 = twoSum(nums2, 9);
    }

    public static int[] twoSum(int[] nums, int target) { // 3 3
        int[] arr = new int[2];
        for(int i = 0; i < nums.length - 1; i++) { // i = 0
            for(int j = i + 1; j < nums.length; j++) { // i = 0; j = 1
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        if(arr[0] == 0 && arr[1] == 0) {
            System.out.println("Net");
        }
        return arr;
    }
}
