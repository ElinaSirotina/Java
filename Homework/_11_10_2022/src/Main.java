import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner i = new Scanner(System.in);
        System.out.println("Enter word:");

        String word = i.nextLine();
        System.out.println("Количество букв в слове:"+word.length());

        int half = word.length()/2;

        String w1 = word.substring(0,half);
        System.out.println("Первая часть слова:"+w1);

        String w2 = word.substring(half);
        System.out.println("Вторая часть слова:"+w2);
        //2
        Operations.summa();
        Operations.minus();
        Operations.proizv();
        Operations.delenie();
        //3
        convert();


    }

    public static void convert(){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите сумму в евро:");
        int e = a.nextInt();
        double d = e*0.97;
        System.out.println("Сумма в $ ="+d);
    }
}