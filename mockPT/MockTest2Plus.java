public class MockTest2Plus
{
	public static int numDigits(int n)
	{
		int digits = 0;
		while(n > 0)
		{
			n = n / 10;
			digits = digits + 1;
		}
		return digits;
	}
	
	public static void main (String[] args)
	{
		int base,exponent;
		do
		{
			int exp = 0; 
			base = IBIO.inputInt("\nEnter base: ");
			if(base <= 0)
			{	IBIO.output("Base must be positive.");
				break;
			}
			exponent = IBIO.inputInt("Enter exponent: ");
			if(exponent < 0)
			{	exp = exponent * -1;
			} else {
				exp = exponent;
			}
			int power = 1;
			for(int i = 0; i < exp; i++)
			{	power = power * base;
			}
			IBIO.out(base + "^" + exponent + " = ");
			if(exponent >= 0)
			{	IBIO.output(power);
			} else {
				IBIO.output("\n");	
				int line = numDigits(base) + 1 + numDigits(exp);
				for(int i = 0; i < line/2; i++)
				{	IBIO.out(" ");
				}
				IBIO.output("1");
				for(int i = 0; i < line; i++)
				{	IBIO.out("-");
				}
				IBIO.output( " = " );
				IBIO.output(base + "^" + exp + "\n");
				line = numDigits(power);
				
				for(int i = 0; i < line/2; i++)
				{	IBIO.out(" ");
				}
				IBIO.output("1");
				for(int i = 0; i < line; i++)
				{	IBIO.out("-");
				}
				IBIO.output( " = " + (1.0/power) );
				IBIO.output( power );
			}	
		} while(base > 0);
	}
}
