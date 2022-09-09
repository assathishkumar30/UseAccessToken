package w3resource;

import java.util.Scanner;

public class program2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*2. Write a Java program to print the sum of two numbers.
			Test Data:
			74 + 36
			Expected Output :
			110
		*/
		
		System.out.println(74+36);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int num1 = input.nextInt();
		System.out.print("Enter the Second Number :");
		int num2 = input.nextInt();
		int sum = num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is : "+sum);
	}

}
