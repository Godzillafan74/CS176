
public class Father extends FamilyExpression{
	
	public String fName;
	public String [] fatherGenes;
	int five = 5;
	
	public Father(String[] characters, String[][] expression, String[] combo) {
		super(characters, expression, combo);
		fatherGenes = new String [five];
	}
	public void fatherName(String sName) {
		fName = sName;
	}
}
