public class DigitCount
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter a number: ");
		int number = n;
		int digits = 0;
		while(n > 0)
		{
			n = n / 10;
			digits = digits + 1;
		}
		IBIO.output("\n" + number + " has " + digits + " digits" + "\n");
		for(int i = 0; i < digits/2; i++)
		{	IBIO.out(" ");
		}
		IBIO.output("1");
		for(int i = 0; i < digits; i++)
		{	IBIO.out("-");
		}
		IBIO.output( " = " + (1.0/number) );
		IBIO.output(number);
	}
}

