package animals;

public class Dog extends Animal {

	@Override
	public void eat() {
		
		System.out.println("Eats its crunchy dog food fast,");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("Sleeps soundly in its wooden kennel,");
		
	}

	@Override
	public void makeSound() {
		
		System.out.println("Barks, \"Woof woof!\" a sound that's built to last.");
		
	}

}
