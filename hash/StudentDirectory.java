package hash;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDirectory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> studentList = new HashMap<>();

        int n;
        boolean loop = true;

        System.out.print("Input number of students to add: ");
        n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nStudent Management System");

        while (loop) {

            System.out.println("\n[1] Add New Student");
            System.out.println("[2] View Student Table");
            System.out.println("[3] Search Student Information");
            System.out.println("[4] Update Student Information");
            System.out.println("[5] Delete Student Information");
            System.out.println("[6] Exit Program");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 1:
                for (int i = 0; i < n; i++) {
                    System.out.print("\nEnter Student ID: ");
                    String studNum = scanner.nextLine();
                    if (studentList.containsKey(studNum)) {
                        System.out.println("Student ID already exists. Please enter a unique ID.");
                        i--;
                        continue;
                    }
                    System.out.print("Enter Student Name: ");
                    String studName = scanner.nextLine();
                    studentList.put(studNum, studName);
                }
                System.out.println("\nStudents added successfully.");
                break;

            case 2:
                System.out.println("\nStudent Table:");
                System.out.println("ID\tName");
                for (String id : studentList.keySet()) {
                    System.out.println(id + "\t" + studentList.get(id));
                }
                break;

            case 3:
                if (studentList.isEmpty()) {
                    System.out.println("\nNo students in directory.");
                } else {
                    String searchChoice = "Y";
                    while (searchChoice.equalsIgnoreCase("Y")) {
                        System.out.print("\nEnter Student ID to search: ");
                        String searchId = scanner.nextLine();
                        if (studentList.containsKey(searchId)) {
                            System.out.println("\nStudent Found: " + studentList.get(searchId));
                        } else {
                            System.out.println("\nStudent ID not found.");
                        }
                        System.out.print("\nDo you want to search for another student? [Y/N]: ");
                        searchChoice = scanner.nextLine();
                    }
                }
                break;

            case 4:
                System.out.println("\nStudent Table:");
                System.out.println("ID\tName");
                for (String id : studentList.keySet()) {
                    System.out.println(id + "\t" + studentList.get(id));
                }

                System.out.print("\nEnter Student ID to update: ");
                String updateId = scanner.nextLine();
                if (studentList.containsKey(updateId)) {
                    System.out.print("Enter new Student Name: ");
                    String newName = scanner.nextLine();
                    studentList.put(updateId, newName);
                    System.out.println("\nStudent information updated successfully.");
                } else {
                    System.out.println("\nStudent ID not found.");
                }
                break;

            case 5:
                if (studentList.isEmpty()) {
                    System.out.println("\nNo students in directory.");
                } else {
                    String deleteChoice = "Y";
                    while (deleteChoice.equalsIgnoreCase("Y")) {
                        System.out.print("\nEnter Student ID to delete: ");
                        String deleteId = scanner.nextLine();
                        if (studentList.containsKey(deleteId)) {
                            studentList.remove(deleteId);
                            System.out.println("\nStudent information deleted successfully.");
                        } else {
                            System.out.println("\nStudent ID not found.");
                        }
                        System.out.print("\nDo you want to delete another student? [Y/N]: ");
                        deleteChoice = scanner.nextLine();
                    }
                }
                break;

            case 6:
                loop = false;
                System.out.println("\nExiting program. Goodbye!");
                break;
            default:
                System.out.println("\nInvalid choice. Please try again.");
            }

        }

        scanner.close();

    }

}