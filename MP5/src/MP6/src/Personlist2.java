import java.util.ArrayList;
public class Personlist2 {

	ArrayList<Person> newPersons;

	public Personlist2() {

		newPersons = new ArrayList<Person>();

	}

	public void addPerson2(Person sPerson) {

		newPersons.add(sPerson);

	}

	public Person ReturnTallestPerson2() {

		Person tallest = newPersons.get(0);

		for(int i = 0; i < newPersons.size(); i++) {	

			if(newPersons.get(i).height() > tallest.height()) {

				tallest = newPersons.get(i);

			}

		}

		return tallest;

	}

	public void printPersonList2() {

        }

	}
