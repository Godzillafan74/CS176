import java.util.Scanner;

public class Class2 {
	Scanner scan = new Scanner(System.in);
	final int MAX_SIZE = 1000;
	int count = 0;
	int input = 0;
	int max = 0;
	int min = 0;
	final int SENTINEL = -999;
	int [] integers;
 
	public Class2() {
		integers = new int[MAX_SIZE];
	}
	public void load () {
		System.out.println("Enter a series of integers and type -999 to end: ");
		while (scan.hasNextInt()) {
			input = scan.nextInt();
			if (input == SENTINEL) {
				break;
			} 
			else {
				integers[count] = input;
				count++;
			}
		}
	}
	public boolean search(int num) {
		boolean check = false;
		for (int a = 0; a < count; a++) {
			if(integers[a] == num)
				check = true;
		}
		return check;
	}
	public  int findMax() {
		max = 0;
		for (int b = 0; b <= count; b++) {
			if (b == 0)
				max = integers[b];
			else {
				if (integers[b] > max)
					max = integers[b];
			}	
		} 
		return max;
	}
	public int findMin() {
		min = 0;
		for (int c = 0; c < count; c++) {
			if (c == 0)
				min = integers[c];
			else {
				if (integers[c] < min)
					min = integers[c];
			}

		} 
		return min;
	}
	public int findMaxPos() {
		int max = Integer.MIN_VALUE;//Is it okay to use Math functions like this? I wasn't sure so
		int maxPos = 0;
		for (int d = 0; d < integers.length; d++) {
			if (integers[d] > max) {
				max = integers[d];
				maxPos = d;
			}
		}
		return maxPos;
	}
	public int findMinPos() {
		int min = Integer.MAX_VALUE;
		int minPos = 0;
		for (int e = 0; e < integers.length; e++) {
			if (integers[e] > min) {
				min = integers[e];
				minPos = e;
			}
		}
		return minPos;
	}

}
