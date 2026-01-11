import java.util.Arrays;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int conteo = 0;
		while(conteo < k) {
			int ultimo = nums[nums.length - 1];
			for(int i = nums.length - 1; i > 0; i--) {
				nums[i] = nums[i - 1];
		}
			nums[0] = ultimo;
			conteo++;
		}
	}
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		ra.rotate(new int[] {1,2,3,4,5,6,7}, 3);
	}
}
