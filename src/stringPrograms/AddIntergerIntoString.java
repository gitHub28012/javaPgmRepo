package stringPrograms;

import java.util.Scanner;
 
public class AddIntergerIntoString {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to add");
		int valueToAdd = sc.nextInt();
		System.out.println(addIntegerInString("I have 1000 rupess","1000", valueToAdd));
		
	}
	
	public static String addIntegerInString(String input,String valueNeedToadd,int valueToAdd)
	{
	
		//i have 1000 reupees.
		   String[] str = input.split(" ");
		   String output="";
		   
		   for(String s:str)
		   {
			   if(s.equals(valueNeedToadd))
			   {
				   int v = Integer.parseInt(s);
				   int finalValue = v+valueToAdd;
				   output=output+finalValue+" ";
			   }
			   else 
			   {
				   output=output+s+" ";
			   }
		   }
		return output;
	}
}
