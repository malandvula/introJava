import java.util.Scanner;
import java.text.DecimalFormat;

public class HeronTriangle{
	// Using Heron's formula calculate area to 3 decimals
	public static void main(String[] args){
	// initialize variables
	double s, a, b, c, area, value;

	// Scanner object
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first length for triangle");
	a = scan.nextDouble();
	System.out.println("Enter second length for triangle");
	b = scan.nextDouble();
	System.out.println("Enter third length for triangle");
	c = scan.nextDouble();

	// calculate the perimeter of triangle
	s = (a + b + c)/2.0;
	// calculate the area with Herons formula
	value = s*(s - a)*(s - b)*(s - c);
	area = Math.sqrt(value);

	// format object
	DecimalFormat fmt = new DecimalFormat("0.###");

	// print out the result
	System.out.println("The area for the triangle is " + fmt.format(area));
	}
}

