// --------------------------------------------
// Mqondisi Malandvula 			Kennel.java
//
// Main program showing dependancy and aggregation of progam
// --------------------------------------------
import java.util.Scanner;

public class Kennel{
	public static void main(String[] args){
		String name;
		int age; 

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter dog's name:");
		name = scan.nextLine();
		System.out.println("Enter dog's age:");
		age = scan.nextInt();
		Dog dog = new Dog(name, age); 

		System.out.println("Enter dog's name:");
		scan.nextLine();
		name = scan.nextLine();
		System.out.println("Enter dog's age:");
		age = scan.nextInt();
		Dog dog1 = new Dog(name, age); 

		System.out.println("Enter dog's name:");
		scan.nextLine();
		name = scan.nextLine();
		System.out.println("Enter dog's age:");
		age = scan.nextInt();
		Dog dog2 = new Dog(name, age); 

		String message = "\n" + dog;
		System.out.println(message);
		
		String message1 = "\n" + dog1;
		System.out.println(message1);
		
		String message2 = "\n" + dog2;
		System.out.println(message2);
	}
}