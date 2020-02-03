import java.util.Scanner;

public class InvoiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the name of the new customer? ");
		String a = in.next();
		
		Invoice newinvoice = new Invoice();
		
		newinvoice.settimeworked(4);
		newinvoice.setexpenses(15);
		newinvoice.setrate(15);
		newinvoice.computelaborcharges();
		newinvoice.printinvoice();
		
		System.out.println("What is the name of the new customer? ");
		String b = in.next();
		
		Invoice newinvoice2 = new Invoice();
		
		newinvoice2.settimeworked(8);
		newinvoice2.setexpenses(10);
		newinvoice2.setrate(10);
		newinvoice2.computelaborcharges();
		newinvoice2.printinvoice();
	}

}
