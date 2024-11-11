
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			index++;
		}
		return index;
	}
	public static void main(String[] args) {
		LengthOfLastWord lolw = new LengthOfLastWord();
		System.out.println(lolw.lengthOfLastWord("Hello World"));
	}
}
