import java.util.Scanner;

public class PalindromeTesterUpdate {

	// Test Strings to se if they are palindromes
	public static void main(String[] args) {
		String str, another = "y", mutation;
		int left, right;
		
		Scanner scan = new Scanner(System.in);
		
		while (another.equalsIgnoreCase("y")) { // allows y or Y 
			System.out.println("Enter a potential palindrome: ");
			str = scan.nextLine();
			
			// Remove punctuation, change to lower case
			mutation = str.toLowerCase();
			mutation = mutation.replace(" ", "");
			mutation = mutation.replace(",", "");
			mutation = mutation.replace(".", "");
			str = mutation;
			
			left = 0;
			right = str.length() - 1;
			
			while (str.charAt(left) == (str.charAt(right)) && left < right) {
				left++;
				right--;
			}
			
			System.out.println();
			if (left < right) {
				System.out.println("That string is NOT a palindrome.");
			}else {
				System.out.println("That string IS a palindrome.");
			}
			
			System.out.println();
			System.out.println("Test another palindrome (y/n)? ");
			another = scan.nextLine();			
		}
	}
}
