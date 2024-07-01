package arrayPrograms;

public class Find_Highest_Lowest_Sum_InArray {

	public static void main(String[] args) {
		
		int arr [] = {15,45,89,30,65};
		int largest_Sum=Integer.MIN_VALUE;
		int smallest_Sum= Integer.MAX_VALUE;
		


		for(int i=0;i<arr.length;i++)
		{
		
			 for(int j=0;j<arr.length;j++)
			 {
				if(i==j)
				{
					continue;
				}
				else if(arr[i]+arr[j]>largest_Sum)
				{   
//					smallest_Sum=largest_Sum;
					largest_Sum=arr[i]+arr[j];
				}
				
				else if(arr[i]+arr[j]<smallest_Sum)
				{
					smallest_Sum=arr[i]+arr[j];
				}
				
			 }
		}

		System.out.println(largest_Sum);
		System.out.println(smallest_Sum);
		
	}

}
