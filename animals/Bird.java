package animals;

public class Bird extends Animal {

	@Override
	public void eat() {
		
		System.out.println("Gobbles a sweet, ripe berry,");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("Sleeps tucked high upon a nest,");
		
	}

	@Override
	public void makeSound() {
		
		System.out.println("A soft \"Peep peep\" is light and merry.");
	}

}
