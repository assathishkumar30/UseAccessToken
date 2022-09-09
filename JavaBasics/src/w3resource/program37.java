package w3resource;

import java.util.Scanner;

public class program37 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*37. Write a Java program to reverse a string. Go to the editor
			Input Data:
			Input a string: The quick brown fox
			Expected Output
			
			Reverse string: xof nworb kciuq ehT
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		char[] letters = input.nextLine().toCharArray();
		System.out.print("Reverse String : ");
		for(int i=letters.length-1;i>=0;i--)
			System.out.print(letters[i]);
		System.out.println();
	}

}
