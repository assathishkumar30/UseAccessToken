package w3resource;

import java.util.Scanner;

public class program32 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*32. Write a Java program to compare two numbers.
			Input Data:
			Input first integer: 25
			Input second integer: 39
			Expected Output
			
			25 != 39                                                                          
			25 < 39                                                                           
			25 <= 39
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int num1 = input.nextInt();
		System.out.println("Input second integer: ");
		int num2 = input.nextInt();
		
		// < > <= >= == !=
		
		if(num1<num2)
			System.out.println(num1+" < "+num2);
		if(num1>num2)
			System.out.println(num1+" > "+num2);
		if(num1<=num2)
			System.out.println(num1+" <= "+num2);
		if(num1>=num2)
			System.out.println(num1+" >= "+num2);
		if(num1==num2)
			System.out.println(num1+" == "+num2);
		if(num1!=num2)
			System.out.println(num1+" != "+num2);
	}

}