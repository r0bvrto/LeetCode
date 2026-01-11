import java.util.Arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] nuevo  = Arrays.copyOfRange(nums1, 0, m);
		int[] nuevo2 = Arrays.copyOfRange(nums2, 0, n);


		int[] nums3 = Arrays.copyOf(nuevo, m + n);

		for(int i = 0; i < nuevo2.length; i++) {
			nums3[m + i] = nuevo2[i];
		}

		Arrays.sort(nums3);

		for(int i = 0; i < nums3.length; i++) {
			nums1[i] = nums3[i];
		}
		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		MergeSortedArray m = new MergeSortedArray();
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int[] nums2 = {1,2,2};
		m.merge(nums1, 6, nums2, 3);
	}
}
