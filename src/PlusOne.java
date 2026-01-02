import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		digits[digits.length - 1] += 1;
		int[] nuevoArray = new int[digits.length + 1];
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] > 9) {
				digits[i] = 0;
				if(i - 1 >= 0) {
		            digits[i - 1] += 1; 
				}else {
					System.out.println(Arrays.toString(digits));
					nuevoArray[0] = 1;
					for(int j = 2; j < nuevoArray.length; j++) {
						nuevoArray[j] = digits[j - 1];
					}
					return nuevoArray;
				}
			}
		}
        return digits;
    }
	public static void main(String[] args) {
		PlusOne po = new PlusOne();
		int[] valor = po.plusOne(new int[] {8,9,9,9});
		System.out.println(Arrays.toString(valor));
	}
}
