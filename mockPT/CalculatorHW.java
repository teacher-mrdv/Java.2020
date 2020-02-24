public class CalculatorHW
{
	public static int add(int x, int y)
	{	// your code here
	}
	
	public static int sub(int x, int y)
	{	// your code here
	}
	
	public static int mult(int x, int y)
	{	// your code here
	}
	
	public static double div(int x, int y) // example
	{	return (double)x / y;
	}
	
	public static int mod(int x, int y)
	{	// your code here
	}
	
	// (required) v-return type   vvvvv-argument(s,)
	public static boolean isPrime(int x) // method signature
	// .................. ^^^^^^^-method identifier/name
	{
		x = Math.abs(x); // make sure it's not negative
		// your code here
	}
	
	public static boolean isDivisor(int x, int y)
	{	// your code here
	}
	
	public static double power(int base, int exp)
	{	// your code here
	}
	
	public static double log(int base, int x)
	{	// your code here
	}	
	
	public static void main(String[] args)
	{
		int a = IBIO.inputInt("Enter A = ");
		int b = IBIO.inputInt("Enter B = ");
		IBIO.output( a + " + " + b + " = " + add(a,b) );
		IBIO.output( a + " - " + b + " = " + sub(a,b) );
		IBIO.output( a + " * " + b + " = " + mult(a,b) );
		IBIO.output( a + " / " + b + " = " + div(a,b) );
		IBIO.output( a + " modulo " + b + " = " + mod(a,b) );
		IBIO.output("log base " + a + " of " + b + " = " + log(a, b) );
		IBIO.output( a + " to the power of " + b + " = " + power(a,b) );
		IBIO.output( "Is " + a + " a prime? " + isPrime(a) );
		IBIO.output( "Is " + b + " a prime? " + isPrime(b) );
		/* for the commas:
		 * for the power calculation, add an IF statement
		 * to output commas(a,b) if b is positive only 
		IBIO.output( a + " + " + b + " = " + commas(add(a,b)) );
		IBIO.output( a + " - " + b + " = " + commas(sub(a,b)) );
		IBIO.output( a + " * " + b + " = " + commas(mult(a,b)) );
		IBIO.output( a + " / " + b + " = " + div(a,b) );
		IBIO.output( a + " modulo " + b + " = " + mod(a,b) );
		IBIO.output("log base " + a + " of " + b + " = " + log(a, b) );
		IBIO.output( a + " to the power of " + b + " = " + power(a,b) );
		*/
	}
}

