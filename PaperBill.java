import java.util.Scanner;

public class PaperBill{
	// how many dollar bills needed
	public static void main(String[] args){
		//  variables
		int  tenBill, fiveBill, oneBill, quarter, dimes, nickles, pennies;

		// read the value
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the dollar amount ($0.00)");
		double dollar = scan.nextDouble();

		// divide by the denomination of the bill and then subtract the bill denomination to represent the current value
		tenBill = (int) dollar / 10;
		dollar -= tenBill * 10;
		fiveBill = (int) dollar / 5;
		dollar -= fiveBill * 5;
		oneBill = (int) dollar / 1;
		dollar -= oneBill * 1;
		quarter = (int)(dollar / .25)/1;
		dollar -= quarter * .25;
		dimes = (int)(dollar / .1)/1;
		dollar -= dimes * .1;
		nickles = (int)(dollar / .05)/1;
		dollar -= nickles * .05;
		pennies = (int) (dollar / .01)/1;

		// print the paper bill value
		System.out.println("You have: \n"
					+ tenBill + " ten dollar bills \n"
					+ fiveBill + " five dollar bills \n"
					+ oneBill + " one dollar bills \n"
					+ quarter + " quarters \n"
					+ dimes + " dimes \n"
					+ nickles + " nickles \n"
					+ pennies + " pennies.");

	}
}
