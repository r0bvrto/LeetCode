
public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
		int num = 0;
		String[] palabras = text.split(" ");
		for(char letra : brokenLetters.toCharArray()) {
			for(int i = 0; i < palabras.length; i++) {
				if(palabras[i].contains(String.valueOf(letra))) {
					num++;
				}	
			}
		}
		return num;
	}
	public static void main(String[] args) {
		MaximumNumberOfWordsYouCanType m = new MaximumNumberOfWordsYouCanType();
		System.out.println(m.canBeTypedWords("hello world", "ad"));
	}
}
