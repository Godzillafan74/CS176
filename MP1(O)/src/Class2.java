import java.util.Scanner;
public class Class2 {
	int[] nums;
	int sum;
	public int [] arrays(int size) {
		nums = new int[size];
		return nums;
	}
		
	public int [] load() {
		System.out.println("Put a list of numbers into the array: ");
		Scanner in = new Scanner(System.in);
		sum = 0;
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
			sum += nums[i];
		}
		return nums;
	}
	
	public void print() {
		double avg = sum/nums.length;
		System.out.println("The average of the array is:" + avg);

		for(int i = nums.length - 1; i >= 0; i--) {	
			if (nums[i] > avg) {
				System.out.println("above average");
			} else {
				System.out.println("below average");
			}
			
			System.out.println(nums[i]);
			
		}
		
	
	}
}