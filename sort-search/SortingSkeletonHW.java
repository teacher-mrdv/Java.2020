/* Sorting algorithms
 * 
 * Final version 
 * 
 * 20/April/2020
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
import java.util.*;

public class SortingSkeletonHW
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

	static void bubble(int[] a) // optimised bubble sort (there are other 2 less optimised versions)
	{
		int counter = 0; // count the number of swaps made
		boolean swapped = true; // this is called a FLAG
		int lastElement = a.length;
		while(swapped) // n
		{
			swapped = false; // assumes no swaps made
			for(int i = 0; i < lastElement-1; i++) // inner loop n
			{	counter++;
				if(a[i] > a[i+1])
				{	int temp = a[i]; // swap elements out of order
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
					
					counter++;
					//System.out.print(">>> "); // shows you each swap made
					//printArray(a); // shows the array as we sort
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
			{	counter++;
				if( a[j] < a[small_index] )		// check for a smaller element and 
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

	public static void optimisedSelection(int[] a)
	{	int counter = 0;
		int small_index;
		boolean swapped;
		for(int i = 0; i < a.length; i++)
		{
			small_index = i;
			for(int j = i+1; j < a.length; j++) // looks for the smallest unsorted element
			{	if( a[j] < a[small_index] )		// check for a smaller element and 
				{	small_index = j;			// change the index of smallest unsorted element
				}
			}
			if(small_index != i)
			{
				int temp = a[i];
				a[i] = a[small_index];
				a[small_index] = temp;
			} else {
				break;
			}
			
			System.out.print(">>> "); // shows you each swap made
			printArray(a); // shows the array as we sort
			counter++;
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
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
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
			{	a[j+1] = temp;	// insert/put temp in the right place
				counter++;
			}
		}
		System.out.println("DONE! " + counter +" swaps to sort " + a.length + " elements.");
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] random = { 7,9,6,8,1,3,5,0,2,4 };		// array of integers in random order
		int[] descending = { 9,8,7,6,5,4,3,2,1,0 };	// array of integers descending order
		int[] ascending = { 1,2,3,4,5,6,7,8,9,10 };	// array of integers in ascending order
		int[] array = clone(random);
		System.out.println("random array");
		printArray(random);

		System.out.println("\nBubble sort-Random array");
		bubble( array );
		printArray(array);
		System.out.println();
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nBubble sort-descending array");
		array = clone(descending);
		bubble( array );
		printArray(array);
		System.out.println();
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nBubble sort-ascending array");
		array = clone(ascending);
		bubble( array );
		printArray(array);
		System.out.println();
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nSelection sort-Random array");
		array = clone(random);
		printArray(random);
		selection( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nSelection sort-Descending array");
		array = clone(descending);
		printArray(random);
		selection( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nSelection sort-Ascending array");
		array = clone(ascending);
		printArray(random);
		selection( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Selection sort-Random array");
		array = clone(random);
		printArray(array);
		optimisedSelection( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Selection sort-Descending array");
		array = clone(descending);
		printArray(array);
		optimisedSelection( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nOptimised Selection sort-Ascending array");
		array = clone(ascending);
		printArray(array);
		optimisedSelection( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nSimple Insertion sort-Random array");
		array = clone(random);
		printArray(random);
		simpleInsertion( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nSimple Insertion sort-Descending");
		array = clone(descending);
		printArray(array);
		simpleInsertion( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nSimple Insertion sort-Ascending");
		array = clone(ascending);
		printArray(array);
		simpleInsertion( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

		System.out.println("\nAlternative Insertion sort-Random array");
		array = clone(random);
		printArray(array);
		insertion( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nAlternative Insertion sort-Descending array");
		array = clone(descending);
		printArray(array);
		insertion( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();
		
		System.out.println("\nAlternative Insertion sort-Ascending array");
		array = clone(ascending);
		printArray(array);
		insertion( array );
		printArray(array);
		System.out.print("Press [Enter] or [Return] to continue."); in.nextLine();

	}
}
