public class ForLoop
{
	
	public static void main (String[] args)
	{
		for(int i = 0; i < 20; i++) //repeats 20 times
		{
			IBIO.output("Hola");
		}
		
		int number = IBIO.inputInt("enter starting number ");
		for (int i = 0; i < 20; i++)
		{
			IBIO.output(number);
			number = number + 7;
		}
	}
}

