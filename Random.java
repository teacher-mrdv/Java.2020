/* Example of the random static method
 * from the Math Java built-in class
 */
public class Random
{
	public static int random(int max)
	{
		return (int)(Math.random()*max) + 1;
	}

	public static void main (String[] args)
	{
		int[] array = new int[100];
		
		//System.out.println(random(2,3));
		System.out.println("Array Length :" + array.length);
		for(int i = 0; i < 100; i++)
		{
			array[i] = random(6);
		}
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}

