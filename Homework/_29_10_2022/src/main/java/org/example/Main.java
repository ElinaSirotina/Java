package org.example;

public class Main {
    public static void main(String[] args) {

        // f();
        //w();
        dw();
    }
    public static void f(){
        int ground = 0;
        int up = 163;
        int down = 0;
        int counter =0;
        for(int i = ground;i<up+1;i+=5){
            if(i>=5) {
                System.out.println("Поднялся на " + i);
                down = i - 1;
                i = down;
                counter++;
                System.out.println("Опустился на " + down);
                System.out.println(counter);
            }
            if(i>158&&i<163){
                i=up;
                System.out.println("Поднялся на " + i);
                counter++;
                System.out.println(counter);
            }
        }
    }

    public static void w(){
        int ground = 0;
        int up = 163;
        int down = 0;
        int counter =0;

        int i = ground;
        while (i<up+1){
            if(i>=5) {
                System.out.println("Поднялся на " + i);
                down = i - 1;
                i = down;
                counter++;
                System.out.println("Опустился на " + down);
                System.out.println(counter);
            }
            if(i>158&&i<163){
                i=up;
                System.out.println("Поднялся на " + i);
                counter++;
                System.out.println(counter);
            }
            i+=5;
        }

    }
    public static void dw(){
        int ground = 0;
        int up = 163;
        int down = 0;
        int counter =0;

        int i = ground;
        do{
            if(i>=5) {
                System.out.println("Поднялся на " + i);
                down = i - 1;
                i = down;
                counter++;
                System.out.println("Опустился на " + down);
                System.out.println(counter);
            }
            if(i>158&&i<163){
                i=up;
                System.out.println("Поднялся на " + i);
                counter++;
                System.out.println(counter);


            }
            i+=5;
        }while (i<up+1);
    }
}