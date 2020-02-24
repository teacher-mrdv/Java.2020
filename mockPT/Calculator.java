public class Calculator
{
	public static int add(int x, int y)
	{	return x + y;
	}
	
	public static int sub(int x, int y)
	{	return x - y;
	}
	
	public static int mult(int x, int y)
	{	return x * y;
	}
	
	public static double div(int x, int y)
	{	return (double)x / y;
	}
	
	public static int mod(int x, int y)
	{
		return x % y;
	}
	
	// (required) v-return type   vvvvv-argument(s,)
	public static boolean isPrime(int x) // method signature
	// .................. ^^^^^^^-method identifier/name
	{
		// make sure x is not negative
		if(x < 0) {	x = x * -1; } // or x = Math.abs(x);
		int i = 2;
		if(x == 0 || x == 1)
		{	return false;
		} else {
			do
			{	if(x % i == 0)
				{	return false;
				}
				i++;
			} while(i < x);
		}
		return true;
	}
	
	public static boolean isDivisor(int x, int y)
	{	if(x % y == 0)
		{	return true;
		} else {
			return false;
		}
		// alternatively: return (x % y == 0);
	}
	
	public static double power(int base, int exp)
	{	double result = 1;
		if(exp == 0)
		{	return 1;
		}
		for(int i = 0; i < Math.abs(exp); i++)
		{	result = result * base;
		}
		if(exp < 0) // negative exponent
		{	result = 1.0/result;
		}
		return result;
	}
	
	public static double log(int base, int x)
	{
		return Math.log(x) / Math.log(base);
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
	}
}

