import java.util.Scanner;
	public class Array {
		String[] grades;
		public String [] arrays(int size) {
			grades = new String[size];
			return grades;
			
		}
		public String [] load() {
			System.out.println("Put the different grades into the array:" );
			Scanner in = new Scanner(System.in);
			for(int i = 0; i < grades.length; i++){
				grades[i] = in.nextLine();
			}
			return grades;
		}
		
		public void print() {
			for(int i = grades.length - 1; i >= 0; i--) 
			{	
				System.out.println(grades[i]);
			}
		
		}

	}//end main
