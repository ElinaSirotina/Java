import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(" --- Arithmetic operators --- ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println(" --- Unary operators --- ");

    }

    static void getLastExampleHomeWork3() {
//        double eurValue = 1000;
        System.out.print("Enter EUR:");
        Scanner scanner = new Scanner(System.in);
        double eurValue = scanner.nextDouble();
        System.out.println("EUR equivalent " + eurValue + " is " + convertToUsd(eurValue) + "$");
        scanner.close();
    }

    static double convertToUsd(double eur) {
//        double coeff = 0.97;
//        double usd = eur * coeff;
//
//        return usd;
        return eur*0.97;
    }

    static void getResultsFrom11102022() {
        //        MathOperations m = new MathOperations();
//        m.getSigmoid(2f);
//        System.out.println("Result by 1 line " + m.getResult());
//
//        m.getSigmoid2(2f);
//        System.out.println("Result by diff method " + m.getResDer());
//
//        MathOperations2 mm = new MathOperations2();
//        System.out.println("Result by another way: " + mm.getSigmoid(2f));
//        System.out.println("Result by diff method: " + mm.getSigmoid2(2f));
//
//        System.out.println(mm.equation(2));
//
//        mm.equationVoid(2);
//        System.out.println(mm.getY());

        MathOperations3 mmm = new MathOperations3();
        mmm.getSquare(2);
        System.out.println(mmm.getSquare_result());

        System.out.println(mmm.getSquare2(2));
    }

    static void getResultsFrom10102022() {
        //        Cat cat = new Cat();
//        Cat cat2 = new Cat(10);
//        Cat cat3 = new Cat(11, "Bob", 100l);
        System.out.println("hello");
    }
    static void getResultsFrom051022() {
        //        String a = "hello";
//        String b = a;
//
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);
//
//        b = "hello!";
//
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println(a);

        float b = scanner.nextFloat();
        System.out.println(b);
    }
}