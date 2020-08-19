public class Primes
{	// (required) v-return type   vvvvv-argument(s,)
	public static boolean isPrime(int n) // method signature
	// .................. ^^^^^^^-method identifier/name
	{
		int i = 2;
		if(n == 1 || n == 0)
		{	return false;
		} else {
			do
			{	if(n % i == 0)
				{	break;
				}
				i++;
			} while(i < n);
		}
		return (n == i);
	}
	
		
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("Enter a number: ");
		if(isPrime(x))
		{	IBIO.output(x + " is a prime");
		} else {
			IBIO.output(x + " is not a prime");
		}
		//
		int counter = 0;
		IBIO.out("\nPrimes from 0 up to a 100: ");
		for(int n = 0; n <= 100; n++)
		{
			if(isPrime(n))
			{	IBIO.out(" " + n);
				counter++;
			}
		}
		IBIO.output("\n There are " + counter + " primes between 0 and 100.");
		counter = 0;
		int i = 0;
		IBIO.out("\n\nFirst 100 primes: ");
		do
		{
			if(isPrime(i))
			{	IBIO.out(" " + i);
				counter++;
			}
			i++;
		} while(counter < 100);
	}
}

