
public class ContandoBits {
	public static void main(String[] args) {
		int num = 5;
		int[] resultado = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			int temp = i;
			int uno = 0;

			while (temp > 0) {
				if (temp % 2 == 1) {
					uno++;
				}
				temp /= 2;

			}
			resultado[i] = uno;
		}
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
}
