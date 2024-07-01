package arrayPrograms;

public class CommanElementInArray {
	
	
	public static void main(String[] args) {
		
		int arr1 [] = {10,20,80,50,20};
		int arr2 [] = {15,63,80,26,50};
		
		comman_Element(arr1, arr2);
		
	}
	
	public static void comman_Element(int arr1[],int arr2[])
	{
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("comman element in array!! "+arr1[i]);
				}
				else 
				{
					continue;
				}
			}
		}
		
	}

}
