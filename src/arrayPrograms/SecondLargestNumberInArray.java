package arrayPrograms;

public class SecondLargestNumberInArray { 
	
	public static void main(String[] args) {
		int arr []= {8,8,7,4,12,3,7};
		int firstLargestNum=arr[0];
	    int secondLargestNum=arr[0];	
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(firstLargestNum<arr[i])
	    	{
	    		secondLargestNum=firstLargestNum;
	    		firstLargestNum=arr[i];
	    	}
	    	else if(secondLargestNum<arr[i])
	    	{
	    		secondLargestNum=arr[i];
	    	}
	    }
		System.out.println(secondLargestNum);
	}

}
