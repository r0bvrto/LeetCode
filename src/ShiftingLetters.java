
public class ShiftingLetters {
	public String shiftingLetters(String s, int[] shifts) {
		char[] letra = s.toCharArray();
		for (int i = 0; i < letra.length; i++) {
			int shift = shifts[i % shifts.length] % 26;

			letra[i] += shift;

			if (letra[i] > 'z') {
				letra[i] = (char) ('a' + (letra[i] - 'z' - 1));
			}
		}
		return new String(letra);
	}

	public static void main(String[] args) {
		ShiftingLetters sl = new ShiftingLetters();
		int[] shifts = { 52 };
		System.out.println(sl.shiftingLetters("z", shifts));

	}
}
