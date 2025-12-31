
public class SingleNumber {
	public int singleNumber(int[] nums) {
		int numeroUnico = 0;
		for (int num : nums) {
			numeroUnico ^= num;
		}
		return numeroUnico;
	}
}
