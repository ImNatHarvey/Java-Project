package savingsAccount;

import java.util.Scanner;

public class RunAmountDue {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmountDue due = new AmountDue();
        boolean isRunning = true;
        
        while (isRunning) {
            
            System.out.println("=========================================");
            System.out.println("========= AMOUNT DUE CALCULATOR =========");
            System.out.println("[1] Price only");
            System.out.println("[2] Price and quantity");
            System.out.println("[3] Price, quantity, and discount amount");
            System.out.println("[4] Exit");
            System.out.print("Choose an operation: ");
            
            int operationType = scanner.nextInt();
            
            if (operationType == 1) {
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                double amountDue = due.computeAmountDue(price);
                System.out.printf("\nAmount due is %.2f\n\n", amountDue);
            } 
            
            else if (operationType == 2) {
                System.out.print("Enter price and quantity (separated by space): ");
                double price = scanner.nextDouble();
                int quantity = scanner.nextInt();
                double amountDue = due.computeAmountDue(price, quantity);
                System.out.printf("\nAmount due is %.2f\n\n", amountDue);
            } 
            
            else if (operationType == 3) {
                System.out.print("Enter price, quantity, and discount (separated by spaces): ");
                double price = scanner.nextDouble();
                int quantity = scanner.nextInt();
                double discount = scanner.nextDouble();
                double amountDue = due.computeAmountDue(price, quantity, discount);
                System.out.printf("\nAmount due is %.2f\n\n", amountDue);
            } 
            
            else if (operationType == 4) {
                System.out.println("Exiting program.");
                isRunning = false;
            } 
            
            else {
                System.out.println("\nInvalid option. Try again.\n");
            }
            
            scanner.nextLine();
        }
        scanner.close();
    }
}