package db;
import org.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class DB {
    static List<Employee> sList = new ArrayList<>();


    public void addsr(Employee employee) {

        sList.add(employee);
    }


    public List<Employee> getlist() {

        return sList;
    }


    public boolean isEmpty() {

        boolean s = true;
        if (sList.size() < 1) {
            s = false;
        } else {
            s = true;
        }
        return s;
    }

    public int getSize() {
        return sList.size();
    }
}