package arrayPrograms;

import java.util.Arrays;

public class Median_of_MeargedArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 4, 5 };

		System.out.println(findMedianSortedArrays(arr1, arr2)); 

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] nums3 = new int[nums1.length + nums2.length];

		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i];
		}

		for (int i = 0; i < nums2.length; i++) {
			nums3[nums1.length + i] = nums2[i];
		}

		Arrays.sort(nums3);

		int mid = nums3.length / 2;
		if (nums3.length % 2 == 0)
			return (double) nums3[mid];
		else 
			return (double) (nums3[mid - 1] + nums3[mid]) / 2;

	}

}
