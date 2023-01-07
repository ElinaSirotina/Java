package _23_11_2022;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getId() == emp2.getId()) {
        return 0;
    } else if(emp2.getId() > emp1.getId()) {
            return -1;
        } else
            return 1;
}
