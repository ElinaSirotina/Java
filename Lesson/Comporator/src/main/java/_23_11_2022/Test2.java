package _23_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> emloyeeList = new ArrayList<>();
        Employee em1
                = new Employee(id:1, name: "Константин", position: "JAVA DEV", salaryEuro: 2500);
        Employee em2
                = new Employee(id:2, name: "Светлана", position: "JAVA DEV", salaryEuro: 1500);
        Employee em3
                = new Employee(id:1, name: "Катя", position: "JAVA DEV", salaryEuro: 1800);
        Arrays.sort(new Employee[] {em1, em2, em3});

        employeeList.add(em1);
        employeeList.add(em2);
        employeeList.add(em3);

        System.out.println(emloyeeList);
        Collections.sort(employeeList);

        //em3.compareTo(em1);
        //Arrays.sort(new Employee[] {em1, em2, em3, em4});

        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}




    }
}
