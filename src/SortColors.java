import java.util.Arrays;

public class SortColors {
	public void sortColors(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		SortColors sc = new SortColors();
		int[] array = { 2, 0, 2, 1, 1, 0 };
		sc.sortColors(array);

	}

}
