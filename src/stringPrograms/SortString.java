package stringPrograms;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {

		String input = "DBacCAbd";
		String output = "";
		char[] str = input.toCharArray();
		Arrays.sort(str);

		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str.length; j++) {

				if (str[i] - str[j] == 32) {
					output = output + (char) str[i] + (char) str[j];
				}
			}

		}

		System.out.println(output);

	}

}
