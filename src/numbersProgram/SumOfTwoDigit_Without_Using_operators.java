package numbersProgram;

import java.util.Scanner;

public class SumOfTwoDigit_Without_Using_operators {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st int num");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd int num");
		int b = sc.nextInt();
		
		System.out.println("sum of two number without using operator "+add(a, b));
		
		
		
	}
	
   /**
    * SumOfTwoDigit_Without_Using_operators 
    * @param a
    * @param b
    * @return
    */
	
	public static int add(int a,int b)
	{
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		return a;
	}

}
