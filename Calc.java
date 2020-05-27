import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		float a, b, sum, prod, diff;

		// Input object
		Scanner scan = new Scanner(System.in);

		// Enter the values a and b, then calculate sum, differnce, and product
		System.out.println("Enter number in format 0.0 and press the return key.");
		a = scan.nextFloat();
		System.out.println("Enter number in format 0.0 and press the return key.");
		b = scan.nextFloat();

		sum = a + b;
		prod = a * b;
		diff = a- b;

		// print out the outputs
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + diff);
		System.out.println("The product is " + prod);
	}
}

