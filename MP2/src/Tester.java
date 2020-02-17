import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String
		Class1 a = new Class1();
		String [] arr = a.arrays(10);
		a.load();
		a.findMax();
		a.findMin();
		a.findLongest(arr);
		a.findShortest(arr);
		a.search("the");
		//integer
		Class2 b = new Class2();
		int [] arra = b.arrays(10);
		b.load();
		b.findMax();
		b.findMin();
		b.findMaxPos(arra);
		b.findMinPos(arra);
		
		
	}	
}