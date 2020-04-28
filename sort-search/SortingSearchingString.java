/* Sorting & searching algorithms - String version!
 * 
 * version 2.2
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

	static void bubble(String[] a) // optimised bubble sort (there are other 2 less optimised versions)
	{
		int counter = 0; // count the number of swaps made
		boolean swapped = true; // this is called a FLAG
		int lastElement = a.length;
		for(int c = 0; c < a.length; c++)
		{
			swapped = false; // assumes no swaps made
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
			lastElement--; // avoid comparing already sorted (bubbled-up elements)
		}
		
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
	}

	
	// worst case scenario is N (array length) steps to find the key
	// (or to realise that it's not there)
	public static int search(String[] a, String key)
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
	{	//int counter = 0;
		int index = -1;
		// code...
		//System.out.println("Steps: " + counter);
		return index;
	}
	
	// No need to modify the main method.
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// array of String in random order
		String[] random = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		String[] descending = { "viernes", "sabado", "miercoles", "martes", "lunes", "jueves", "domingo" };
		String[] ascending  = { "domingo", "jueves", "lunes", "martes", "miercoles", "sabado", "viernes" };
		

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


		System.out.println("\n\nSequential search: ");
		printArray(random);
		System.out.print("Input a number to search: ");
		String s = in.nextLine();
		int location = search(random, s);
		if(location == -1)
		{	System.out.println( s + " not found." );
		} else {
			System.out.println( s + " found at index " + location );
		}
	}
}
