import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesArrayII {
	public int removeDuplicates(int[] nums) {
		HashMap<Integer, Integer> mapa = new HashMap<>();
        int atras = 0;
        int delante = nums.length - 1;
        while(atras <= delante) {
    		mapa.put(nums[atras], mapa.getOrDefault(nums[atras], 0) + 1);
    		int temp = nums[atras];
        		if(mapa.get(nums[atras]) > 2) {
        			for (int i = atras; i < delante; i++) {
        			    nums[i] = nums[i + 1];
        			}
        			nums[delante] = temp;
        			delante--;
        	}else {
        		atras++;
        	}
        }
		return atras;
    }
	public static void main(String[] args) {
		RemoveDuplicatesArrayII rda2 = new RemoveDuplicatesArrayII();
		int valor = rda2.removeDuplicates(new int [] {1,1,1,2,2,3});
		System.out.println(valor);
	}
}
