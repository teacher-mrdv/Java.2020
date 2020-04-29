/* Sorting & searching algorithms - String version!
 * 
 * version 2.3
 * 
 * 29/April/2020
 * 
 * Please read sorting_algos_SL document for the corresponding pseudocode algorithms
 * and searching_algos_SL for linear/sequential and binary search pseudocode algorithms
 * 
 * Also check https://visualgo.net/en/sorting and the links provided in the comments
 * before the searching methods
 * 
 *****************************************************************
 * WRITE & MAKE THE NECESSARY MODIFICATIONS TO ALL OTHER METHODS *
 * SO THAT THEY CAN HANDLE STRINGs!!!                            *
 *****************************************************************
 * 
 */
import java.util.Scanner;

public class SortingSearchingString
{
	public static void printArray(String[] array)
	{
		for( String e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static String[] clone(String[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		String[] copy = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	public static void bubble(String[] a) // optimised bubble sort (there are other 2 less optimised versions)
	{
		int counter = 0;		// to count the number of swaps made
		boolean swapped = true; // this is called a FLAG
		int lastElement = a.length;
		while(swapped)
		{
			swapped = false;	// assumes no swaps made
			for(int i = 0; i < lastElement-1; i++) // inner loop
			{	if(a[i].compareToIgnoreCase(a[i+1]) > 0)
				{	String temp = a[i]; // swap elements out of order
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
					
					counter++;
					System.out.print(">>> "); // shows you each swap made
					printArray(a); // shows the array as we sort
				}
			}
			lastElement--; // avoid comparing already sorted (bubbled-up) elements
		}
		
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
	}

	
	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(String[] a)
	{
		int counter = 0;
		for(int i = 1; i < a.length; i++)
		{	boolean change = false;
			String temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j].compareTo(temp) > 0)
			{
				a[j+1] = a[j];	// make room to insert element in its right place
				j--;
				change = true;	// flag to show change in the array (because a[j] > temp)
				System.out.print(">>> ");	// shows you each change to the array made
				printArray(a);	// shows the array as we sort
				//counter++; 
			}
			if(change)
			{	a[j+1] = temp;	// swap/insert/put temp in the right place only if necessary
				counter++;
			}
		}
		System.out.println("DONE! " + counter +" insertions to sort " + a.length + " elements.");
	}
	
	
	// worst case scenario is N (array length) steps to find the key
	// (or to realise that it's not there)
	public static int linearSearch(String[] a, String key)
	{	int counter = 0;
		boolean found = false;
		int index = 0;
		int location = -1; // -1 if not found
		while( !found && index < a.length)
		{	if( a[index].equalsIgnoreCase(key) )
			{	found = true;
				location = index;
			}
			index++;
			counter++;
		}
		System.out.println("Steps: " + counter);
		return location;
	}
	
	// Binary search video: https://youtu.be/o2LqhHoAXxI
	public static int binarySearch(String[] a, String key)
	{	int counter = 0;
		int location = -1;
		int middle = 0;
		int first = 0;
		int last = a.length - 1;
		
		boolean found = false;
		
		while(!found && first <= last)
		{
			middle = (first + last) / 2;
			System.out.printf("\tIndices: first = %d | last = %d | middle = %d \n", first, last, middle); // optional
			if( key.equals(a[middle]) )
			{	found = true;
				location = middle;
			}
			else if( key.compareTo(a[middle]) < 0 )
			{	last = middle - 1;
			}
			else
			{	first = middle + 1;
			}
		
			counter++;
		}
		
		System.out.println("Steps: " + counter);
		return location;
	}
	
	// No need to modify the main method.
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// arrays of String in random, descending and ascending orders for testing
		String[] random = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		String[] descending = { "viernes", "sabado", "miercoles", "martes", "lunes", "jueves", "domingo" };
		String[] ascending  = { "domingo", "jueves", "lunes", "martes", "miercoles", "sabado", "viernes" };
		String[] almostSorted  = { "domingo", "jueves", "lunes", "martes", "miercoles", "sabado", "viernes", "alpha" }; // ascending, but with a surprise to make sure your algorithms work properly (alpha should be sorted) -- use this for extra testsing!!!
		
		// bubble sort
		System.out.println("\nBubble sort-Random array");
		String[] array = clone(random);
		printArray(random);
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nBubble sort-descending array");
		array = clone(descending); printArray(array);
		bubble( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nBubble sort-ascending array");
		array = clone(ascending); printArray(array);
		bubble( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nBubble sort-almost sorted array");
		array = clone(almostSorted); printArray(array);
		bubble( array );
		printArray(array);
		System.out.println();

		// insertion sort
		System.out.println("\nInsertion sort-Random array");
		array = clone(random); printArray(array);
		printArray(random);
		insertion( array );
		printArray(array);
		System.out.println();

		System.out.println("\nInsertion sort-descending array");
		array = clone(descending); printArray(array);
		insertion( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nInsertion sort-ascending array");
		array = clone(ascending); printArray(array);
		insertion( array );
		printArray(array);
		System.out.println();

		System.out.println("\nInsertion sort-almost sorted array");
		array = clone(almostSorted); printArray(array);
		insertion( array );
		printArray(array);
		System.out.println();

		// searching algos.
		System.out.println("\n\nSequential search: ");
		printArray(random);
		System.out.print("Input a string to search: ");
		String s = in.nextLine();
		int location = linearSearch(random, s);
		if(location == -1)
		{	System.out.println( s + " not found." );
		} else {
			System.out.println( s + " found at index " + location );
		}
		
		System.out.println("\n\nBinary search: ");
		printArray(ascending);
		System.out.print("Input a string to search: ");
		s = in.nextLine();
		location = binarySearch(ascending, s);
		if(location == -1)
		{	System.out.println( s + " not found." );
		} else {
			System.out.println( s + " found at index " + location );
		}
	}
}
