import java.util.ArrayList;
import java.util.List;

public class StringAcronymOfWords {
	public boolean isAcronym(List<String> words, String s) {
		ArrayList <String> a = new ArrayList();
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			a.add(String.valueOf(s.charAt(i)));
		}
		return false;

	}
	public static void main(String[] args) {
		StringAcronymOfWords saw = new StringAcronymOfWords();
		ArrayList<String> palabras = new ArrayList();
		System.out.println(saw.isAcronym(palabras, "abc"));
	}
}
