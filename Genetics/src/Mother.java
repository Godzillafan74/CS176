
public class Mother extends FamilyExpression {

	public String [] motherGenes;
	public String mName;
	int five  = 5;
	
 	public Mother(String[] characters, String[][] expression, String[] combo) {
		super(characters, expression, combo);
		motherGenes = new String[five];
	}
 	public void motherName(String sName) {
 	mName = sName;
 	}
}
