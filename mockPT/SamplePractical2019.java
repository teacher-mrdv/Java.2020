/*
 * Mock Test, ALL objectives done 10/10, teacher's version
 * 
 * c = counter
 * 
 * IBIO.out(data)		outputs data in the same line
 * IBIO.output(data)	outputs data, then goes down to the next line
 * 
 * mdv, Sep/2019
 */
 
 public class SamplePractical2019
{
	public static void main(String[] args)
	{
		IBIO.output("teacher Marcos");
		
		int number  = IBIO.inputInt("Enter a positive number < 10: ");
		while( number < 1 || number > 9)
		{
			number = IBIO.inputInt("Error: 0 < number < 10; re-enter: ");
		} // end while
		
		int power = 1; // because Java...
		for(int c = 1; c <= number; c++)
		{
			int square = c * c;
			power  = power * number;
			
			IBIO.out(c + " ");
			if(square < 10)
			{
				IBIO.out(" ");
			} // end if
			IBIO.out(square + " ");
			
			int digits = 0;
			int n = power;
			while(n > 1) // count the digits in the power
			{
				digits++;
				n = n / 10;
			} // end while
			
			for(int s = 0; s < 9-digits; s++) // align the power =>|
			{
				IBIO.out(" ");
			} // end for
			IBIO.output(power);
		} // end for
	} // end main

} // end class
