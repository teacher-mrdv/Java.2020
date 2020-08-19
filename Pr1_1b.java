/* Problem 1.1 - while loop version
 *
 * Change the program so that you enter in a number and then
 * the program will print your name down the screen
 * that number of times.
 *
 * Author: Marcos Drien
 */
 
public class Pr1_1b
{
	
	public static void main (String[] args)
	{
		int times = IBIO.inputInt("How many times? ");
		int i = 0;
		while(i < times)
		{
			IBIO.output("Adam");
			i = i + 1;
		}
	}
}

/*
How many times? 5
Adam
Adam
Adam
Adam
Adam
*/

