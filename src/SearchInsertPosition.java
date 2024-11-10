import java.util.Arrays;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int index = 0;
		int [] nums2 = Arrays.copyOf(nums, nums.length + 1);
		nums2[nums.length] = target;
		Arrays.sort(nums2);
		for(int i = 0; i < nums2.length; i++) {
			if(nums2[i] == target) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		SearchInsertPosition si = new SearchInsertPosition();
		int [] nums = {1,3,5,6};
		
	}
}
