public class Main {
    public static void main(String[] args) {
        String ss1 = "KikJhYggfTgf";
        System.out.println(myIndexOf(ss1, 'i'));
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
