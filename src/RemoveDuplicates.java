import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			boolean duplicado = false;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {

					duplicado = true;
					break;
				}
			}
			if (!duplicado) {
				nums[index] = nums[i];
				index++;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(rd.removeDuplicates(nums));
	}
}
