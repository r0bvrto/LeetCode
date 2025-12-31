import java.util.Arrays;
import java.util.HashSet;

public class Existe {
	 public boolean checkIfExist(int[] arr) {
		 HashSet<Integer> hs = new HashSet();
			for(int num : arr) {
				if(hs.contains(2*num) || (num % 2 == 0 && hs.contains(num / 2))) {
					return true;
				}
				hs.add(num);
			}
			return false;
	    }
	 public static void main(String[] args) {
		Existe ex = new Existe();
		int[]arr = {10,2,5,3};
		System.out.println(ex.checkIfExist(arr));
	}
}
