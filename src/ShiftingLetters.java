
public class ShiftingLetters {
	public String shiftingLetters(String s, int[] shifts) {
		char[] letra = s.toCharArray();
		int sum = 0;

		for (int i = letra.length - 1; i >= 0; i--) {
			int shift = shifts[i % shifts.length] % 26;

			sum = (sum + shifts[i]) % 26;
			letra[i] = (char) ('a' + ((sum + letra[i] - 'a') % 26));
		}
		return new String(letra);
	}

	public static void main(String[] args) {
		ShiftingLetters sl = new ShiftingLetters();
		int[] shifts = { 52 };
		System.out.println(sl.shiftingLetters("z", shifts));

	}
}
