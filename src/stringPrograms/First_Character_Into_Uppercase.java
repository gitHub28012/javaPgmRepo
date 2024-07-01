package stringPrograms;

public class First_Character_Into_Uppercase {
	
	public static void main(String[] args) {
		
	     String input="he is not here since monday";
	     System.out.println(firstCharInUpperCase(input));
	     System.out.println(getUpperCaseWord(input));
		
	}
	
	
	public static String firstCharInUpperCase(String input)
	{
		String[] arr = input.split(" ");
		String output="";
		for(String str:arr)
		{
			char[] arr1 = str.toCharArray();
			char ch = arr1[0];
			if(ch>=97&&ch<=122)
			{
				
				output=output+str.replace(ch, (char)(ch-32))+" ";
			}
		}
		
		return output;
	}
	
	public static String getUpperCaseWord(String input)
	{
		String result="";
		
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if((i==0 &&ch!=' ' ||input.charAt(i-1)==' ' &&ch!=' ')&& ch>=97 && ch<=122)
			{
				result=result+(char)(ch-32);
			}
			else 
			{
				result=result+ch;
			}
		}
		return result;
 	}

}
