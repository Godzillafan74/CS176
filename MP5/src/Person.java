public class Person {

	private String name, gender; 
	private int height, weight, age;
	
	public Person(String a, String b, int c, int d, int e) {
		name = a;
		gender = b;
		height = c;
		weight = d;
		age = e;
	}
	
	public String getname() {
		return name;
	}
	
	public String getgender() {
		
		return gender;
	}
	
	public int getheight() {
		
		return height;
	}
	
	public int getweight() {
		
		return weight;
	}
	
	public int getage() {
		
		return age;
	}
}