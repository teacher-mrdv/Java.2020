/*
 * test code to check the possible answer to array exercise #1
 * mrdv 2020
 */
public class Array1
{
	public static void printArray(String[] array)
	{
		for( String s : array )
		{	System.out.printf( "%10s ", s);
		}
		System.out.println();
	}
	
	// this method doesn't need to return anything because it
	// changes the original array (due to 'array'
	// referencing the argument array; array = names
	public static void reverse(String[] array)
	{
		int length = array.length;
		int left = 0;
		while(left < length/2 )
		{	String temp = array[left];
			int right = length-left-1;
			array[left] = array[right];
			array[right] = temp;
			left++;
			//printArray(array);
		}
	}
	
	public static void main (String[] args)
	{
		System.out.println();
		String[] names = { "Robert", "Boris", "Brian", "George", "David" };
		String[] names2 = { "Robert", "Boris", "Brian", "George", "David", "Kyle" };
		printArray(names);
		reverse(names);
		printArray(names);
		
		System.out.println();
		
		printArray(names2);
		reverse(names2);
		printArray(names2);
	}
}

