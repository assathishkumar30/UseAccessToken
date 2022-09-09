package w3resource;

public class program13 {

	public static void main(String[] args) {
		/*13. Write a Java program to print the area and perimeter of a rectangle.
			Test Data:
			Width = 5.6 Height = 8.5
			
			Expected Output
			Area is 5.6 * 8.5 = 47.60
			Perimeter is 2 * (5.6 + 8.5) = 28.20
		 */
		
		double height = 8.5;
		double width = 5.6;
		
		double area = height * width;
		double perimeter = 2 * (height + width);
		
		System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", height, width, area);
	}

}
