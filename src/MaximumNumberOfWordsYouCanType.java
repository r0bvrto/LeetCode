
public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
		for(char letra : brokenLetters.toCharArray()) {
			if(text.contains(String.valueOf(letra))) {
				System.out.println("contiene");
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		MaximumNumberOfWordsYouCanType m = new MaximumNumberOfWordsYouCanType();
		System.out.println(m.canBeTypedWords("hello world", "ad"));
	}
}
