import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(nums));
		Set <Integer> s = new HashSet(a);
		return s.size();
	}
	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(rd.removeDuplicates(nums));
	}
}
