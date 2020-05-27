//********************************************************************
//  Stars.java
//
//  Demonstrates the use of nested for loops.
//********************************************************************

public class Starzc
{
   //-----------------------------------------------------------------
   //  Prints a triangle shape using asterisk (star) characters.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      final int MAX_ROWS = 10;
	int space = 9, i;

       for(int row = 1; row <= MAX_ROWS; row++)
      {
      	for (i=space; i>0; i--)
      	{
      		System.out.print(" ");
      	}
      	space--;

      	for(int star = 1; star <=row; star++)
      		System.out.print("*");

          	  System.out.println();
      }
   }
}
