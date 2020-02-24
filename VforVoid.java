public class VforVoid
{
	public static int add(int x, int y) // fruitful method
	{	return x+y;
	}
	
	public static void displaySum(int x, int y) // void method (returns nothing)
	{	System.out.println(x + y);
	}
	
	public static void main (String[] args)
	{
		int a = add(32, add(5, 3));
		System.out.println(a);
		displaySum(32,8);
	}
}

