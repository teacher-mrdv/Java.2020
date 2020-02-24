public class Pr53
{
	public static double pi()
	{
		double sign = 1.0;
		double sum = 0;
		int numerator = 1;
		double term = 0;
		int denominator = 1;
		for(int i = 1; i <= 10000; i=i+1)
		{
			term = sign/denominator;
			denominator = denominator + 2;
			sign = sign * -1.0;
			sum = sum + term;
		}
		return (sum * 4.0);
	}
	
	public static void main (String[] args)
	{
		IBIO.output( pi() );
	}
}

// 3.1414926535900345
