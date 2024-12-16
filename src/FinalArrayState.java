import java.util.Arrays;

public class FinalArrayState {
	public int[] getFinalState(int[] nums, int k, int multiplier) {
		for (int operacion = 0; operacion < k; operacion++) {
			int minIndex = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[minIndex] > nums[i]) {
					minIndex = i;
				}
			}
			nums[minIndex] *= multiplier;
		}

		return nums;
	}

	public static void main(String[] args) {
		FinalArrayState fas = new FinalArrayState();
		int[] nums = { 1, 2 };
		int[] resultado = fas.getFinalState(nums, 3, 4);
		System.out.println(Arrays.toString(resultado));
	}
}
