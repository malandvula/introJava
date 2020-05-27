public class Starzd
{
	public static void main(String[] args)
	{
		final int MAX_ROW = 10;
		int max_stars = MAX_ROW, space = 1;

		for (int row = 1; row <= MAX_ROW; row++)
		{
			if (row == 1)
				for (int star = MAX_ROW; star >= 0; star--)
				{
					System.out.print("*");
				}
			else
				{
					for(int i = space; i <= row-1; i++)
						System.out.print(" ");
						//space++;
					for(int star = max_stars; star >= 1; star--)
						System.out.print("*");
						max_stars--;
				}


		System.out.println();
		}
	}
}
