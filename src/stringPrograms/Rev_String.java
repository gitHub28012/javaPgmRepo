package stringPrograms;

public class Rev_String {

	public static void main(String[] args) {
		String s1 = "My name is Tanmay";
		String output = "";
		String temp = "";
	
		// My name is Tanmay
		// Tanmayisnamemy
		// Tanmay is my name
		String[] arr = s1.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals("name")) {
				temp = arr[i];
			} else if (i == 0) {

				output = output + arr[i].toLowerCase()+" "+ temp ;
				
			} else if (arr[i] != temp) {
				output = output + arr[i]+" ";
			}

		}

		System.out.println(output);

	}
}
