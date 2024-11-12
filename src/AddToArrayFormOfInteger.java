import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> a = new ArrayList<>();
		String numero = "";
		StringBuilder s = new StringBuilder(numero);
		for(int i = 0; i < num.length; i++) {
			s.append(num[i]);
			System.out.println(s.toString());
		}
		return a;
	}
	public static void main(String[] args) {
		AddToArrayFormOfInteger ad = new AddToArrayFormOfInteger();
		int[] num = {1,2,0,0};
		System.out.println(ad.addToArrayForm(num, 0));
	}
}
