
public class WordPrefixOfWord {
	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] palabras = sentence.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].startsWith(searchWord)) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		WordPrefixOfWord wow = new WordPrefixOfWord();
		System.out.println(wow.isPrefixOfWord("i love eating burger", "burg"));
	}

}
