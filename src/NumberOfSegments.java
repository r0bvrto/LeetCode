import java.util.Iterator;

public class NumberOfSegments {
	public int countSegments(String s) {
		String[] palabras = s.split(" ");
		return palabras[palabras.length].length();
	}

	public static void main(String[] args) {
		NumberOfSegments nof = new NumberOfSegments();
		System.out.println(nof.countSegments("Hola mundo"));
	}
}
