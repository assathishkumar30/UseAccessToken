package w3resource;

public class program4 {

	public static void main(String[] args) {
		/*4. Write a Java program to print the result of the following operations. 
			Test Data:
			a. -5 + 8 * 6
			b. (55+9) % 9
			c. 20 + -3*5 / 8
			d. 5 + 15 / 3 * 2 - 8 % 3
			Expected Output :
			43
			1
			19
			13
		*/
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		int a= -5 + 8 * 6;
		int b= (55+9) % 9;
		int c= 20 + -3*5 / 8;
		int d= 5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}

}
