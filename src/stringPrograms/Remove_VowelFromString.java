package stringPrograms;

public class Remove_VowelFromString {

	public static void main(String[] args) {

		String input="What is your name?";
		System.out.println("removing vowels from given String :"+input);
		System.out.println(removeVowel(input));
	}

	public static String removeVowel(String input) {

		// convert the given string into lowercase and into the char array
		char[] arr = input.toLowerCase().toCharArray();
		String output = "";

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
				continue;
			else
				output = output + arr[i];
		}
		return output;
	}

}
