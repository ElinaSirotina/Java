package org.example;

public class Cat {
    private int age;
    private String name;

    public Cat()  {
        System.out.println("Hello,it is my cat");

        }




    public Cat(int age) {
        this.age = age;
        System.out.println(this.age);
    }


    public Cat(int age, String name, String surname) {
        this();
        System.out.println("Hello from last constructor");
    }



}
}


