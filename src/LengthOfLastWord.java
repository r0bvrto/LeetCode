
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		String[] palabras = s.split(" ");
		return palabras[palabras.length - 1].length();
	}

	public static void main(String[] args) {
		LengthOfLastWord lolw = new LengthOfLastWord();
		System.out.println(lolw.lengthOfLastWord("Hello World"));
	}
}
