
public class ShiftingLetters {
	public String shiftingLetters(String s, int[] shifts) {
		char[] letra = s.toCharArray();
		for(int i = 0; i < letra.length; i++) {
			for(int j = 0; j < shifts.length; j++) {
				letra[i] += shifts[j];
				System.out.println(letra);
			}
		}
		return "";
	}

	public static void main(String[] args) {
		ShiftingLetters sl = new ShiftingLetters();
		int[] shifts = {3,5,9};
		System.out.println(sl.shiftingLetters("abc", shifts));
		char letra = 'a';
		letra = 'a' + 3;
		System.out.println(letra);
	}
}
