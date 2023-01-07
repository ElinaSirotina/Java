package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Cat cat2 = new Cat(10);
//        Cat cat3 = new Cat(11, "Bob", 100l);
        System.out.println("hello");
    }

    static void example_051022() {
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