import java.util.Scanner;

public class Cubes{
	// take in 2 integers and return the of the cubes
	public static void main(String[] args){
		// primitive data types - variables
		int a, b;
		double c, d;

		// object input
		Scanner scan = new Scanner(System.in);

		// Get the values
		System.out.println("Enter value a:");
		a = scan.nextInt();
		System.out.println("Enter value b:");
		b = scan.nextInt();

		// calculation
		c = Math.pow(a,3) + Math.pow(b,3);

		// print results
		System.out.println(c);

	}
}
