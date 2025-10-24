package userSystem;
import java.util.*;

public class runUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userLists = new ArrayList<>();

        Admin defaultAdmin = new Admin();
        defaultAdmin.setUsername("admin");
        defaultAdmin.setPassword("admin123");
        userLists.add(defaultAdmin);
        
        Staff defaultStaff = new Staff();
        defaultStaff.setUsername("staff");
        defaultStaff.setPassword("staff123");
        userLists.add(defaultStaff);
        
        User defaultUser = new User();
        defaultUser.setUsername("user");
        defaultUser.setPassword("user123");
        userLists.add(defaultUser);

        System.out.println("Welcome to the User Management System");
        System.out.print("Enter your username:");
        String username = scanner.nextLine();
        System.out.print("Enter your password:");
        String password = scanner.nextLine();

        int userType = User.login(userLists, username, password);
        if (userType != -1) {
            System.out.println("Login successful!");

            if (userType == 0) {
                System.out.println("You are logged in as Admin.");
                adminMenu(userLists);
            } else if (userType == 1) {
                System.out.println("You are logged in as Staff.");
            } else if (userType == 2) {
                System.out.println("You are logged in as User.");
            }

        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
    }

    public static void adminMenu(ArrayList<User> userLists) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[1] Add User");
        int input = scan.nextInt();
        scan.nextLine(); 

        if (input == 1) {
            System.out.print("Enter username: ");
            String username = scan.nextLine();
            System.out.print("Enter password: ");
            String password = scan.nextLine();
            System.out.print("Role [0] Admin [1] Staff [2] User: ");
            int role = scan.nextInt();

            User newUser;
            if (role == 0) {
                newUser = new Admin();
                System.out.println("Admin added successfully!");
            } else if (role == 1) {
                newUser = new Staff();
                System.out.println("Staff added successfully!");
            } else if (role == 2) {
                newUser = new User();
                System.out.println("User added successfully!");
            } else {
                System.out.println("Invalid role selected.");
                return;
            }
            
            newUser.setUsername(username);
            newUser.setPassword(password);
            userLists.add(newUser);
        }
        System.out.println("Account Created Successfully!");
    }
}