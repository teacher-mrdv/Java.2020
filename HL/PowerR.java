public class PowerR
{
	public static int power(int b, int e)
	{
		if(e == 0)
		{	return 1;
		} else {
			return b * power(b, e-1);
		}
	}
	
	public static void main (String[] args)
	{
		System.out.println( power(2, 10) );
	}
}

