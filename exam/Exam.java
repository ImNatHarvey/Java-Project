package exam;

public class Exam {
	
	String message;
	double price;
	boolean status;
	
	public Exam() {
		
		this.message = "Good Luck!";
	}
	
	public Exam(String period, String level) {
		
	}
	
	public double getPrioce() {
		return price;
	}
	
	public boolean getStatus() {
		return status;
	}
}
