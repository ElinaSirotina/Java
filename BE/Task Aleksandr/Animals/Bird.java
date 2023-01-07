package de.telran;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.printf("%s cheek-chereek\n", name);
    }

    public void fly() {
        System.out.printf("%s fly%n", name);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
