package arrayPrograms;

public class SortOfAnArray {
	
	public static void main(String[] args) {
		
		int arr[]= {15,48,49,30,7,16};
		
		
		sortUsingBuubleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void sortUsingBuubleSort(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
	}

}
