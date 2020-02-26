
public class Tester {

	public static void main(String[] args) {
		
		Personlist1 per = new Personlist1(100);
		per.addPeople();
		per.print();
		per.returntallest();
		System.out.println(" ");
		
		Personlist2 pe = new Personlist2();
		pe.add();
		pe.print();
		pe.returntallest();
	}

}
