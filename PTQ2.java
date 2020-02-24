public class PTQ2
{
	public static boolean isPrime(int num)
	{
		if(num == 0 || num == 1 || num == 2)
		{	return false;
		}
		for(int i = 2; i < num; i++)
		{	if( num % i == 0)
			{	return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args)
	{
		IBIO.output("My Name");
/*		int n = IBIO.inputInt("How many numbers to process: ");
		while(n < 5)
		{	IBIO.output("Error-number out of range.");
			n = IBIO.inputInt("How many numbers to process: ");
		}  */
		int x = IBIO.inputInt("Enter a number: ");
		int min = x;
		int max = x;
		double sum = x;
		int freq = 0;
		int counter = 1;
		while(x >= 0)
		{	x = IBIO.inputInt("Enter a number: ");
			if(x < 0)
			{	break;
			}
			counter++;
			sum = sum + x;
			if(x < min)
			{	min = x;
			}
			if(x > max)
			{	max = x;
			}
			if(isPrime(x))
			{	freq++;
			}
		}
		double average = sum / counter;
		int range = max - min;
		IBIO.output("Min: " + min);
		IBIO.output("Max: " + max);
		IBIO.output("RANGE: " + range);
		IBIO.output("Average: " + average);
		IBIO.output("Prime freq.: " + freq);
		
			
	}
}

