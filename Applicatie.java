import java.util.ArrayList;
import java.util.Scanner;

public class Applicatie {
    public static void main(String[] args) {
        // Create a list of students and display it
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Maidacenco Anastasia", 24, "Computer Science"));
        students.add(new Student("Veronica Gusan", 25, "Mathematics"));
        students.add(new Student("Bob Marley", 21, "Physics"));
        students.add(new Student("Sara Lee", 18, "Biology"));
        students.add(getStudentFromInput()); // Add a student from user input
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // Create a list of teachers and display it
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Dr. Olga", "Computer Science"));
        teachers.add(new Teacher("Dr. Eugen", "Mathematics"));
        teachers.add(new Teacher("Dr. Black", "Physics"));
        teachers.add(getTeacherFromInput()); // Add a teacher from user input
        System.out.println("List of teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }

    // Method to get a student from user input
    public static Student getStudentFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter student major: ");
        String major = scanner.nextLine();
        return new Student(name, age, major);
    }

    // Method to get a teacher from user input
    public static Teacher getTeacherFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        System.out.print("Enter teacher department: ");
        String department = scanner.nextLine();
        return new Teacher(name, department);
    }
}