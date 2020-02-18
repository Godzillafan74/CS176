import java.util.Scanner;
public class MyClass {
	Scanner in = new Scanner(System.in);
	int [] nums;
	int count = 0;
	String a;
	int numA = 0;
	String input;
	
	char asteriks = '*';
	
	public MyClass (int list) {
		nums  = new int[list];
	}
	public void load() {
		System.out.println("Do you want to enter a number? Enter Y for Yes and N or No:" );
		a=in.next();
		while(!(a.contentEquals("Y"))||a.equals("N")) {
			System.out.println("Wrong input, Enter Y or N: ");
			a=in.next();
		}
		while(a.contentEquals("Y")) {
			System.out.println("Enter an integer: ");
			numA=in.nextInt();
			nums[count]= numA;
			count++;
			System.out.println("Do you want to enter another number? Enter Y for Yes and N for No:");
			a=in.next();
			while(!(a.contentEquals("Y")||a.equals("N"))) {
				System.out.println("Wrong input, enter Y or N: ");
				a=in.next();
			}
			
		}
		
	}
	public void printChart() {
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < nums[i]; j++) {
				System.out.println("" + asteriks);
			}
			System.out.println(" ");
		}
	}
}
