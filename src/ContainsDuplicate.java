import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate cd = new ContainsDuplicate();
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(cd.containsDuplicate(nums));
	}

}
