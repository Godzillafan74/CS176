
public class Invoice {
	private int hours;
	private double rate; 
	private double expenses;
	private String name;
	private double hourlycharges;
	
	public Invoice() {
		
	}
	
	public Invoice(String inName, String inPart) {
		//name = inName;
		//String part = inPart;
	}

	public void settimeworked(int inhours) {
		hours = inhours;
	}
	
	public void setexpenses(double inrate) {
		expenses = inrate;
	}
	
	public void setrate(double inrate) {
		rate = inrate;
	}
	
	public void computelaborcharges() { 
		hourlycharges = rate*hours;
	}
	
	public double computetotalcharges() {
		return hourlycharges + expenses;
	}
	
	public void printinvoice() {
		System.out.println("Name of Project: "+ name + "Total number of hours worked: " + hours + "Expenses: "+ expenses + "Rate charged: "+ rate + "Total amount charged: "+ (hourlycharges+expenses));
	}
}
