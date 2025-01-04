import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != i) {
				return i;
				
			}
		}
		return nums.length;
	}
	public static void main(String[] args) {
		int [] array = {9,6,4,2,3,5,7,0,1};
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.missingNumber(array));
	}
}
