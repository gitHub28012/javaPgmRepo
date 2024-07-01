package pattern;

public class FibonacciTrianglePattern {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;

		for (int i = 0; i < 4; i++) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			for(int j=0;j<=num1;j++)
			{
				System.out.print(num1+" ");
				
			}
		
			System.out.println();

		}

	}

}
