
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 Tester = new Class1();

		Tester.load();

		System.out.println("Is the string 'the' in the array:  " + Tester.search("the"));
		System.out.println("The max in the abc ordering is: " + Tester.findMax());

		System.out.println("The min in the abc ordering is: " + Tester.findMin());



		System.out.println("The longest string is: " + Tester.findLongest());
				

		System.out.println("The shortest string is: " + Tester.findShortest());
		
		Class2 IntegersTester = new Class2();

		IntegersTester.load();
		IntegersTester.search(1);
		IntegersTester.findMax();
		IntegersTester.findMin();
		IntegersTester.findMaxPos();
		IntegersTester.findMinPos();

		System.out.println("Was the number in the search found: " + IntegersTester.search(2));
		System.out.println("The max value in the array is: " + IntegersTester.findMax());
		System.out.println("The min value in the array is: " + IntegersTester.findMin());
		System.out.println("The max value index position is: " + IntegersTester.findMaxPos());
		System.out.print("The min value index position is: " + IntegersTester.findMinPos());
	}

}
