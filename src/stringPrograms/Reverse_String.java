package stringPrograms;

public class Reverse_String {
	
	
	public static void main(String[] args) {
		
		
		String s1="My name is Tanmay";
		String[] arr = s1.split(" ");
		String output="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			output=output+arr[i]+" ";
		}
		
		System.out.println(output);
		
	}

}
