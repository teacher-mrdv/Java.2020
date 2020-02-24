/* problem 4.3
 * Write a program that allows the user to enter a number less than 1000. The program will search for two numbers that when squared and added together make the number that was input. The program has two loops. One loop going from 1 to num and the second loop also goes from 1 to num also. In the loop the program will square the numbers and then add them together to see if they are the same as the input number. If they are then use the break statement to break out of both loops. Your output will be the numbers or state that it is impossible.
 * mdv
 */
 
public class Problem4_3
{
	
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("Enter a number < 1000: ");
		while(num < 0 || num >= 1000)
		{
			num = IBIO.inputInt("ERROR-Enter a number < 1000: ");
		}
		int outside = 1;
		int inside	= 1;
		exitbothloops:
		for(outside = 0; outside <= num; outside++)
		{	for(inside = 0; inside <= num; inside++)
			{	if(outside*outside + inside*inside == num)
				{	System.out.println(outside + " " + inside);
					break exitbothloops;
				}
			}
		}
		if(outside*outside + inside*inside != num)
		{	
			System.out.println("Impossible");
		}
	}
}

/* OUTPUT *

Enter a number < 1000: 1000
ERROR-Enter a number < 1000: 9999
ERROR-Enter a number < 1000: 100
6 8
Enter a number < 1000: 4
Impossible
*/
