/* Sorting & searching algorithms
 * 
 * version 3
 * 
 * 12/May/2020
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting and
 * https://www.freecodecamp.org/news/time-is-complex-but-priceless-f0abd015063c/
 * 
 * You could add code in the main method to test the remaining sorting algorithms with
 * the almostSorted array
 * 
 * You may want to split the counter into two, one counter to count comparison, and
 * another to count swaps/insertions, if you want a more detailed breakdown (optional)
 * 
 */
import java.util.*;

public class SortingSearching
{
	public static void printArray(int[] array)	// O(n) n=array length
	{
		for( int e: array )						// for each element in the array
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array)		// returns a copy of array O(n) n=array length
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	public static void bubble(int[] a)  // O(n^2)
	{
		int counter = 0;
        int lastElement = a.length;
        for (int i = 0; i < lastElement; i++)
        {
            for (int j = 0; j < lastElement - 1; j++) // inner loop
            {
                counter++; // count comparisons
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    counter++; // count swaps
                }
                //System.out.print(">>> ");	// shows you each swap made
                //printArray(a);		// shows the array as we sort
                
            }
        }
        System.out.println("DONE! " + counter + " steps to sort " + a.length + " elements.");
	}

	public static void optimisedBubble(int[] a)  // O(n^2)
	{
		int counter = 0;		// count the number of swaps made
		boolean swapped = true; // this is called a FLAG
		int lastElement = a.length;
		while(swapped)			// stops trying to sort if no swaps made in one pass
		{
			swapped = false;	// assumes no swaps made
			for(int i = 0; i < lastElement-1; i++) // inner loop
			{	counter++;		// count comparisons
				if(a[i] > a[i+1])		// a[i].compareTo(a[i+2]) > 0 :for Strings
				{	int temp = a[i];	// swap elements out of order
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;		// we made a swap, flag it
					
					counter++;					// counts the number of swaps made
					//System.out.print(">>> ");	// shows you each swap made
					//printArray(a);				// shows the array as we sort
				}
			}
			lastElement--; // avoid comparing already sorted (bubbled-up) elements
		}
		
		System.out.println("DONE! " + counter +" steps to sort " + a.length + " elements.");
	}

	public static void selection(int[] a) // O(n^2)
	{	int counter = 0;
		int small_index;
		for(int i = 0; i < a.length; i++)
		{	small_index = i;
			for(int j = i+1; j < a.length; j++) // looks for the smallest unsorted element
			{	counter++;						// count comparisons
				if( a[j] < a[small_index] )		// check for a smaller element and 
				{	small_index = j;			// change the index of smallest unsorted element
				}
			}
			int temp = a[i];
			a[i] = a[small_index];
			a[small_index] = temp;
			
			//System.out.print(">>> ");	// shows you each swap made
			//printArray(a); 				// shows the array as we sort
			counter++;					// count swaps
		}
		System.out.println("DONE! " + counter +" steps to sort " + a.length + " elements.");
	}

	public static void optimisedSelection(int[] a)  // O(n^2)
	{	boolean change ;
		int counter = 0;
		int small_index;
		for(int i = 0; i < a.length; i++)
		{	small_index = i;
			change = false;
			for(int j = i+1; j < a.length; j++) // looks for the smallest unsorted element
			{	counter++;						// count comparisons
				if( a[j] < a[small_index] )		// check for a smaller element and 
				{	small_index = j;			// change the index of smallest unsorted element
					change = true;
				}
			}
			if(change)
			{
				int temp = a[i];		// swap element (put smaller at the
				a[i] = a[small_index];	// beginning of the unsorted array)
				a[small_index] = temp;
				counter++;				// count swaps
			}
			// this no good... check the almost sorted case with and w/o this else
			/* else {
				break;
			} */
			//System.out.print(">>> ");	// shows you each swap made
			//printArray(a);				// shows the array as we sort
		}
		System.out.println("DONE! " + counter +" steps to sort " + a.length + " elements.");
	}


	// https://youtu.be/JU767SDMDvA
	public static void simpleInsertion(int[] a)
	{	int counter = 0;
		for(int i = 1; i < a.length; i++)
		{	int j = i;
			while(j > 0 && a[j-1] > a[j]) // loop until the element is in its right place
			{	counter++;			// count comparison: a[j-1] > a[j]
				int temp = a[j];	// swap elements to put them in order
				a[j] = a[j-1];		// moving the element up (left)
				a[j-1] = temp;		// finish swapping
				j--;				// move to the left...
				
				//System.out.print(">>> ");
				//printArray(a);		// shows the array as we sort
				counter++;			// count insertions
			}
		}
		System.out.println("DONE! " + counter +" steps to sort " + a.length + " elements.");
	}

	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(int[] a) // O(n^2)
	{
		int counter = 0;
		for(int i = 1; i < a.length; i++)
		{	boolean change = false;
			int temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > temp)
			{
				counter++;		// count the a[j] > temp comparison
				a[j+1] = a[j];	// make room to insert element in its right place
				j--;
				change = true;	// flag to show change in the array (because a[j] > temp)
				//System.out.print(">>> ");	// shows you each change to the array made
				//printArray(a);	// shows the array as we sort
			}
			if(change)
			{	a[j+1] = temp;	// swap/insert/put temp in the right place only if necessary
				counter++;		// count the insertion
			}
		}
		System.out.println("DONE! " + counter +" steps to sort " + a.length + " elements.");
	}
	
	// worst case scenario is N (array length) steps to find the key (or to realise that it's not there)
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
	public static int binarySearch(int[] a, int key) // O(log2 n)
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
	
	// No need to modify the main method.
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] random = { 7,9,6,8,1,3,5,0,2,4 };		// array of integers in random order
		int[] descending = { 9,8,7,6,5,4,3,2,1,0 };	// array of integers descending order
		int[] ascending = { 0,1,2,3,4,5,6,7,8,9 };	// array of integers in ascending order
		int[] almostSorted = { 0,1,2,3,4,5,6,7,9,8 };// array of integers ALMOST sorted (ascending) -- you may want to use this for further testing your algorithms ---
		int[] array;

		System.out.println("\nBubble sort-Random array");
		array = clone(random);
		printArray(random);
		bubble( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nBubble sort-descending array");
		array = clone(descending);
		bubble( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nBubble sort-ascending array");
		array = clone(ascending);
		bubble( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nOptimised Bubble sort-Random array");
		array = clone(random);
		printArray(random);
		optimisedBubble( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Bubble sort-descending array");
		array = clone(descending);
		optimisedBubble( array );
		printArray(array);
		//System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Bubble sort-ascending array");
		array = clone(ascending);
		optimisedBubble( array );
		printArray(array);
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
		
		System.out.println("\n******Optimised Selection sort-almost sorted array******");
		array = clone(almostSorted);
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
