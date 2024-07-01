package numbersProgram;

import java.util.Scanner;

public class LeapYear {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check it leap or not");
		int leapYearNo = sc.nextInt();
		
		if(leapYearNo%400==0 || leapYearNo%4==0)
			System.out.println(leapYearNo+" is a leap Year");
		else
			System.out.println(leapYearNo+" is not a leap year");
			
	}

}
