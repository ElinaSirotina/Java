import java.util.Scanner;

public class Operations {

    public static int summa(){
        Scanner first = new Scanner(System.in);
        System.out.println("Введите первое число для сложения:");
        int a = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Введите второе число для сложения:");
        int b = second.nextInt();
        int s = a+b;
        System.out.println("Сумма равна:"+s);
        return s;
    }

    public static int minus(){
        Scanner first = new Scanner(System.in);
        System.out.println("Введите первое число для вычитания:");
        int a = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Введите второе число для вычитания:");
        int b = second.nextInt();
        int s = a-b;
        System.out.println("Разность равна:"+s);
        return s;
    }
    public static int proizv(){
        Scanner first = new Scanner(System.in);
        System.out.println("Введите первое число для умножения:");
        int a = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Введите второе число для умножения:");
        int b = second.nextInt();
        int s = a*b;
        System.out.println("Произведение равно:"+s);
        return s;
    }
    public static int delenie(){
        Scanner first = new Scanner(System.in);
        System.out.println("Введите первое число для деления:");
        int a = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Введите второе число для деления:");
        int b = second.nextInt();
        int s = a/b;
        System.out.println("Деление равно:"+s);
        return s;
    }
}
