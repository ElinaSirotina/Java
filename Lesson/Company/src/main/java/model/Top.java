package model;

import org.example.Employee;
import org.example.GiveTask;
import org.example.Position;

public class Top extends Employee implements GiveTask {
    public Position p;
    public Top(String name, int age, Position p) {
        super(name, age);
        this.p = p;

    }

    public Position getP() {
        return p;
    }

    @Override
    public void give() {
        System.out.println("Создал задание");

    }
}


