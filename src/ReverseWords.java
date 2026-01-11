import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
	public String reverseWords(String s) {
		String[] oracion  = s.trim().split("\\s+");
		ArrayList<String> lista = new ArrayList<>(Arrays.asList(oracion).reversed());
		s = "";
		for(String p : lista) {
				s += p + " ";
		}
		return s.trim();
	}
	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();
		String valor = rw.reverseWords("a good   example");
		System.out.println(valor);
	}
}
