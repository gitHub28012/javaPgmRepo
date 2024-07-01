package arrayPrograms;

import java.util.HashMap;

public class UniqueElementsFromArray {
	
	public static void main(String[] args) {
		
		
		int arr [] = {1,1,2,2,3,4,5,5,6,6};
		findUniqueElementFromArray(arr);
		
	}
	
	public static void findUniqueElementFromArray(int arr[])
	{
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int count=1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i],count);
			}
			else 
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		
		for(Integer intSet:map.keySet())
		{
			if(map.get(intSet)==1)
			{
				System.out.println("Unique elements from an array :"+intSet);
			}
		}
	}

}
