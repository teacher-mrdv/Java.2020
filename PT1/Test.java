public class Test
{
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		int n = IBIO.inputInt("N (1~9) = ");
		while(n != 0)
		{
			while(n < 0 || n > 9)
			{	n = IBIO.inputInt("Error-enter N (1~9) = ");
			}
			for(int j = 1; j <= n; j++)
			{
				IBIO.output("------------");
				for(int i = 1; i <= 20; i++) // this is a nested loop
				{
					int product = j * i;
					IBIO.out(j + " x ");
					if(i < 10)
					{	IBIO.out(" ");
					}
					IBIO.out(i + " = ");
					if(product < 10)
					{	IBIO.out(" ");
					}
					if(product < 100)
					{	IBIO.out(" ");
					}
					IBIO.output(product);
				}
			}
			n = IBIO.inputInt("N (1~9) = ");
		}
/*		the code below is the same as for(int i = 1; i <= 20; i++)
		int i = 1;
		while(i <= 20)
		{
			//code
			i++;
		}
*/
	}
}

