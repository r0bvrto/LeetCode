
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		int s = 0;
		int t = 0;
		for (int i = 0; i < num1.length(); i++) {
			char c = num1.charAt(i);
			s = s * 10 + (c - '0');
		}
		for (int i = 0; i < num2.length(); i++) {
			char c = num2.charAt(i);
			t = t * 10 + (c - '0');
		}

		int resulNum = s * t;
		String resultado = Integer.toString(resulNum);
		return resultado;
	}

	public static void main(String[] args) {
		MultiplyStrings ms = new MultiplyStrings();
		System.out.println(ms.multiply("123456789", "987654321"));
	}

}
