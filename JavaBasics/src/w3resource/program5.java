package w3resource;

import java.util.Scanner;

public class program5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
			Test Data:
			Input first number: 25
			Input second number: 5
			Expected Output :
			25 x 5 = 125
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1 = input.nextInt();
		System.out.println("Input second number: ");
		int num2 = input.nextInt();
		int mul = num1*num2;
		System.out.println(num1+" x "+num2+" = "+mul);	

	}

}
