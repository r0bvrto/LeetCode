import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArray {
//	public int[] intersection(int[] nums1, int[] nums2) {
//		ArrayList<Integer> ar = new ArrayList();
//		int[]array;
//		for(int i = 0; i < nums1.length; i++) {
//			for(int j = 0; j < nums2.length; j++) {
//				if(nums1[i] == nums2[j]) {
//					ar.add(nums1[i]);
//					break;
//				}
//			}
//		}
//		array =  new int[ar.size()];
//		for(int i = 0; i < ar.size();i++) {
//			array[i] = ar.get(i);
//		}
//        return array;
//	}
	public int intersection(int[] nums1, int[] nums2) {
		HashSet<Integer>hs = new HashSet();
		int[]array;
		for (int num : nums1) {
	        hs.add(num);
	    }
		HashSet<Integer>hs2 = new HashSet();
		for (int num : nums2) {
			if(hs.contains(num))
	        hs2.add(num);
	    }
		if (hs2.isEmpty()) {
            return -1;
        }
		array =  new int[hs2.size()];
		int index = 0;
        for (int num : hs2) {
            array[index++] = num;
        }
        Arrays.sort(array);
        return array[0];
	}
	public static void main(String[] args) {
		IntersectionArray in = new IntersectionArray();
		int [] nums1 = {1,2,8,12,32,34,43,52,57,62,64,67,71,71,79,81,86,91,93,94};
		int [] nums2 = {9,11,12,14,19,25,29,31,38,39,41,42,58,63,66,70,71,73,91,91};
		System.out.println(in.intersection(nums1, nums2));
	}
}
