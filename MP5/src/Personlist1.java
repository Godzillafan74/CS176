public class Personlist1 {

	private Person[] persons;
	private int num = 0 ;
		
	public Personlist1(int capacity) {
		
		persons = new Person[capacity];
	}
	
	public void addPeople() {
		
		Person Elias = new Person("Elias", "M", 96, 136, 20);
		persons[num] = Elias;
		num++;
		
		Person Ethan = new Person("Ethan", "M", 106, 134, 20);
		persons[num] = Ethan;
		num++;
		
		Person Anthony = new Person("Anthony", "M", 109, 148, 19);
		persons[num]  = Anthony;
		num++;
		
		Person Ains = new Person("Ains", "M", 167, 153, 87);
		persons[num] = Ains;
		num++;
		
		Person Yamcha = new Person("Unohana", "F", 147, 139, 34);
		persons[num] = Yamcha;
		num++;
	}
	
	public void returntallest() {
		
		int tallest = 0;
		String tallestPerson = " ";
		for(Person x: persons) {
			if(x==null) {
				break;
			}
			
			if (x.getheight() > tallest) {
				tallestPerson = x.getname();
				tallest = x.getheight();
			}
			
		}
		System.out.println("Tallest Person is: " + tallestPerson + " at height: " + tallest);
	}
	
	public void print() {
		for(Person z: persons) {
			if(z==null) {break;}
			System.out.println("Name: " + z.getname() + " age: " + z.getage() + " gender: " + z.getgender() + " height/weight: " + z.getheight() + "/" + z.getweight());
		}
	}
}