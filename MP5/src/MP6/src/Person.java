
public class Person {

	private String name;
	private int age;
	private double weight;
	private double height;
	private String gender;

	public Person(String sName, String sGender, double sHeight, double sWeight, int sAge) {

		name = sName;
		gender = sGender;
		height = sHeight;
		weight = sWeight;
		age = sAge;
	}
	public String name() {

		return name;
	}
	public String gender() {

		return gender;
	}
	public double height() {

		return height;
	}
	public double weight() {

		return weight;
	}
	public int age() {

		return age;
	}
	public void printData() {

		System.out.println("The tallest person's information is: Name: " + name + " Gender: " + gender + " Height: " + height + " Weight: " + weight + " Age " + age);
	}

}
