
public class WordPrefixOfWord {
	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] palabras = sentence.split(" ");
		int num = 0;
		for(String palabra : palabras) {
			if(palabra.contains(searchWord)) {
				num++;
			}
		}
		if(num == 0) {
			return -1;
		}
		return num;
	}

}
