public class Q3 // revision for Q3 array test
{	public static final int SIZE = 90;
	
	public static void populate(int[] array)
	{	int triangular = 0;
		for(int i = 0; i < array.length; i++)
		{	triangular = triangular + (i+1);
			array[i] = triangular % 100;
		}
	}
	
	public static void printArray(int[] array, int z)
	{	if(z < 0 || z >array.length)
		{	for(int i = 0; i < array.length; i++)
			{	System.out.println(array[i] + "  ");
			}
		} else
		{	System.out.println("Nothing to print");
		}
	}
		
	public static double average(int[] array)
	{	double sum = 0;
		for(int n : array)
		{	sum += n; // sum = sum + n;
		}
		return sum/array.length;
	} 
	
	public static int freq(int[] array, int n)
	{	int counter = 0;
		for(int i = 0; i < array.length; i++)
		{	if(array[i] == n)
			{	counter++;
			}
		}
		return counter;
	}
	
	// from scratch
	public static int uniques(int[] array)
	{	int uniques = 0;
		for(int i = 0; i < array.length; i++)
		{	int counter = 0; // for each number in array
			for(int j = 0; j < array.length; j++)
			{	if(array[i] == array[j])
				{	counter++;
				}
			}
			if(counter == 1)
			{	System.out.println("Unique found: " + array[i]);
				uniques++;
			}
		}
		return uniques;
	}
	
	// recycling FREQ method version
	public static int countUniques(int[] array)
	{	int uniques = 0;
		for(int i = 0; i < array.length; i++)
		{	if( freq(array, array[i]) == 1)
			{	System.out.println(">>> Unique found: " + array[i]);
				uniques++;
			}
		}
		return uniques;
	}
	
	public static void main (String[] args)
	{
		int[] seq = new int[SIZE];
		populate(seq);
		System.out.println("\n90th term: " + seq[89]);
		System.out.println("\nAverage: " + average(seq));
		int x = IBIO.inputInt("\nNumber to search for: ");
		while(x < 1 || x > 99)
		{	x = IBIO.inputInt("Error in input - number to search for: ");
		}
		int f = freq(seq, x);
		if(f > 0)
		{	System.out.println(x + " found " + f + " times.");
		} else {
			System.out.println(x + " not found");
		}
		System.out.println();
		System.out.println("Unique numbers in the sequence: " + uniques(seq));
		System.out.println();
		System.out.println("> Unique numbers in the sequence: " + countUniques(seq) );
	}
}

