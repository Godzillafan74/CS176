
public class Tester {
	public static void main(String[] args) {

		Person Person1 = new Person("Elias;", "Male;", 6.5, 140, 20);
		Person Person2 = new Person("Ethan;", "Male;", 6.3, 160, 21);
		Person Person3 = new Person("Michael;", "Male;", 6.6, 140, 24);
		Person Person4 = new Person("Anna;", "Female;", 5.2, 110, 16);
		Person Person5 = new Person("Sam;", "Female;", 5.4, 130, 26);

		Personlist1 PersonList1Tester = new Personlist1(100);

		PersonList1Tester.addPerson1(Person1);
		PersonList1Tester.addPerson1(Person2);
		PersonList1Tester.addPerson1(Person3);
		PersonList1Tester.addPerson1(Person4);
		PersonList1Tester.addPerson1(Person5);

		Personlist2 PersonList2Tester = new Personlist2();

		PersonList2Tester.addPerson2(Person1);
		PersonList2Tester.addPerson2(Person2);
		PersonList2Tester.addPerson2(Person3);
		PersonList2Tester.addPerson2(Person4);
		PersonList2Tester.addPerson2(Person5);

		System.out.print("The tallest person in the array is: ");
		PersonList1Tester.ReturnTallestPerson1().printData();

		System.out.print("The tallest person in the array list is: ");
		PersonList2Tester.ReturnTallestPerson2().printData();

	}



}
