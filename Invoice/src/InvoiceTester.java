import java.util.Scanner;

public class InvoiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Invoice newinvoice = new Invoice();
		
		newinvoice.settimeworked(4);
		newinvoice.setexpenses(15);
		newinvoice.setrate(15);
		newinvoice.computelaborcharges();
		
		System.out.println("What is the name of the new customer? ");
		String a = in.next();
		
		System.out.println(a + "'s Total Charges: " + newinvoice.computetotalcharges());
	}

}
