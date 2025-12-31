
public class HashDividedString {
	public String stringHash(String s, int k) {
		int suma = 0;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			int valor = c[i] - 'a';
			suma += valor;
		}
		suma = suma % 26;
		char car = (char) ('a' + suma);
		System.out.println(car);
		return "halo";
	}
	public static void main(String[] args) {
		HashDividedString hds = new HashDividedString();
		System.out.println(hds.stringHash("abcd", 2));
	}
}
