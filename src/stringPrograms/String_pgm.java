package stringPrograms;

public class String_pgm {
	
  
	public static void main(String[] args) {
		 
		System.out.println(reverseString("Hello Welcome to Banglore"));
		System.out.println(reverseStringAsItIs("Hello Welcome to Banglore"));
	}
	
	
	
	
	public static String reverseString(String input)
	{
		     String output="";
		     StringBuffer sbf = new StringBuffer(input);
		     StringBuffer reverseOpString = sbf.reverse();
		     
		     String str = new String(reverseOpString);
		     
		      String[] op = str.split(" ");
		      
		      for(int i=op.length-1;i>=0;i--)
		      {
		    	 output=output+op[i]+" ";
		      }
		      return output;	     
	}
	
	
	public static String reverseStringAsItIs(String input)
	{
		String output="";
		String[] arr = input.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			output=output+arr[i]+" ";
		}
		return output;
		
	}

}
