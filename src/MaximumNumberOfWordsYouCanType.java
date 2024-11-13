
public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
		String[] palabras = text.split(" ");
		int num = palabras.length;
		for (String palabra : palabras) {
		    for (char letra : brokenLetters.toCharArray()) {
		        if (palabra.contains(String.valueOf(letra))) {
		            num--;
		            break;
		        }
		    }
		}
		return num;
	}
	public static void main(String[] args) {
		MaximumNumberOfWordsYouCanType m = new MaximumNumberOfWordsYouCanType();
		System.out.println(m.canBeTypedWords("leet code", "lt"));
	}
}
