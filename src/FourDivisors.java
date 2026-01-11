import java.util.ArrayList;

public class FourDivisors {

	public int sumFourDivisors(int[] nums) {
		int suma = 0;
		int numeroDividir = 1;
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			numeroDividir = 1;
			while (numeroDividir <= nums[i]) {
				if (nums[i] % numeroDividir == 0) {
					lista.add(numeroDividir);
					numeroDividir++;
				}
					numeroDividir++;
				if (lista.size() > 4) {
					lista.clear();
					break;
				}

			}
			if(lista.size() < 4) {
				lista.clear();
			}
			for(int num : lista) {
				suma += num;
			}
			lista.clear();
		}
		return suma;
	}

	public static void main(String[] args) {
		FourDivisors fd = new FourDivisors();
		int valor = fd.sumFourDivisors(new int[] { 21, 4, 7 });
		System.out.println(valor);
	}
}
