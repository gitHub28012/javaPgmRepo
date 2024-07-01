package stringPrograms;

public class Next_to_LastWord_of_Sentence {
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(nextToLastWord("How you do in"));
	}
	
	
	
	public static String nextToLastWord(String input)
	{
		
		   String[] arr = input.split(" ");
		   
		   return arr[arr.length-2];
		
	}

}
