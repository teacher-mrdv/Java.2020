/* Sorting algorithms formative assessment
 * 
 * Student Name: 
 * 
 * 23/March/2020
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
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
		while(swapped == true) // outer loop
		{
			swapped = false; // assumes no swaps made
			for(int i = 0; i < lastElement-1; i++) // inner loop
			{	if(a[i] > a[i+1])
				{	int temp = a[i]; // swap elements out of order
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

	// https://youtu.be/JU767SDMDvA
	public static void simpleInsertion(int[] a)
	{
		// your code goes here - sort the array a using insertion sort
	}

	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(int[] a)
	{
		// your code goes here - for the alternative insertion sort
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		//int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] original = { 9,8,7,6,5,4,3,2,1,0 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		printArray(original);
		selection( array );
		printArray(array);

		System.out.println("\nSimple Insertion sort");
		array = clone(original);
		simpleInsertion( array );
		printArray(array);
/*
		System.out.println("\nAlternative Insertion sort");
		array = clone(original);
		insertion( array );
		printArray(array);
*/
	}
}
