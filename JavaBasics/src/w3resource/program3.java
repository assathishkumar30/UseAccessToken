package w3resource;

import java.util.Scanner;

public class program3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*3. Write a Java program to divide two numbers and print on the screen.
			Test Data :
			50/3
			Expected Output :
			16
		*/
		
		System.out.println(50/3);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int num1 = input.nextInt();
		System.out.print("Enter the Second Number :");
		int num2 = input.nextInt();
		int reminder = num1/num2;
		System.out.println("Division of "+num1+" by "+num2+" is : "+reminder);
		
	}

}
