package stringPrograms;

public class Frequency_of_Character {
	
	
	public static void main(String[] args) {
		System.out.println(frequencyOfCharcaterInString("a2b1c5a3"));
	}
	
	
	
	public static String frequencyOfCharcaterInString(String input)
	{
	    String output="";
		for(int i=0;i<input.length();i=i+2)
		{
			char charcater = input.charAt(i);
			int noc = (int)(input.charAt(i+1))-48;
			
			for(int j=1;j<=noc;j++)
			{
				output=output+charcater;
			}
			
		}
		return output;
	}

}
