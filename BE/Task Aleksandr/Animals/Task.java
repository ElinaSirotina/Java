package de.telran.practice3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Task {
    public static void main(String[] args) {
//        employeeServiceDemo();

        String[] strings = {
                "January",
                "February",
                "March"
        };

        ArrayIterator<String> iterator = new ArrayIterator<>(strings);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    static class ArrayIterator<TYPE> implements Iterator<TYPE> {

        private TYPE[] arr;
        private int pointer = 0;

        public ArrayIterator(TYPE[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return pointer < arr.length;
        }

        @Override
        public TYPE next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return arr[pointer++];
        }
    }

    private static void employeeServiceDemo() {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        EmployeeService employeeService = new EmployeeService(employeeRepo);

        List<Employee> list = employeeService.findAll();
        System.out.println(list);
        System.out.println();
        System.out.println();

        Employee employeeToPromote = list.get(3);

        employeeService.promote(employeeToPromote.getId());

        System.out.println(list);
//
//        Employee employee1 = new Manager("Vasya");
//        Employee employee2 = new TopManager("Petya");
//
//        System.out.println(employee1);
//
//        employeeService.changePosition(employee1, PositionType.PRIVATE);
//
//        System.out.println(employee1);
    }
}
