package stringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class CountFrequencyOfCharacter {
	
	public static void main(String[] args) {
		
		String inputString="abaacadpabcka";
		countFrequencyUsingHashmap(inputString);
		
		
	}

	
	
	public static void countFrequencyUsingHashmap(String input)
	{
		  char[] ch = input.toLowerCase().toCharArray();
		  
		  int count=1;
		  
		  TreeMap<Character, Integer> map = new TreeMap<Character,Integer>();
		  
		  for(int i=0;i<ch.length;i++)
		  {
			  
			  if(!map.containsKey(ch[i]))
			  {
				  map.put(ch[i],count);
			  }
			  else 
			  {
				  map.put(ch[i],map.get(ch[i])+1);
			  }
		  }
		   
		  System.out.println(map);	
	}
	
	
}
