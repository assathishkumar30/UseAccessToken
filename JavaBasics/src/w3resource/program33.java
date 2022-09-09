package w3resource;

import java.util.Scanner;

public class program33 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*33. Write a Java program and compute the sum of the digits of an integer.
			Input Data:
			Input an integer: 25
			Expected Output
			
			The sum of the digits is: 7
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Input an Integer : ");
		int n = input.nextInt();
		System.out.println("The Sum of Digits is : "+sum(n));
		
	}
	
	public static int sum(long n)
	{
		int sum = 0;
		while(n!=0)
		{
			sum = (int) (sum + (n%10));
			n=n/10;			
		}
		return sum;		
	}

}
