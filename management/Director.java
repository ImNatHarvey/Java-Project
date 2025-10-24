package management;

public class Director extends Manager {
	
	public int stockOptions;
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		
		// Statements that can be inserted
		employee.salary = 50000;
		manager.salary = 80000;
		manager.budget = 100000;
		director.stockOptions = 1000;
	}
	
}

// 2 statements can't be inserted:
// employee.budget = 20000; 
// manager.stockOptions = 500; 

