package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1)
        Scanner in = new Scanner(System.in);
        System.out.print("Input a radius: ");
        int radius = in.nextInt();
        double area = 3.14*(Math.pow(radius,2));
        System.out.printf("The area of an circle with radius %d = %f \n", radius, area);
        //2)
        Scanner on = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = on.nextLine();
        System.out.printf("Hello,%s \n", name);

        in.close();


    }
}