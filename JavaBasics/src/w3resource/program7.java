package w3resource;

import java.util.Scanner;

public class program7 {

	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
			Test Data:
			Input a number: 8
			Expected Output :
			8 x 1 = 8
			8 x 2 = 16
			8 x 3 = 24
			...
			8 x 10 = 80
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number :");
		int num = input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+(i*num));
		}

	}

}
