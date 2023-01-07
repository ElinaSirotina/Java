package org.example;

public class Cat {

    private int age;
    private String name;
    private long weight;

    public Cat() {
        System.out.println("Hello, it's my cat");
    }

    public Cat(int age) {
        this.age = age;
        System.out.println(this.age);
    }

    public Cat(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Cat(int age, String name) {
        this(age);
    }

    public Cat(String name, int age) {
        this(name);
    }

    public Cat(int age, String name, long weights) {

        this.age = age;
        this.name = name;
        this.weight = weights;

        System.out.println("Hello from last constructor");
    }
}
