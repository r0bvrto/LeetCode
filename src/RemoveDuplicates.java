import java.util.Arrays;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(i == j) {
					nums[j]--;
				}
			}
		}
	}
	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = {1,1,2};
		rd.removeDuplicates(nums);
	}
}
