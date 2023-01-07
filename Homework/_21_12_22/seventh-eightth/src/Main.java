import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Elina", "Sirotina", 'F', 25, 1, 1);
        Student student1 = new Student("Olga", "Victorovna", 'F', 21, 4, 4);
        Student student2 = new Student("Bob", "Strong", 'M', 34, 2, 5);
        Student student3 = new Student("Viktor", "Sir", 'F', 25, 1, 1);
        Student student4 = new Student("Vika", "Vika", 'F', 21, 4, 4);
        Student student5 = new Student("Bean", "Bob", 'M', 34, 2, 5);

        ArrayList<Student> group = new ArrayList<>();
        group.add(student1);
        group.add(student2);
        group.add(student3);
        group.add(student4);
        group.add(student5);
        group.add(student);

        group.stream().forEach(s -> s.setName(s.getName().toUpperCase()));
        group.stream().forEach(s -> System.out.println(s.getName()));

        List<Student> firstCourse = new ArrayList<>();
        List<Student> secondCourse = new ArrayList<>();
        List<Student> thirdCourse = new ArrayList<>();
        List<Student> fourthCourse = new ArrayList<>();

        group.stream().forEach(s -> {
            if(s.getCourse() == 1) {
                firstCourse.add(s);
            } else if(s.getCourse() == 2) {
                secondCourse.add(s);
            } else if(s.getCourse() == 3) {
                thirdCourse.add(s);
            } else {
                fourthCourse.add(s);
            }
        });

        firstCourse.stream().forEach(s -> System.out.println("First " + s.toString()));
        secondCourse.stream().forEach(s -> System.out.println("Sec " + s.toString()));
        thirdCourse.stream().forEach(s -> System.out.println("Th " + s.toString()));
        fourthCourse.stream().forEach(s -> System.out.println("Four " + s.toString()));
    }
}
