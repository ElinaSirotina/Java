package model;
import org.example.Employee;
import org.example.Position;
import org.example.TakeTask;
public class Middle extends Employee implements TakeTask {
    public Position p;
    public Middle(String name, int age, Position p) {
        super(name, age);
        this.p = p;

    }

    public Position getP() {
        return p;
    }

    @Override
    public void take() {
        System.out.println("Принял задания и раздал сотрудникам");
    }
}

