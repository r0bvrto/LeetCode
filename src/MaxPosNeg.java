
public class MaxPosNeg {
	public int maximumCount(int[] nums) {
		int mayor = 0;
		int pos = 0;
		int neg = 0;
		for (int num : nums) {
			if (num > 0) {
				pos++;
			}
			if (num < 0) {
				neg++;
			}
		}
		if (pos > neg) {
			mayor = pos;
		} else if (neg > pos) {
			mayor = neg;
		} else {
			mayor = pos;
		}
		return mayor;
	}

	public static void main(String[] args) {
		MaxPosNeg mpn = new MaxPosNeg();
		int[] array = { -2, -1, -1, 1, 2, 3 };
		System.out.println(mpn.maximumCount(array));
	}
}
