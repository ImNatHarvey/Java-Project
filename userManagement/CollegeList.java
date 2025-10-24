package userManagement;

import java.util.*;

public class CollegeList {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;

		while (isRunning) {

			System.out.println("===== Welcome to STI College User Management System =====");
			System.out.println("[E] Employee");
			System.out.println("[F] Faculty");
			System.out.println("[S] Student");
			System.out.println("[Q] Quit");
			System.out.print("Select an option: ");
			String operationType = scanner.nextLine().toUpperCase();

			switch (operationType) {

			case "E":

				Employee employee = new Employee();

				System.out.print("\nEnter Employee Name: ");
				String employeeName = scanner.nextLine();
				employee.setName(employeeName);
				System.out.print("Enter Employee Contact Number: ");
				String employeeContactNum = scanner.nextLine();
				employee.setContactNum(employeeContactNum);

				System.out.print("Enter Employee Salary: ");
				double employeeSalary = scanner.nextDouble();
				employee.setSalary(employeeSalary);
				scanner.nextLine();
				System.out.print("Enter Employee Department: ");
				String employeeDepartment = scanner.nextLine();
				employee.setDepartment(employeeDepartment);

				System.out.println("\n===== Employee Information =====");
				System.out.println("Name: " + employee.getName());
				System.out.println("Contact Number: " + employee.getContactNum());
				System.out.println("Salary: " + employee.getSalary());
				System.out.println("Department: " + employee.getDepartment());

				System.out.println("\nPress Enter to continue...");
				scanner.nextLine();

				break;

			case "F":

				Faculty faculty = new Faculty();

				System.out.print("\nEnter Faculty Name: ");
				String facultyName = scanner.nextLine();
				faculty.setName(facultyName);
				System.out.print("Enter Faculty Contact Number: ");
				String facultyContactNum = scanner.nextLine();
				faculty.setContactNum(facultyContactNum);

				System.out.print("Enter Faculty Salary: ");
				double facultySalary = scanner.nextDouble();
				faculty.setSalary(facultySalary);
				scanner.nextLine();
				System.out.print("Enter Faculty Department: ");
				String facultyDepartment = scanner.nextLine();
				faculty.setDepartment(facultyDepartment);

				System.out.print("Is the Faculty Regular/Tenured? [Y] / [N]: ");
				String facultyStatusInput = scanner.nextLine().toUpperCase();
				boolean facultyStatus = facultyStatusInput.equals("Y");
				faculty.setRegular(facultyStatus);

				System.out.println("\n===== Faculty Information =====");
				System.out.println("Name: " + faculty.getName());
				System.out.println("Contact Number: " + faculty.getContactNum());
				System.out.println("Salary: " + faculty.getSalary());
				System.out.println("Department: " + faculty.getDepartment());
				System.out.println("Status: " + (faculty.isRegular() ? "Regular/Tenured" : "Part-time/Contractual"));

				System.out.println("\nPress Enter to continue...");
				scanner.nextLine();
				break;

			case "S":

				Student student = new Student();

				System.out.print("\nEnter Student Name: ");
				String studentName = scanner.nextLine();
				student.setName(studentName);
				System.out.print("Enter Student Contact Number: ");
				String studentContactNum = scanner.nextLine();
				student.setContactNum(studentContactNum);

				System.out.print("Enter Student Program: ");
				String studentProgram = scanner.nextLine();
				student.setProgram(studentProgram);

				System.out.print("Enter Student Year Level: ");
				int studentYearLevel = scanner.nextInt();
				student.setYearLevel(studentYearLevel);
				scanner.nextLine();

				System.out.println("\n===== Student Information =====");
				System.out.println("Name: " + student.getName());
				System.out.println("Contact Number: " + student.getContactNum());
				System.out.println("Program: " + student.getProgram());
				System.out.println("Year Level: " + student.getYearLevel());

				System.out.println("\nPress Enter to continue...");
				scanner.nextLine();

				break;
				
			case "Q":
				
				isRunning = false;
				System.out.println("Exiting the system. Goodbye!");
				break;
				
			default:
				
				System.out.println("Invalid option. Please try again.");
				break;
				
			}
			
		}
		
		scanner.close();
		
	}

}
