package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        if (a>b)
//            System.out.println("a>b");
//        else
//            System.out.println("b>a");
//        System.out.println((a>b) ? "a>b" : "b>a");




//        int day = 17;
//        String dayStr;
//        switch (day) {
//
//            case 3,10,17,24,31 -> dayStr = "mo";
//            case 4,11,18,25 -> dayStr = "tu";
//            case 5,12,19,26 -> dayStr = "we";
//            case 6,13,20,27 -> dayStr = "th";
//            case 7,14,21,28 -> dayStr = "fr";
//            case 8,15,22,29 -> dayStr = "sa";
//            case 9,16,23,30 -> dayStr = "su";
//            default -> dayStr = "error";
//        }
//
//        System.out.println("Result from switch operator " + dayStr);
//
//       String dayStr2 = switch (day) {
//
//            case 3,10,17,24,31 -> "mo";
//            case 4,11,18,25 -> "tu";
//            case 5,12,19,26 -> "we";
//            case 6,13,20,27 -> "th";
//            case 7,14,21,28 -> "fr";
//            case 8,15,22,29 -> "sa";
//            case 9,16,23,30 -> "su";
//           default ->  "error";
//
//        }; System.out.println("Result from switch expression " + dayStr2);


//        int month = 12;
//        int day = 25;
//        switch (month){
//            case 12:
//                switch (day) {
//                    case 3:
//                    case 25:
//                        System.out.println("Cristmas");
//                        break;
//
//                    System.out.println("I do not know what is that holiday");
//                }
//        }
//        int day = 19;
//        String dayStr;
//
//        switch (day) {
//            case 17:
//                dayStr = "mo";
//                break;
//
//            case 18:
//                dayStr = "tu";
//                break;
//
//            case 19:
//                dayStr = "we";
//                break;
//
//            case 20:
//                dayStr = "th";
//                break;
//
//            case 21:
//                dayStr = "fr";
//                break;
//
//            case 22:
//                dayStr = "sa";
//                break;
//
//            case 23:
//                dayStr = "su";
//                break;
//
//
//
//            default:
//                dayStr = "error";
//        }
//
//    }


//
//    static void lastExample18102022() {
//        int[] a = {1,2,3,4,5,6,7,8,9};
        //  index  0 1 2 3 4 5 6 7 8

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 5)
//                break;
//            System.out.println(a[i]);
//        }

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                continue;
//            }
//            System.out.println(a[i] + " ");
//        }

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 5) {
//                return;
//            }
//            System.out.println(a[i]);
//        }
//
//        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        String tempCondition;

        if (temperature > 100)
            tempCondition = "Пар";
        else
            tempCondition = "Вода";

        System.out.println(tempCondition);

        scanner.close();
    }

    static int test(int x) {

        int local = 0;

        if (x > 0) {
            local = x;
        } else {
            local =  1;
        }

        return local;
    }

    static void getLastHomeWork17102022() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pls a hour: ");
        int currentHour = scanner.nextInt();  // берем текущий час из командной строки

        System.out.print("Enter pls minutes: ");
        int currentMinutes = scanner.nextInt(); // берем текущие минуты из командной строки

        int allSecondsInWorkDay = (17 - 9) * 60 * 60; // количество секунда в рабочем дне
        System.out.println("All seconds: " + allSecondsInWorkDay);

        int secondsLeft = ((currentHour - 9) * 60 + currentMinutes) * 60; // количество секунд с начала рабочего дня
        System.out.println("Seconds left: " + secondsLeft);

        int deltaInSeconds = allSecondsInWorkDay - secondsLeft; // количество секунд до конца рабочего дня

        System.out.println("Delta in seconds: " + deltaInSeconds);
        System.out.println("Delta in minutes: " + deltaInSeconds / 60);
        System.out.println("Delta in hour: " + deltaInSeconds / 60 / 60);

        scanner.close();
    }

    static void getLastExample11102022() {
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
        System.out.println("U(+) " + (+a));
        System.out.println("U(-) " + (-a));
        System.out.println("U(~) " + (~a));

        // System.out.println(Integer.toBinaryString(a));

        // 1010 (Binary) <- 10 (Decimal)
        // 00000000 00000000 00000000 00001010 (Binary) <- 10 (Decimal)
        // U(~)
        // 11111111 11111111 11111111 11110101 (Binary)

        // int y = 0b11111111111111111111111111110101;
        // System.out.println("Checking " + y);

        System.out.println("++U " + (++a));
        System.out.println("--U " + (--a));

        System.out.println("U++ " + (a++));
        System.out.println("New value of a = " + a);

        System.out.println("U-- " + (a--));
        System.out.println("New value of a = " + a);

        System.out.println(" --- Relations operators --- " );
        System.out.println("R (a == b) " + (a == b));
        System.out.println("R (a != b) " + (a != b));
        System.out.println("R (a < b) " + (a < b));
        System.out.println("R (a > b) " + (a > b));
        System.out.println("R (a <= b) " + (a <= b));
        System.out.println("R (a >= b) " + (a >= b));

        System.out.println(" --- Logic operators --- " );
        // AND && cond1 && cond2 возвращает true, когда оба cond1 и cond2 истинны

//        boolean a_b = a < b; // a=10 b=20
//        boolean c_d = c < d; // c=30 d=40
//        System.out.println("L(AND &&) " + (a_b && c_d));

        System.out.println("L(AND &&) " + (a < b && c < d));
        System.out.println("L(AND &&) " + (a < b && c > d));

        // OR ||
        // Если хотя бы один из двух дает истину, оператор возвращает истину.
        // Чтобы результат был ложным, оба условия должны возвращать false.
        System.out.println("L(OR ||) " + (a < b || c < d));
        System.out.println("L(OR ||) " + (a < b || c > d));
        System.out.println("L(OR ||) " + (a > b || c > d));


        // NOT !
        // Если условие ложно, операция возвращает истину, а когда условие истинно,
        // операция возвращает ложь.
        System.out.println("L(NOT !) " + !(a < b));
        System.out.println("L(NOT !) " + !(c < d));

        // Mixing
        //                                     true
        //                         true         |  true
        //                   true    |   true   |  |  false
        System.out.println(((a < b) && (c < d)) || !(a > b));


        System.out.println(" --- Bits operators --- " );
        // Bit and &. Равно 1, если соответствующие биты в операндах также равны 1.
        // Во всех остальных случаях значение результирующего бита равно 0
        System.out.println("B(AND &) " + (a & b));

        // System.out.println("Binary a = " + Integer.toBinaryString(a));
        // System.out.println("Binary b = " + Integer.toBinaryString(b));

        // 00000000 00000000 00000000 00001010 <- a=10
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit AND &
        // 0000000 000000000 00000000 00000000 <- 0

        // Bit OR |. Равно 1, если соответствующий бит в любом из операндов равен 1
        System.out.println("B(OR |) " + (a | b));
        // 00000000 00000000 00000000 00001010 <- a=10
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit OR |
        // 00000000 00000000 00000000 00011110 <- 30

        // Bit XOR ^. Равно 1, если соответствующий бит только в одном из операндов
        // равен 1. Во всех других случаях результирующий бит равен 0
        System.out.println("B(XOR ^) " + (a ^ b));
        // 00000000 00000000 00000000 00001010 <- a=10
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit XOR ^
        // 00000000 00000000 00000000 00011110 <- 30

        int w = -1;
        System.out.println("B(AND &, w, b) " + (w & b));
        // 11111111 11111111 11111111 11111111 <- w=-1
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit AND &
        // 0000000 000000000 00000000 00010100 <- 20

        System.out.println("B(OR |, w, b) " + (w | b));
        // 11111111 11111111 11111111 11111111 <- w=-1
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit OR |
        // 11111111 11111111 11111111 11111111 <- -1

        System.out.println("B(XOR ^, w, b) " + (w ^ b));
        // 11111111 11111111 11111111 11111111 <- w=-1
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit XOR ^
        // 11111111 11111111 11111111 11101011 <- -21

        // &      |      ^
        // 101    101    101   <- one
        // 011    011    011   <- two
        // 001    111    110   <- res

        System.out.println(" --- Bit shift operators --- " );
        System.out.println("BS (a << 2) " + (a << 2));
        // 00000000 00000000 00000000 00001010 <- a=10
        // << 2 bit
        // 00000000 00000000 00000000 00101000 <- 40

        System.out.println("BS (a >> 2) " + (a >> 2));
        // 00000000 00000000 00000000 00001010 <- a=10
        // << 2 bit
        // 00000000 00000000 00000000 00000010 <- 2

        System.out.println("BS (a >>> 2) " + (a >>> 2));
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

//        MathOperations3 mmm = new MathOperations3();
//        mmm.getSquare(2);
//        System.out.println(mmm.getSquare_result());
//
//        System.out.println(mmm.getSquare2(2));
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