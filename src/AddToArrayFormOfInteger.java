import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> a = new ArrayList<>();
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			s.append(num[i]);
			System.out.println(s.toString());
		}
		int nums = Integer.parseInt(s.toString());
		int suma = nums + k;
		String sumaStr = Integer.toString(suma);
		for (int i = 0; i < sumaStr.length(); i++) {
			a.add(Character.getNumericValue(sumaStr.charAt(i)));
		}
		return a;
	}

	public static void main(String[] args) {
		AddToArrayFormOfInteger ad = new AddToArrayFormOfInteger();
		int[] num = { 1, 2, 0, 0 };
		System.out.println(ad.addToArrayForm(num, 34));
	}
}
