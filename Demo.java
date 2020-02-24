public class Demo
{
	
	public static void main (String[] args)
	{
		int i; // declaration only
		i = 5; // initialisation
		long l = 1024*1024; // declaration + initialisation
		System.out.println(l) ;
		System.out.println(i) ;
		for(int n = 1; n < 20; n = n+1)
		{	System.out.println(n) ;
		}
	
		for (int n = 20; n > 0; n--)
		{
			System.out.println(n) ;
		}
		int n = IBIO.inputInt("Enter a number: ");
		if(n % 2 == 0)
		{	System.out.println("even") ;
		} else {
			System.out.println("odd") ;
		}
		if(n < 0)
		{	System.out.println("Negative") ;
		} else if(n > 0)
		{	System.out.println("Positive") ;
		} else {
			System.out.println("Zero") ;
		}
		* 
		* */
	}
}

