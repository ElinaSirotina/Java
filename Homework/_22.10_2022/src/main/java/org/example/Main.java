package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Введите переменную isWeekend (True or False):");
        boolean isWeekend=a.nextBoolean();

        Scanner b = new Scanner(System.in);
        System.out.println("Введите переменную isRain (True or False):");
        boolean isRain=b.nextBoolean();

        boolean canWalk;
        if (isWeekend==true&&isRain==false){
            canWalk=true;
        }else {
            canWalk=false;
        }
        System.out.println("canWalk равно "+canWalk);




    }
}