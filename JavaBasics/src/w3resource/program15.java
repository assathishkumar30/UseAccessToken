package w3resource;

public class program15 {

	public static void main(String[] args) {
		/*15. Write a Java program to swap two variables.
		 */
		
		// Solution 1 - using another variable
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before swapping values of a & b : "+a+", "+b);
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swapping values of a & b : "+a+", "+b);
		
		// Solution 2 - Without using another variable
		int x = 25;
		int y = 55;
		
		System.out.println("Before swapping values of x & y : "+x+", "+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping values of x & y : "+x+", "+y);
		
	}

}
