/*
 * Class with examples to help you
 * solve problems from chapter 6
 * by teacher Marcos
 * Jan. 2020
 */
 
public class Chapter6
{
	public static String stars(int n)
	{
		String line = "";
		for(int i = 0; i < n; i++)
		{	line = line + "* ";
		}
		return line;
	}
	
	public static String spaces(int n)
	{
		String line = "";
		for(int i = 0; i < n; i++)
		{	line = line + " ";
		}
		return line;
	}
	
	public static void main (String[] args)
	{
		int size = IBIO.inputInt("Size = ");
		for(int i = 0; i < size; i++)
		{
		  IBIO.output( spaces(10) + stars(size) );
		}
		for(int i = 0; i < size; i++)
		{
		  IBIO.output( spaces(i) + stars( size ) );
		}
		
	}
}

