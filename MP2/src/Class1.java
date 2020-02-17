import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Class1 {
	String[] words;

	public String [] arrays(int size) {
		words = new String[size];
		return words;
	}
	
	public String [] load() {
		System.out.println("Put a list of Strings of words or letters into the array:" );
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < words.length; i++){
			words[i] = in.nextLine();
		}
		return words;
	}
	public void search(String inWord) {
		if(Arrays.asList(words).contains(inWord))
		{
			System.out.println("Word found");
		}
		else
		{
			System.out.println("Not found");
		}
		
		
	}
	public String findMax () {
		Arrays.sort(words);
		String maxValue = words[0];
		System.out.println("The string with the highest abc value is: " + maxValue);
		return maxValue;
	}
	
	public String findMin () {
		Arrays.sort(words);
		String minValue = words[words.length-1];
		System.out.println("The string with the lowest abc value is: " + minValue);
		return minValue;
	}
	
	public String findLongest (String [] array)
	{
		int maxLength = 0;
		String longestString = null;
		for (String s : array)
		{
			if (s.length() > maxLength)
			{
				maxLength = s.length();
				longestString = s;
 			}
		}
		System.out.println("Longest String: " + longestString);
		return longestString;
	}
	
	public String findShortest (String [] array)
	{
		String shortestString = null;
		for (int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if (array[i].length() < array[j].length())
				{
					shortestString = array[i];
				}
			}
		}
		System.out.println("Shortest String: " + shortestString);
		return shortestString;
		
	}
}
