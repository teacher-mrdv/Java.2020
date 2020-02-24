public class Chapter8 // Problem 8.5
{
	
	public static void main( String args[])
	{
		int c = 0; // counter
		for (int i = 1; i < 100; i++)
			for (int j = i; j < 100; j++)
				for (int k = 1; k < 100; k++)
				{
					if ( good(i,j,k) && gcd(gcd(i,j), k) == 1)
					{	System.out.println(i + " " + j + " " + k);
						c++;
					}
					
				}
		System.out.println(c);
	}

	static boolean good(int a, int b, int c)
	{
		return ( a*a + b*b == c*c );
	}
	
	static int gcd(int a, int b) // Pr. 8.4
	{	int gcd = 0;
		if(a == b)
		{	return a;
		} else {
			while(a != b)
			{	if(a > b)
				{	a = a -b;
					gcd = a;
				} else {
					b = b - a;
					gcd = b;
				}
			}
		}
		return gcd;
	}
}

