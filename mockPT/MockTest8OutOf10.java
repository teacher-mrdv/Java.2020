/*
 * Mock Test, first 8 objectives done (the straightforward ones)
 * 
 * IBIO.out(data)		outputs data in the same line
 * IBIO.output(data)	outputs data, then goes down to the next line
 * 
 * Notes: for comparisons: || is OR; && =is AND; == is equal;
 * != is different from
 * 
 * mdv, 30/Sep/2019
 */
public class MockTest8OutOf10 // class = program
{
	// main method: this is what Java looks for inside each class.
	// If it's found, it's executed (Java runs it)
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");	// #1
		int number = IBIO.inputInt("Enter a number between 1 and 9: ");
		if(number < 1 || number > 9) // #6 & #7
		{	
			IBIO.output("Error. Number must be > 0 and < 10.");
			System.exit(1); // exit/stop program. no need to know this for our practical test, just used to make this example easier to understand
		} // end if
		int counter= 1; // beginning of #3, 4, 5 & 8
		int power  = 1; // power = number to the power of counter
		int square = 0;
		while( counter <= number )
		{
			square = counter * counter;	// #4 (calculate)
			power  = power   * number;	// #5 (calculate)
			IBIO.out(counter + " ");	// #3 (display)
			if(square < 10)				// #8 align squares to right
			{
				IBIO.out(" ");
			} // end if
			IBIO.out(square + " ");		// #4 (display)
			IBIO.output(power);			// #5 (display)
			counter = counter + 1;
		} // end while
	}
}

