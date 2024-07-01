package stringPrograms;

public class InterchangeTheLastPositiontoFirstInString {

	public static void main(String[] args) {

		System.out.println(interchangeThePosition("My name is bharath"));

	}

	public static String interchangeThePosition(String input) {

		String[] str = input.split(" ");
		String output = " ";
		String temp = " ";
		for (int i = 0; i < str.length; i++) {

			if (i == 0) {
				temp = str[i];
				str[i] = str[str.length - 1];
				output = str[i] + " ";
			}

			else if (i == str.length - 1) {
				str[i] = temp;
				output = output + str[i];
			} else {
				output = output + str[i] + " ";
			}
		}
		return output;
	}

}
