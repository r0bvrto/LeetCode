import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAcronymOfWords {
	public boolean isAcronym(List<String> words, String s) {
		if (words.size() != s.length()) {
			return false;
		}

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).charAt(0) != s.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		StringAcronymOfWords saw = new StringAcronymOfWords();
		ArrayList<String> palabras = new ArrayList<>(Arrays.asList("alice", "bob", "charlie"));
		System.out.println(saw.isAcronym(palabras, "abc"));
	}
}
