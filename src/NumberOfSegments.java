
public class NumberOfSegments {
	public int countSegments(String s) {
		String[] palabras = s.split(" ");
		int num = 0;
		for (String palabra : palabras) {
			if (!palabra.isEmpty()) {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		NumberOfSegments nof = new NumberOfSegments();
		System.out.println(nof.countSegments(", , , ,        a, eaefa"));
	}
}
