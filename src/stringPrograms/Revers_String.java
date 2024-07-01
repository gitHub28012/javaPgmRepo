package stringPrograms;

public class Revers_String {
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("What is your name?"));
		
		System.out.println(reverseStringAsItIs("What is your name?"));
		
		System.out.println(reverseStringOneWord("I am from punjab","from"));
	}
	
	
	
	public static String reverseString(String input)
	{
		char[] chArr = input.toLowerCase().toCharArray();
		String output="";
		
		for(int i=0;i<chArr.length;i++)
		{
			output=chArr[i]+output;
		}
		return output;
	}
	
	public static String reverseStringAsItIs(String input)
	{
		String[] arr = input.split(" ");
		String output="";
		
		for (int i = arr.length-1;i>=0;i--) {
			
			output=output+arr[i]+" ";
		}
		return output;
	}
	
	public static String reverseStringOneWord(String input,String reverseWord)
	{
		String output="";
		String[] arr = input.split(" ");
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(reverseWord))
			{
				StringBuffer sb = new StringBuffer(reverseWord);
				output=output+sb.reverse()+" ";
			}
			else 
			{
				output=output+arr[i]+" ";
			}
			
		}
		return output;
	}

}
