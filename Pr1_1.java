/* Problem 1.1
 *
 * Change the program so that you enter in a number and then
 * the program will print your name down the screen
 * that number of times.
 *
 * Author: Marcos Drien
 */
 
public class Pr1_1
{
	
	public static void main (String[] args)
	{
		int times = IBIO.inputInt("How many times? ");
		for(int i = 0; i < times; i++)
		{
			IBIO.output("Neo");
		}
	}
}

/*
How many times? 3
Neo
Neo
Neo
*/

