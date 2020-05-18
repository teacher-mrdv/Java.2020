import java.util.Scanner;

public class RecursiveBinarySearch
{
	static int recursiveCalls;
	
	public static int recursiveBinarySearch(int[] a, int key, int first, int last ) // recursive version
	{
		// more code...
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] random = { 7,9,6,8,1,3,5,0,2,4 };		// array of integers in random order
		int[] descending = { 9,8,7,6,5,4,3,2,1,0 };	// array of integers descending order
		int[] ascending = { 0,1,2,3,4,5,6,7,8,9 };	// array of integers in ascending order
		int[] almostSorted = { 0,1,2,3,4,5,6,7,9,8 };// array of integers ALMOST sorted (ascending) -- you may want to use this for further testing your algorithms ---
		
		int n , location;
		Scanner inputInt = new Scanner(System.in);
		for(int i = 0; i < 3; i++) // to test a few cases...
		{
			System.out.println("\nSequential search: ");
			printArray(random);
			System.out.print("Input a number to search: ");
			n = inputInt.nextInt(); // input a number
			location = linearSearch(random, n);
			if(location == -1)
			{	System.out.println( n+" not found." );
			} else {
				System.out.println( n+" found at index " + location );
			}

			System.out.println("\nBinary search: "); // array must be sorted
			printArray(ascending);
			System.out.print("Input a number to search: ");
			n = in.nextInt();
			location = binarySearch(ascending, n);
			if(location == -1)
			{	System.out.println( n+" not found." );
			} else {
				System.out.println( n+" found at index " + location );
			}
			System.out.println( "\nRecursive Binary search:" );
			recursiveCalls = 0;
			location = recursiveBinarySearch(ascending, n, 0, ascending.length);
			System.out.println("\tRecursive Calls = " + recursiveCalls);
			if(location == -1)
			{	System.out.println( n+" not found." );
			} else {
				System.out.println( n+" found at index " + location );
			}
			
		}
	
	}
	
	public static void printArray(int[] array)	// O(n) n=array length
	{
		for( int e: array )						// for each element in the array
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int linearSearch(int[] a, int key) // key = element that we are looking for
	{	int counter = 0; // optional
		boolean found = false; // flag
		int index = 0;
		int location = -1; // -1 if not found
		while( !found && index < a.length)
		{	if( a[index] == key)
			{	found = true;
				location = index;
			}
			index++;
			counter++; // count each comparison
		}
		System.out.println("Steps: " + counter); // optional
		return location;
	}
	
	public static int binarySearch(int[] a, int key) // O(log2 n) -- iterative (loop) version
	{	int counter = 0;
		int location = -1;
		int middle = 0;
		int first = 0;
		int last = a.length - 1;
		
		boolean found = false;
		
		while(!found && first <= last)
		{
			middle = (first + last) / 2;
			//System.out.printf("\tIndices: first = %d | last = %d | middle = %d \n", first, last, middle); // optional
			if(key == a[middle])
			{	found = true;
				location = middle;
			}
			else if( key < a[middle] )
			{	last = middle - 1;
			}
			else
			{	first = middle + 1;
			}
		
			counter++; // count each comparison
		}
		
		System.out.println("Steps: " + counter);
		return location;
	}

}

