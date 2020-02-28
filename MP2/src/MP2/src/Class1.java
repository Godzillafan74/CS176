import java.util.Arrays;
import java.util.Scanner;
public class Class1 {
	
	Scanner scan = new Scanner(System.in);
	int count = 0;
	final int MAX_SIZE = 100;
	final String BREAK = "STOP";
	String input;
	String max = "";
	String min = "";
	int one = 1;
	int zero = 0;
	String multipleShortest;
	String [] strings;
	boolean stop = false;

	public Class1() {
		strings = new String[MAX_SIZE];
	}

	public void load() {
		System.out.print("Enter a amount of strings or 'STOP' to end: ");
		while(stop == false) {
			input = scan.next();
			if(input.equals("STOP")) {
				stop = true;
				count--;
			}
			else {
				strings[count] = input;
				count++;
			}
		}
	}

	public boolean search(String array) {
		boolean check = false;
		for (int a = 0; a <= count; a++) {
			if (strings[a].contentEquals(array))
				check = true;
		}
		return check;
	}

	public String findMin(){
		for(int b = 0; b <= count; b++) {
			if(b == zero) {
				min = strings[b];
			}
			else {
				if(strings[b].compareTo(min) < 0) {
					min = strings[b];
				}
			}
		}
		return min;
	}

	public String findMax() {
		for(int c = 0; c <= count; c++) {
			if(c == 0) {
				max = strings[c];
			}
			else{
				if(strings[c].compareTo(max) > 0) {
					max = strings[c];
				}
			}
		}
		return max;
	}

	public String findLongest() {
		String longest = strings[0];
		for(int i = one; i <= count; i++) {
			if(strings[i].length() > longest.length()) {
				longest = strings[i];
			}

		}
		return longest;
	}

	public String findShortest() {
		String shortest = strings[0];
		for(int i = one; i <= count; i++) {
			if(strings[i].length() < shortest.length()) {
				shortest = strings[i];
			}

		}
		return shortest;
	}
}
