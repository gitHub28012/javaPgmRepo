package stringPrograms;

public class BiggestWordInString {

	public static void main(String[] args) {

		String input = "i am working in testyantra";

		String[] arr = input.split(" ");
		String biggest_Word = " ";
		for (String word:arr) {
             if(word.length()>arr.length)
            	 biggest_Word=word;
		}
		System.out.println(biggest_Word);

	}

}
