import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();

		while (n != 1) {
			int digitos = 0;
			int temp = n;
			int suma = 0;
			while (temp > 0) {
				digitos = temp % 10;
				digitos = digitos * digitos;
				temp = temp / 10;
				suma += digitos;
			}
			n = suma;
			if (set.contains(suma)) {
				return false;
			} else {
				set.add(suma);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		boolean valor = hn.isHappy(4);
		System.out.println(valor);
	}
}
