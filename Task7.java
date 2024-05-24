
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int choice;
        Scanner key = new Scanner(System.in);
        StudentManagement manage = new StudentManagement();
        System.out.println("Welcome to the Student Management System");
        while (true) {
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Search for a student by ID");
            System.out.println("4. Exit");
            System.out.print("Select your choice: ");
            choice = key.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = key.nextInt();
                    key.nextLine();
                    System.out.print("Enter student name: ");
                    String name = key.nextLine();
                    System.out.print("Enter student age: ");
                    int age = key.nextInt();
                    key.nextLine();
                    System.out.print("Enter student grade: ");
                    double grade = key.nextDouble();
                    key.nextLine();
                    Student student = new Student(id, name, age, grade);
                    manage.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("All students are displayed below: ");
                    manage.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter the ID: ");
                    int searchId = key.nextInt();
                    manage.findStudentById(searchId);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                    key.close();
            }
        }
    }
}

class Student {

    private int id;
    private String name;
    private int age;
    private double grade;
    Scanner key;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

class StudentManagement {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
