package w3resource;

import java.util.Scanner;

public class program12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number :");
		int num1 = input.nextInt();
		System.out.print("Enter the second number :");
		int num2 = input.nextInt();
		System.out.print("Enter the third number :");
		int num3 = input.nextInt();
		
		double average = (num1+num2+num3)/3;
		
		System.out.println("Average of "+num1+", "+num2+" & "+num3+" is : "+average);
		
		System.out.println("How many number you need to calculate Average :");
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{			
			System.out.println("Enter the "+i+" number :");
			int num = input.nextInt();
			sum = sum + num;
		}
		
		average = sum/n;
		
		System.out.println("Average of "+n+" numbers is :"+average);
	}

}
