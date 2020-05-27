//*****************************
// Mqondis Malandvula
// Array.java
//*****************************

import java.util.Scanner;

public class Array{
	//Print a list an array of names provided by user
	public static void main(String[] args){
		int numofNames, i = 0;

		// What is the size of the list?
		Scanner scan = new Scanner(System.in);
		System.out.println("How many names do you want to enter? ");
		numofNames = scan.nextInt();
		System.out.println();

		// Create an array
		String[] names = new String[numofNames];

		// Get the name from user
		do{
			System.out.print("Enter name:  ");
			names[i] = scan.next();
			System.out.println();
			i++;
		}while (i < names.length);

		// Print the names in the array
		for (String name: names){
			System.out.println(name.toUpperCase());
		}
	}
}
