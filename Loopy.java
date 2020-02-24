public class Loopy
{
	
	public static void main (String[] args)
	{
		for(int i = 1; i < 11; i++)
		{	IBIO.output(i);
		}
		for(int i = 1; i < 11; i++)
		{	IBIO.output(i);
		}
		IBIO.output("----------------------");
		for(int i = 1; i < 11; i++)
		{	for(int j = 1; j < 11; j++)
			IBIO.output(i + " " + j);
		}
	}
}

