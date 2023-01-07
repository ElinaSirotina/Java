package example;

public class Test {
    public static void main(String[] args) {
        School school1 = new School("Oxana", 16);
        School school2 = new School("Konstantin", 15);
        School school3 = new School("Alexandr", 15);
        School school4 = new School("Svitlana", 15);

        Student student1 = new Student("Jelena", 20);
        Student student2 = new Student("Alexey", 21);
        Student student3 = new Student("Viktorija", 21);
        Student student4 = new Student("Anna", 21);

        Employee employee1 = new Employee("Pavel", 30);
        Employee employee2 = new Employee("Sergey", 31);
        Employee employee3 = new Employee("Sergey", 31);
        Employee employee4 = new Employee("Sergey", 31);

        Team<School> schoolTeam1 = new Team<>("School team1");
        Team<School> schoolTeam2 = new Team<>("School team2");
        Team<Student> studentTeam1 = new Team<>("Student team1");
        Team<Student> studentTeam2 = new Team<>("Student team2");
        Team<Employee> employeeTeam1 = new Team<>("Employee team1");
        Team<Employee> employeeTeam2 = new Team<>("Employee team2");

        schoolTeam1.addNewParticipant(school1);
        schoolTeam1.addNewParticipant(school2);
        schoolTeam2.addNewParticipant(school3);
        schoolTeam2.addNewParticipant(school4);

        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);

        schoolTeam1.playWith(schoolTeam2);
    }
}
