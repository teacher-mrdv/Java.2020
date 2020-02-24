public class Test02
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int n;
		do
		{
			n = IBIO.inputInt("Enter a number (1-9): ");
			while(n < 0 || n >9)
			{
				n = IBIO.inputInt("Enter again - error (1-9): ");
			}
			if(n != 0)
			{
				for(int j = 1; j <= n; j++)
				{
					for(int i = 1; i <= 12; i++)
					{	IBIO.out(j + " x ");
						int p = j * i;
						if(i < 10)
						{	IBIO.out(" ");
						}
						IBIO.out(i + " = ");
						if(p < 10)
						{	IBIO.out(" ");
						}
						if(p < 100)
						{	IBIO.out(" ");
						}
						IBIO.output(p);
					} // end i
					IBIO.output("------------");
				} // end j
			}
		} while(n != 0);
	}
}

