/* Triangular sequence 1.4
 */

public class Problem14
{
	
	public static int triangular(int n) // HL-recursive
	{
		if(n == 1)
		{	return 1;
		} else {
			return n + triangular(n-1);
		}
		
	}
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("How many terms of the triangular sequence? ");
		int result = 0;
		for(int i = 1; i <= x; i++)
		{
			result = result + i;
			IBIO.out(result + " ");
		}
		IBIO.output("\n\n"); //System.out.println();
		for(int i = 1; i <= x; i++)
		{
			IBIO.output( "\nResult: " + triangular(i) );
		}
	}
}

/*
How many terms of the triangular sequence? 5
1 3 6 10 15 


15
*/
