import java.util.Scanner;
public class Class1 {
	String[] words;
	public String [] arrays(int size) {
		words = new String[size];
		return words;
		
	}
	public String [] load() {
		System.out.println("Put a String of words or letters into the array:" );
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < words.length; i++){
			words[i] = in.nextLine();
		}
		return words;
	}
	
	public void print() {
		for(int i = words.length - 1; i >= 0; i--) 
		{	
			System.out.println(words[i]);
		}
	
	}

}
