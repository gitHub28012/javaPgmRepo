package stringPrograms;

import java.util.LinkedList;

public class Lower_to_Upper_Case {
	
	
	
	public static void main(String[] args) {
		String input ="WhAT iS YouR nAme?";
		
		System.out.println("Given input string "+input);
		System.out.println(lowerToUpperCase(input));
		
	}

	public static String lowerToUpperCase(String input) {
		LinkedList<Character> list = new LinkedList<Character>();
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= 65 && ch <= 90)
				list.add((char) (ch + 32));
			else
				list.add((char) (ch - 32));
		}
		
		for(Character character:list)
		{
			output=output+character;
		}
		
		return output;

	}

}
