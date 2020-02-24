public class MT
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int number = IBIO.inputInt("Enter a number: ");
		while(number < 1 || number > 9)
		{
			IBIO.output("Error-number out of range");
			number = IBIO.inputInt("Enter a number: ");
		}
		
		int i = 1;
		int power = 1;
		while(i <= number)
		{
			int square = i * i;
			power = power * number;
			IBIO.out(i + " ");
			if(square < 10)
			{
				IBIO.out(" ");
			}
			IBIO.out(square + " ");
			
			int digits = 0;
			int n = power;
			while(n > 1)
			{
				n = n / 10;
				digits++;
			}
			for(int s = 0; s < 9-digits; s++)
			{
				IBIO.out(" ");
			}
			IBIO.output(power);
			i = i + 1;
		}

		
	}
}

