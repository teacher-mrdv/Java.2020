/* Sorting & searching algorithms
 * 
 * version 2
 * 
 * 22/April/2020
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
import java.util.*;

public class SortingSearching
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	public static void bubble(int[] a) // optimised bubble sort (there are other 2 less optimised versions)
	{
		int counter = 0;		// count the number of swaps made
		boolean swapped = true; // this is called a FLAG
		int lastElement = a.length;
		while(swapped)
		{
			swapped = false;	// assumes no swaps made
			for(int i = 0; i < lastElement-1; i++) // inner loop
			{	if(a[i] > a[i+1])		// a[i].compareTo(a[i+2]) > 0 :for Strings
				{	int temp = a[i];	// swap elements out of order
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
					
					counter++;					// counts the number of swaps made
					System.out.print(">>> ");	// shows you each swap made
					printArray(a);				// shows the array as we sort
				}
			}
			lastElement--; // avoid comparing already sorted (bubbled-up elements)
		}
		
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
	}

	public static void selection(int[] a)
	{	int counter = 0;
		int small_index;
		for(int i = 0; i < a.length; i++)
		{	small_index = i;
			for(int j = i+1; j < a.length; j++) // looks for the smallest unsorted element
			{	if( a[j] < a[small_index] )		// check for a smaller element and 
				{	small_index = j;			// change the index of smallest unsorted element
				}
			}
			int temp = a[i];
			a[i] = a[small_index];
			a[small_index] = temp;
			
			System.out.print(">>> "); // shows you each swap made
			printArray(a); // shows the array as we sort
			counter++;
		}
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
	}

	public static void optimisedSelection(int[] a) // challenge for you!
	{	boolean change ;
		int counter = 0;
		int small_index;
		for(int i = 0; i < a.length; i++)
		{	small_index = i;
			change = false;
			for(int j = i+1; j < a.length; j++) // looks for the smallest unsorted element
			{	if( a[j] < a[small_index] )		// check for a smaller element and 
				{	small_index = j;			// change the index of smallest unsorted element
					change = true;
				}
			}
			if(change)
			{
				int temp = a[i];		// swap element (put smaller at the
				a[i] = a[small_index];	// beginning of the unsorted array
				a[small_index] = temp;
				counter++;
			} else {
				break;					// if no changes had to be made in the array, exit
			}
			System.out.print(">>> "); // shows you each swap made
			printArray(a); // shows the array as we sort
			
		}
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
	}


	// https://youtu.be/JU767SDMDvA
	public static void simpleInsertion(int[] a)
	{	int counter = 0;
		for(int i = 1; i < a.length; i++)
		{	int j = i;
			while(j > 0 && a[j-1] > a[j]) // loop until the element is in its right place
			{	int temp = a[j];	//swap elements to put them in order
				a[j] = a[j-1];		// moving the element up (left)
				a[j-1] = temp;		// finish swapping
				j--;				// move to the left...
				
				System.out.print(">>> ");	
				// shows you each swap made
				printArray(a);		// shows the array as we sort
				counter++;
			}
		}
		System.out.println("DONE! " + counter +" insertions to sort " + a.length + " elements.");
	}

	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(int[] a)
	{
		int counter = 0;
		for(int i = 1; i < a.length; i++)
		{	boolean change = false;
			int temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > temp)
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
	
	// worst case scenario is N (array length) steps to find the key (or to realise that it's not there)
	public static int search(int[] a, int key) // key = element that we are looking for
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
			counter++; // optional
		}
		System.out.println("Steps: " + counter); // optional
		return location;
	}
	
	/* Binary search resources:
	 * https://youtu.be/o2LqhHoAXxI
	 * https://www.geeksforgeeks.org/binary-search/
	 * https://www.youtube.com/watch?v=wNVCJj642n4
	 * https://www.youtube.com/watch?v=X3xRQ-j_sOI
	 * 
	 * NOTE: Since binary search requires array to be sorted,
	 * the TOTAL Big O of binary search would be Big O of the sorting algorithm
	 * plus the Big O of the binary search, for example: O(n^2) + log2(n)
	 */
	public static int binarySearch(int[] a, int key)
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
		
			counter++;
		}
		
		System.out.println("Steps: " + counter);
		return location;
	}
	
	// No need to modify the main method.
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] random = { 7,9,6,8,1,3,5,0,2,4 };		// array of integers in random order
		int[] descending = { 9,8,7,6,5,4,3,2,1,0 };	// array of integers descending order
		int[] ascending = { 0,1,2,3,4,5,6,7,8,9 };	// array of integers in ascending order
		int[] array = clone(random);
		System.out.println("random array");
		printArray(random);

		//System.out.println("\nBubble sort-Random array");
		bubble( array );
		printArray(array);
		System.out.println();
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nBubble sort-descending array");
		array = clone(descending);
		bubble( array );
		printArray(array);
		System.out.println();
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nBubble sort-ascending array");
		array = clone(ascending);
		bubble( array );
		printArray(array);
		System.out.println();
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nSelection sort-Random array");
		array = clone(random);
		printArray(random);
		selection( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nSelection sort-Descending array");
		array = clone(descending);
		printArray(random);
		selection( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nSelection sort-Ascending array");
		array = clone(ascending);
		printArray(ascending);
		selection( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		// un-comment this once you've coded the optimised selection sort
		System.out.println("\nOptimised Selection sort-Random array");
		array = clone(random);
		printArray(array);
		optimisedSelection( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Selection sort-Descending array");
		array = clone(descending);
		printArray(array);
		optimisedSelection( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Selection sort-Ascending array");
		array = clone(ascending);
		printArray(array);
		optimisedSelection( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nSimple Insertion sort-Random array");
		array = clone(random);
		printArray(random);
		simpleInsertion( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nSimple Insertion sort-Descending");
		array = clone(descending);
		printArray(array);
		simpleInsertion( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nSimple Insertion sort-Ascending");
		array = clone(ascending);
		printArray(array);
		simpleInsertion( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nAlternative Insertion sort-Random array");
		array = clone(random);
		printArray(array);
		insertion( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nAlternative Insertion sort-Descending array");
		array = clone(descending);
		printArray(array);
		insertion( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nAlternative Insertion sort-Ascending array");
		array = clone(ascending);
		printArray(array);
		insertion( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		int n , location;
		for(int i = 0; i < 5; i++) // to test a few cases...
		{
			System.out.println("\nSequential search: ");
			printArray(random);
			System.out.print("Input a number to search: ");
			n = in.nextInt(); // input a number
			location = search(random, n);
			if(location == -1)
			{	System.out.println( n+" not found." );
			} else {
				System.out.println( n+" found at index " + location );
			}
			
			System.out.println("\nBinary search: "); // array must be sorted
			printArray(array);
			System.out.print("Input a number to search: ");
			n = in.nextInt();
			location = binarySearch(array, n);
			if(location == -1)
			{	System.out.println( n+" not found." );
			} else {
				System.out.println( n+" found at index " + location );
			}
		}
	
	}
}
