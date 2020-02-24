public class Whiles
{
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("Enter a number: ");
		while(x < 0)
		{
			x = IBIO.inputInt("ERROR-Enter a number: ");
		}
		
		
		do
		{
			x = IBIO.inputInt("Enter a number: ");
			if(x < 0) System.out.print("ERROR-");
		} while(x < 0);
		
	}
}

