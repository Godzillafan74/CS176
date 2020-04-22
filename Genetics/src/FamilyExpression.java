
public class FamilyExpression extends Characteristics{
	
	public String[][] Expressions;
	public String[] Combinations;
	int five = 5;
	int four = 4;

	public FamilyExpression(String[] characters, String[][] expression, String[] combo) {
		super(characters);
		Expressions = new String[five][four];
		Expressions = expression;
		Combinations = new String[four];
		Combinations = combo;
	}
}
