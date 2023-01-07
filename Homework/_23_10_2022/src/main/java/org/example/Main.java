package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Выберите напиток:(1-4)");
        int btn = a.nextInt() ;
        switch (btn){
            case 1:
                System.out.println("Эспрессо");
                espresso();
                break;
            case 2:
                System.out.println("Американо(эспрессо + вода)");
                americano();
                break;
            case 3:
                System.out.println("Капучино(эспрессо + молоко)");
                capuchino();
                break;
            case 4:
                System.out.println("Чай");
                tea();
                break;
            default:
                System.out.println("Напиток не определён.");
                break;
        }
    }


    public static void espresso(){
        System.out.println("Напиток выбран...");
        System.out.println("Эспрессо готовится.....");
        System.out.println("Эспрессо готов!");

    }

    public static void americano(){
        espresso();
        System.out.println("Добавление воды...");
        System.out.println("Американо готов!");
    }

    public static void capuchino(){
        espresso();
        System.out.println("Добавление вспененного молока...");
        System.out.println("Капучино готов!");
    }

    public static void tea(){
        Scanner b = new Scanner(System.in);
        System.out.println("Выберите чай: \n Чёрный(1)\n Зелёный(2)");
        int tea = b.nextInt();
        switch (tea){
            case 1:
                System.out.println("Чёрный чай готовится...");
                break;
            case 2:
                System.out.println("Зелёный чай готовится...");
                break;
        }

        System.out.println("Чай готов!");
    }
}