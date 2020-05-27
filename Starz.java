
public class Starz {

	public static void main(String[] args) {
		// Print the stars
		final int MAX_ROWS = 10;
		   
	      for(int row = MAX_ROWS; row >= 1; row--)
	      {
	    	  for(int star = 1; star <=row; star++)
	    		  System.out.print("*");
	    	  
	    	  System.out.println();
	      }
	}
}
