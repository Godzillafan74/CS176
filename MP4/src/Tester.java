
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			IntegerSequence integersequence1 = new IntegerSequence();
			IntegerSequence integersequence2 = new IntegerSequence();
			IntegerSequence integersequence3 = new IntegerSequence();
			
			StringSequence stringsequence1 = new StringSequence();
			StringSequence stringsequence2 = new StringSequence();
			StringSequence stringsequence3 = new StringSequence();
			
			integersequence1.add(1);
			integersequence1.add(4);
			integersequence1.add(9);
			integersequence1.add(16);
			
			integersequence2.add(9);
			integersequence2.add(7);
			integersequence2.add(4);
			integersequence2.add(9);
			integersequence2.add(11);
			
			integersequence3 = integersequence1.append(integersequence2);
			
			System.out.println("Sequence 1 before append: " + integersequence1.toString());
			System.out.println("Sequence 2 before append: " + integersequence2.toString());
			System.out.println("Sequence 3: " + integersequence3.toString());
			System.out.println();
			
			stringsequence1.add("Godzilla");
			stringsequence1.add("Mothra");
			stringsequence1.add("Rodan");
			stringsequence1.add("King Ghidorah");
			
			stringsequence2.add("Elias");
			stringsequence2.add("Csipkay");
			stringsequence2.add("CS Major");
			stringsequence2.add("IT & Math Minor");
			stringsequence2.add("Potato");
			stringsequence2.add("Zucchini");
			
			stringsequence3 = stringsequence1.append(stringsequence2);
			
			System.out.println("Sequence 1 before append: " + stringsequence1.toString());
			System.out.println("Sequence 2 before append: " + stringsequence2.toString());
			System.out.println("Sequence 3: " + stringsequence3.toString());
			
			
	}

}
