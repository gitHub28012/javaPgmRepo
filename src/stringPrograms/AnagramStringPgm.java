package stringPrograms;

import java.util.Arrays;

public class AnagramStringPgm {
	
	public static void main(String[] args) {
		
		anagramString("silent","liste");
		
	}
	
	
	public static void anagramString(String input1,String input2)
	{
		
		if(input1.length()==input2.length())
		{
			
			char[] ana1 = input1.toLowerCase().toCharArray();
			char[] ana2 = input2.toLowerCase().toCharArray();
			
			Arrays.sort(ana1);
			Arrays.sort(ana2);
			
			if(Arrays.equals(ana1, ana2))
			{
				System.out.println(input1 +" "+input2);
				System.out.println("Are anagram Strings!!");
			}
			
		}
		
		else 
		{
			System.out.println("Are not an anagram Strings!!");
		}
		
		
	}

}
