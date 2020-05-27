public class MultipleTwelve{
	// Table for the multiples of 12

	public static void main(String[] args){
		final int PER_LINE = 4;
		int value, row, col, mult, count = 0;

		System.out.println("The results of multiplying 1 through 12 by themselves");

		for (row = 0; row <= 12; row++)
		{
			for (col = 1; col <= 12; col++ )
			{
				row++;
				mult = row * col;
				System.out.print(mult + "\t");

				// print a specific number of values per line of output
				count++;
				if (count % PER_LINE == 0)
				{
					System.out.println();
				}
				mult++;
			}
		}
	}
}
