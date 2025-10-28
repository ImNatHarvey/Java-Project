package animals;

import java.util.Scanner;

public class RunAnimal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		
		System.out.println("Animal Poem Program");
		
		while (true) {
			
			System.out.println("\nChoose an animal to interact with: ");
			System.out.println("\n[B] - Bird");
			System.out.println("[C] - Cat");
			System.out.println("[D] - Dog");
			System.out.println("[E] - Exit");
			System.out.print("\nYour choice: ");
			String choice = scanner.nextLine().toUpperCase();

			if (choice.equalsIgnoreCase("B")) {
				System.out.println("");
				b.eat();
				b.sleep();
				b.makeSound();
			} else if (choice.equalsIgnoreCase("C")) {
				System.out.println("");
				c.eat();
				c.sleep();
				c.makeSound();
			} else if (choice.equalsIgnoreCase("D")) {
				System.out.println("");
				d.eat();
				d.sleep();
				d.makeSound();
			} else if (choice.equalsIgnoreCase("E")) {
				System.out.println("\nExiting the program. Goodbye!");
				break;
			} else {
				System.out.println("\nInvalid choice. Please try again.");
			}
			

		}
	}

}
