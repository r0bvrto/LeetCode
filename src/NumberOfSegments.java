
public class NumberOfSegments {
	public int countSegments(String s) {
		if(s.isEmpty()) {
			return 0;
		}else {
			String[] palabras = s.trim().split(" ");
			return palabras.length;
		}
		
	}

	public static void main(String[] args) {
		NumberOfSegments nof = new NumberOfSegments();
		System.out.println(nof.countSegments(", , , ,        a, eaefa"));
	}
}
