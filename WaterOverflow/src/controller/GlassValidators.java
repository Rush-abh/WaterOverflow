package controller;

public class GlassValidators {

	// Column number cannot be more than row number as per problem
	public void validateColumnNumber(int r, int c) {
		if (c > r || c <= 0)
		{
			System.out.println("Incorrect Input. Please try again.");
			System.out.println("*** Number of glasses in a row cannot be more than row count ***");
			System.exit(0);
		}
		if (c < 0 || r < 0)
		{
			System.out.println("Please input positive integer");
			System.exit(0);
		}
		
	}
	
	// Water volume must be positive or 0
	public void validateWaterVolume(float wv) {
		if (wv < 0)
		{
			System.out.println("Incorrect Input. Please try again.");
			System.out.println("*** Water volume in litres cannot be negative. Use positive integer. ***");
			System.exit(0);
		}
		else if (wv > 10)
		{
			System.out.println("Too big for current case, input between 0-10");
			System.exit(0);
		}
	}
}
