public class Starze
{
	public static void main(String[] args)
	{
		final int MAX_ROWS = 9, MAX_ROW = 6;
		int max_stars = 9, min_stars = 1, stars = 1, spaces = 5, spacez = 1;

		for (int row = 1; row <= MAX_ROWS; row++)
		{
			// Add spaces
			for (int space = spaces; space > 0; space--)
				System.out.print(" ");
			spaces--;

			// Add stars
			for (int star = 1; star <= row; star++)
				System.out.print("*");
			row++;
			System.out.println();
		}

		// Number of rows for the diamond
		for (int row = 1; row < MAX_ROW; row++)
		{
			// Add spaces
			for (int space = spacez; space <= row; space++)
				System.out.print(" ");
			// spacez++;

			// Add stars
			for (int start9 = max_stars; start9 >= 1; start9--)
				System.out.print("*");
			max_stars-=2;
			System.out.println();	
		}

	}
}
