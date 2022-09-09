package w3resource;

import java.util.Scanner;

public class program6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
			Test Data:
			Input first number: 125
			Input second number: 24
			Expected Output :
			125 + 24 = 149
			125 - 24 = 101
			125 x 24 = 3000
			125 / 24 = 5
			125 mod 24 = 5 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1 = input.nextInt();
		System.out.println("Input second number: ");
		int num2 = input.nextInt();
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" x "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
		System.out.println(num1+" mod "+num2+" = "+(num1%num2));
		
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int multiply = num1 * num2;
		int subtract = num1 + num2;
		int divide = num1 / num2;
		int rnums = num1 % num2;
		System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
	}

}
