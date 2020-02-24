public class Commas
{
	// HL recursive version
	public static void commas(int n)
	{	// next line is for tracing purposes only //
		System.out.println( "<" + n + ">    " + (n%1000) );
		
		if(n < 1000)// base case; print the hundreds
		{	System.out.print(n);
			return; // exit the method/stop the recursion
		} else {
			commas(n/1000);
			System.out.print( "," + (n % 1000) );
		}
	}
			
	public static void main (String[] args)
	{	// SL Iterative version
		int n = IBIO.inputInt("Enter a large number: ");
		String withCommas = "";
		int digits = 0;
		int x = n;
		while(x > 0)
		{	// X%10 = last digit of the number
			withCommas = (x % 10) +withCommas;
			digits++;
			if(digits % 3 == 0 && x > 10)
			{	withCommas = "," + withCommas;
			}
			x = x / 10; // get rid of last digit to go to next one
			System.out.println(x + " " + digits + " " + withCommas + " ");
		}

		IBIO.output(withCommas);
		//IBIO.output("\nRecursive:");
		//commas(n);
		
	}
}

