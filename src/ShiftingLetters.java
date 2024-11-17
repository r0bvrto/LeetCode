
public class ShiftingLetters {
	public String shiftingLetters(String s, int[] shifts) {
		char[] letra = s.toCharArray();
		for (int i = 0; i < letra.length; i++) {
			for (int j = i; j < shifts.length; j++) {
				letra[i] += shifts[j];
				if (letra[i] > 'z') {
					letra[i] = (char) ('a' + (letra[i] - 'z' - 1));
				}
			}
		}
		String palabra = new String(letra);
		return palabra;
	}

	public static void main(String[] args) {
		ShiftingLetters sl = new ShiftingLetters();
		int[] shifts = {52};
		System.out.println(sl.shiftingLetters("z", shifts));

	}
}
