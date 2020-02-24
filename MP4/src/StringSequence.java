import java.util.ArrayList;
public class StringSequence {
	
	private ArrayList<String> words;
	
	public StringSequence() {
		
		words = new ArrayList<String>();
	}
	
	public void add(String word) {
		
		words.add(word);
	}
	
	public String toString() {
		
		return words.toString();
	}
	
	public StringSequence append(StringSequence other) {
		
		StringSequence appended = new StringSequence();
		appended.words.addAll(words);
		appended.words.addAll(other.words);
		return appended;
	}
	
}
