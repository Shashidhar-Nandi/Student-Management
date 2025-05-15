package Student.Management;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem extends StudentRecord{

    private static HashMap<Integer, String> students = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);

    public StudentManagementSystem(int id, String name) {
        super(id, name);
    }

    public static void main(String[] args) {

        System.out.println("==".repeat(30));

        students.put(91,"shashi");
        students.put(67,"preetam");
        students.put(61,"prasanna");
        students.put(44,"vallabh");
        students.put(81,"sachin");
        students.put(18,"appuraj");
        students.put(1,"abhishak");
        students.put(4,"aman");
        students.put(17,"anjanaya");
        students.put(26,"basuraj");
        students.put(45,"naveen");
        students.put(19,"arun");
        students.put(63,"pratham");


        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student Name");
            System.out.println("4. Display All Students");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> updateStudent();
                case 4 -> displayStudents();
                case 5 -> searchStudent();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice, try again.");
            }
        } while (choice != 6);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        if (students.containsKey(id)) {
            System.out.println("Student ID already exists.");
        } else {
            students.put(id, name);
            System.out.println("Student added successfully.");
        }
    }

    private static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = scanner.nextInt();
        if (students.remove(id) != null) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (students.containsKey(id)) {
            System.out.print("Enter new Student Name: ");
            String name = scanner.nextLine();
            students.put(id, name);
            System.out.println("Student name updated.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nStudent List:");
            for (Map.Entry<Integer, String> entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        if (students.containsKey(id)) {
            System.out.println("Student found: " + students.get(id));
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
