
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		//String borrar = ":,.!¡?¿@%&/()=#_";
		//String regex = "["+ borrar + "\\s]";
		String quitar = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		String reves = new StringBuilder(quitar).reverse().toString();

		return quitar.equals(reves);

	}
	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome("ab@a"));
	}
}
