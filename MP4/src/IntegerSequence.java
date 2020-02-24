import java.util.ArrayList;
public class IntegerSequence {
	
	private ArrayList<Integer> values;
	
	public IntegerSequence() {
		
		values = new ArrayList<Integer>();
	}
	
	public void add(int num) {
		
		values.add(num);
	}
	
	public String toString() {
		return values.toString();
	}
	
	public IntegerSequence append(IntegerSequence other) {
		
		IntegerSequence appended = new IntegerSequence();
		appended.values.addAll(values);
		appended.values.addAll(other.values);
		return appended;
	}
}
