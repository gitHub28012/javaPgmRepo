package arrayPrograms;

import java.util.HashMap;

 public class SumOfAllUniqueElementInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 2, 3, 2, 1, 5 };
		System.out.println(sumOfUniqueElementInArray(arr));

	}

	public static int sumOfUniqueElementInArray(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 1;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}

		// it is for sum of unique element

		for (Integer set : map.keySet()) {
			if (map.get(set) == 1) {
				sum = sum + set;
			}
		}

		return sum;
	}
}
