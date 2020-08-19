public class Algorithms
{
	
	public static void main (String[] args)
	{
		// finds the largest number out of 3 inputs A,B,C
		int a, b, c, max;
		a = IBIO.inputInt("Enter A = ");
		b = IBIO.inputInt("Enter B = ");
		c = IBIO.inputInt("Enter C = ");
		max = a;
		if(b > max)
		{	max = b;
		}
		if(c > max)
		{	max = c;
		}
		IBIO.output(max);
		
		// finds the largest number out of any amount of numbers
		// zero exits but is not counted
		int n = IBIO.inputInt("Enter a number: ");
		int largest = n;
		while(n >= 0)
		{
			n = IBIO.inputInt("Enter another number: ");
			if( n != 0)
			{
				if( n > largest )
				{
					largest = n;
				}
			}
		}
		IBIO.output("Largest = " + largest);
		
		// calculate the frequency of N in a data set
		int counter = 0;
		char more;
		int number = IBIO.inputInt("Enter a number: ");
		do
		{	int x = IBIO.inputInt("Enter another number: ");
			if(x == number)
			{	counter++;
			}
			more = IBIO.inputChar("Enter another number (y/n)? ");
			more = Character.toLowerCase(more);
		} while(more != 'n');
		IBIO.output(counter);

	}
}

