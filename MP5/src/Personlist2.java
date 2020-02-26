import java.util.ArrayList;
public class Personlist2 {
	
	private ArrayList<Person> people;
	private int num = 0 ;
		
	
	public Personlist2() {
		
		people = new ArrayList<Person>();
	}
	
	public void add() {
		
		Person Elias = new Person("Elias", "M", 96, 136, 20);
		people.add(Elias);
		
		Person Ethan = new Person("Ethan", "M", 106, 134, 20);
		people.add(Ethan);
		
		Person Anthony = new Person("Anthony", "M", 109, 148, 19);
		people.add(Anthony);
		
		Person Ains = new Person("Ains", "M", 167, 153, 87);
		people.add(Ains);
		
		Person Yamcha = new Person("Unohana", "F", 147, 139, 34);
		people.add(Yamcha);
	}
	
public void returntallest() {
		
		int tallest = 0;
		String tallestPerson = " ";
		for(Person r: people) {
			if(r==null) {
				break;
			}
			
			if (r.getheight() > tallest) {
				tallestPerson = r.getname();
				tallest = r.getheight();
			}
			
		}
		System.out.println("Tallest Person is: " + tallestPerson + " at height: " + tallest);
	}
	
	public void print() {
		for(Person z: people) {
			if(z==null) {break;}
			System.out.println("Name: " + z.getname() + " age: " + z.getage() + " gender: " + z.getgender() + " height/weight: " + z.getheight() + "/" + z.getweight());
		}
	}
}
