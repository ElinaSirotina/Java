package de.telran;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    public void speak() {
        System.out.printf("%s is good%n", name);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
