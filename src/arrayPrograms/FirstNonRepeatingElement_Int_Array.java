package arrayPrograms;

public class FirstNonRepeatingElement_Int_Array {

	public static void main(String[] args) {
		int[] a = { 12, 15, 8, 17, 15, 10, 12, 17, 18 };
		System.out.println(nonRepetaedElement(a));

	}

	public static String nonRepetaedElement(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					break;
				}
			}
			if (j == a.length)
				return a[i] + " is 1st non-repeating element at indext " + i;
		}
		return "There is no non-repeating element available";
	}
}
