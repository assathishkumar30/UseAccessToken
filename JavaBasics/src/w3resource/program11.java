package w3resource;

import java.util.Scanner;

public class program11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*11. Write a Java program to print the area and perimeter of a circle.
			Test Data:
			Radius = 7.5
			Expected Output
			Perimeter is = 47.12388980384689
			Area is = 176.71458676442586
		 */
		
		double radius = 7.5;
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter is = "+perimeter);
		System.out.println("Area is = "+area);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle : ");
		double rad = input.nextDouble();
		
		perimeter = 2 * Math.PI * rad;
		area = Math.PI * rad * rad;
		
		System.out.println("Perimeter is = "+perimeter);
		System.out.println("Area is = "+area);
		
	}

}
