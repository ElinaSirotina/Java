public class Main {
    public static void main(String[] args) {
        String ss = "KikJhYggfTgf";
        System.out.printf("%d", ss.chars()
                .filter(Character::isLetter)
                .filter(c -> c - Character.toLowerCase(c) == 0)
                .count());
        System.out.println();
        System.out.printf("%d", ss.chars()
                .filter(Character::isLetter)
                .filter(c -> c - Character.toUpperCase(c) == 0)
                .count());
    }
}
