package _23_11_2022;

public class Employee {
    public void getId() {

    }package profJava.lesson221123.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

    @AllArgsConstructor
    @ToString
    public class Employee implements Comparable<Employee>{
        int id;
        String name;
        String position;
        double salary;


//    @Override
//    public int compareTo(Employee anotherEmp) {
//        //this.object compareTo(another object);
//        if(this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }

//    @Override
//    public int compareTo(Employee anotherEmp) {
//        return this.id - anotherEmp.id;
//    }

        @Override
        public int compareTo(Employee anotherEmp) {
            int res = this.name.compareTo(anotherEmp.name);
            if(res == 0) {
                res = this.position.compareTo(anotherEmp.position);
            }
            return res;
        }

    }

}
