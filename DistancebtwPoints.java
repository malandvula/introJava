import java.util.Scanner;

public class DistancebtwPoints{
	// calculat the distance between 2 points
	public static void main(String[] args){
		// primitive variables
		int x, y, x1, y1, distance;

		// object
		Scanner scan = new Scanner(System.in);

		// collect the points
		System.out.println("Enter the first x coord:");
		x = scan.nextInt();
		System.out.println("Enter the first y coord:");
		y = scan.nextInt();
		System.out.println("Enter the second x coord:");
		x1 = scan.nextInt();
		System.out.println("Enter the second y coord:");
		y1 = scan.nextInt();

		// calculate distance
		distance = (int) Math.sqrt(Math.pow((x1-x), 2) + Math.pow((y1-y), 2));

		// Print the result
		System.out.println(distance);
	}
}
