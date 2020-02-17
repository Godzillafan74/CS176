import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Class2 {
	int[] nums;

	public int [] arrays(int size) {
		nums = new int[size];
		return nums;
	}
//	List<String> list=Arrays.asList(words);
	public int [] load() {
		System.out.println("Put a list of Integers into the array:" );
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		return nums;
	}
	public void search(int inNum) {
		if(Arrays.asList(nums).contains(inNum))
		{
			System.out.println("Word found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
	public int findMax() {
		Arrays.sort(nums);
		int maxValue = nums[0];
		System.out.println("The biggest integer value is: " + maxValue);
		return maxValue;
	}
	
	public int findMin() {
		Arrays.sort(nums);
		int minValue = nums[nums.length-1];
		System.out.println("The smallest integer value is: " + minValue);
		return minValue;
	}
	
	public int findMaxPos (int [] array)
	{
		int maxLength = 0;
		int longestint = 0;
		for (int s : array)
		{
			if (s > maxLength)
			{
				maxLength = s;
				longestint = s;
 			}
		}
		System.out.println("Longest Integer: " + longestint);
		return longestint;
	}
	
	public int findMinPos (int [] array)
	{
		int shortestint = 0;
		for (int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if (array[i] < array[j])
				{
					shortestint = array[i];
				}
			}
		}
		System.out.println("Shortest Integer: " + shortestint);
		return shortestint;
		
	}
}
