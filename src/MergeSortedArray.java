import java.util.Arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] nums3 = Arrays.copyOf(nums1, m+n);
		for(int i = 0; i < nums2.length; i++) {
			nums3[m + i] = nums2[i];
		}
		Arrays.sort(nums3);
		System.out.println(Arrays.toString(nums3));
	}

	public static void main(String[] args) {
		MergeSortedArray m = new MergeSortedArray();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		m.merge(nums1, nums1.length, nums2, nums2.length);
	}
}
