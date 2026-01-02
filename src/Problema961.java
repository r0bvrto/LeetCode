import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problema961 {
	public int repeatedNTimes(int[] nums) {
		int n = 0;
		HashMap<Integer, Integer> mapa = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(mapa.containsKey(nums[i])) {
				mapa.put(nums[i], mapa.get(nums[i]) + 1);
				System.out.println(mapa.get(nums[i]));
			}else {
				mapa.put(nums[i], 1);
			}
		}
		int maxValue = Collections.max(mapa.values());
		for(Map.Entry<Integer, Integer>entry :mapa.entrySet()) {
			if(entry.getValue() == maxValue) {
				n = entry.getKey();
			}
		}
       return n;
    }
	public static void main(String[] args) {
		Problema961 pb = new Problema961();
		int sol = pb.repeatedNTimes(new int[] {1, 2, 3, 3});
		System.out.println(sol);
	}
}
