/*
 * Mock Test, ALL objectives done 10/10
 * 
 * IBIO.out(data)		outputs data in the same line
 * IBIO.output(data)	outputs data, then goes down to the next line
 * 
 * Notes: for comparisons: || is OR; && =is AND; == is equal;
 * != is different from
 * 
 * mdv, 30/Sep/2019
 */
public class MockTest // class = program
{
	// main method: this is what Java looks for inside each class.
	// If it's found, it's executed (Java runs it)
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien"); // #1
		int number = IBIO.inputInt("Enter a number: ");
		while(number < 1 || number > 9) // #10 +#6 & #7 all in one
		{
			number = IBIO.inputInt("Error number has to be >0 and < 10: ");
		} // end while
		int counter = 1; // #3, 4, 5 & 8 start here
		int power = 1;
		int square;
		while( counter <= number )
		{
			square = counter * counter; //calculate square of counter
			power = number * power;	// calculate number^counter
			IBIO.out(counter + " "); // #3
			if(square < 10)		// #8 align squares
			{
				IBIO.out(" ");
			} // end if
			IBIO.out(square + " "); // #4
			
			int digits = 0;	// #9
			int n = power;
			while(n > 1)	// count how many digits the power has
			{	digits = digits + 1;
				n = n / 10;
			} // end while
			// how many spaces to put in front of the power
			// the largest power (9^9) is 9 digits long
			int s = 0;
			while(s < 9-digits)
			{	IBIO.out(" ");
				s = s + 1;
			} // end if
			IBIO.output(power); // #5
			counter = counter + 1; // do next number
		} // end while
		
	} // end main method (this is what Java (JRE) executes)
	
} // end class (whole program's end)

