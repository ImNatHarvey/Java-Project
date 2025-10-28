package animals;

public class Cat extends Animal {

	@Override
	public void eat() {
		
		System.out.println("Devours a flaky piece of fish,");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("Curled tight, asleep upon the couch,");
		
	}

	@Override
	public void makeSound() {
		
		System.out.println("Meows, \"Meow meow!\" with a soft swish.");
		
	}

}
