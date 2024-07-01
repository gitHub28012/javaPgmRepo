package stringPrograms;

import java.util.HashMap;

public class Numbers_of_WordsInGivenString {
	
	public static void main(String[] args) {
		
		String input="Alice is girl and Bob is boy";
		
		int count=1;
		
		String[] arry = input.toLowerCase().split(" ");
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<arry.length;i++)
		{
			if(!map.containsKey(arry[i]))
			{
			map.put(arry[i],count);
			}
			else 
			{
				map.put(arry[i],map.get(arry[i])+1);
			}
		}
		
		for(String set:map.keySet())
		{
			
			System.out.println("Count : "+set+" : "+map.get(set));
		}
		
	
		
	}

}
