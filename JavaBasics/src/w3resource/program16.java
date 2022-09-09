package w3resource;

public class program16 {

	public static void main(String[] args) {
		/*16. Write a Java program to print a face.
			Expected Output			
			 +"""""+                                                 
			[| o o |]                                                
			 |  ^  |                                                 
			 | '-' |                                                 
			 +-----+
		 */
		
		// Solution 1 - Direct System.out.println
		
		System.out.println(" +\"\"\"\"\"+ ");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  | ");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+ ");
		
		// Solution 2 - Using arrays to store as String array
		
		String arr[] = new String[5];
		arr[0]= " +\"\"\"\"\"+";
		arr[1]= "[| o o |]";
		arr[2]= " |  ^  | ";
		arr[3]= " | '-' | ";
		arr[4]= " +-----+ ";
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
