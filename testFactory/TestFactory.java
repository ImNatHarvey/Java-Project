package testFactory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		Laptop minLaptop = LaptopFactory.getSpecs("min", 8, 256, "Ryzen 5 7600X");
		Laptop recoLaptop = LaptopFactory.getSpecs("reco", 16, 512, "Ryzen 7 9700X");
		
		System.out.println("Minimum Laptop Specs: " + "\n" + minLaptop);
		System.out.println("\nRecommended Laptop Specs: " + "\n" + recoLaptop);
	}

}
