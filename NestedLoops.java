public class NestedLoops
{
	
	public static void main (String[] args)
	{	int c = 0;
		int n = 9;
		System.out.println("i j k");
		for(int i = 0; i <= n; i++)
		{	for(int j = 0; j <= n; j++)
			{
				for(int k = 0; k <= n; k++)
				{	System.out.println(i + " " + j + " " + k);
					c++;
				}
			}
		}
		System.out.println(c);
	}
}

