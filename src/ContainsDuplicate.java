import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set <Integer> s = new HashSet();
		for (int i = 0; i < nums.length; i++) {
				if (!s.add(nums[i])) {
					return true;
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
