package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int num = a.nextInt();
        if (num < 1) {
            System.out.println("Вы ввели недопустимое значение");
        } else {
            for (int i = 1; i<num+1;i++){
                sum += i;
            }
            System.out.println("Сумма равна "+sum);
        }
    }
}