import java.util.Scanner;
	public class Personlist1 {
	
 		    Scanner in = new Scanner(System.in);

			int count = 0;

			Person [] persons;

			public Personlist1(int capacity){

				persons = new Person[capacity];

			}
	public void addPerson1(Person scanPerson) {

				{
					persons[count] = scanPerson;
					count++;

				}

			}

			public Person ReturnTallestPerson1() {

				Person tallest = persons[0];
				
				for(int i = 0; i < count; i++) {

					if(persons[i].height() > tallest.height()) {

						tallest = persons[i];

					}

				}

				return tallest;

			}

			public void printPersonList1() {

				for(int i = 0; i < count; i++) {

					System.out.print((persons.toString()));

				}

			}

		}

