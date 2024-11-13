
public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
		String[] palabras = text.split(" ");
		for(int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		return 0;
	}
	public static void main(String[] args) {
		MaximumNumberOfWordsYouCanType m = new MaximumNumberOfWordsYouCanType();
		System.out.println(m.canBeTypedWords("hello world", "a"));
	}
}
