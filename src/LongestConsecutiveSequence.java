import java.util.Arrays;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		int largo = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > nums[i]) {
				
			}else {
				largo++;
			}
		}
		return largo;
	}
	public static void main(String[] args) {
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		int[] nums = {100,4,200,1,3,2};
		System.out.println(lcs.longestConsecutive(nums));
	}
}
