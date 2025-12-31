import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> mapa = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int resta = target - nums[i];
			
			if(mapa.containsKey(resta)) {
				return new int[] {mapa.get(resta), i};
			} else {
				mapa.put(nums[i], i);
			}
		}
	return new int[] {};
	}
}
