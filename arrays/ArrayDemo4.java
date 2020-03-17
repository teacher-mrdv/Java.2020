/*
 * This class creates and manipulates a list (ordered)
 * using an array of Strings				  =======
 * Focus: Sequential search, advanced array manipulation
 * v0.9 MDV
 * 
 */
import java.util.*;

public class ArrayDemo4
{
	public static final int SIZE = 10; // global constant, max. size of the array
	 // global variables
	public static String[] orderedList = new String[SIZE]; // array of orderedList (like a list)
	public static int end = 0; // used to keep track of how many elements are in the array
	
	public static boolean isFull() // returns true when the array is full
	{
		return end == SIZE;
	}
	
	public static boolean isEmpty() // returns true when the array is empty
	{
		return end == 0;
	}
	
	// return true if append is successful; false otherwise
	public static boolean append(String s)
	{	if( !isFull() )
		{	orderedList[end] = s;
			end++;
			return true;
		} else {
			return false;
		}
	}
	
	// replace all nulls with elements existing in the array
	// move up
	public static int pack(String[] a)
	{	int empties = 0;
		for(int i = 0; i < a.length-1; i++)
		{	if(a[i] == null)
			{	empties++;
				for(int j = i; j < a.length-1; j++)
				{	a[j] = a[j+1];
				}
				System.out.print(">>>"); printArray(a); // tracing purposes only, optional
			}
		}
		for(int i = a.length-1; i > a.length-1-empties; i--) // clean up
		{	a[i] = null;
		}
		return empties; // number of gaps/empty indices 'packed'
	}
	
	// append an element at any index, make space for it in the array
	// if array is not full (move elements down)
	public static boolean insertAt(int index, String s)
	{
		if( isFull() || index < 0 || index > end) // validations
		{	return false;
		}
		if(orderedList[index] == null)	// inserting at an empty index
		{	orderedList[index] = s;
			return true;
		} else if(orderedList[orderedList.length-1] != null)
		{	return append(s);
		}
		end++;				// inserting anywhere else in the list
		for(int i = orderedList.length - 1; i > index; i--)
		{	orderedList[i] = orderedList[i - 1];
		}
		orderedList[index] = s;
		return true;
	}
	
	// prints the POPULATED elements of the array (provided end is used & updated correctly, of course
	public static void printArray(String[] a)
	{
		if( isEmpty() )
		{	System.out.println("Array empty");
			return;
		}
	
		for(int i = 0; i < a.length; i++) // traversal
		{
			//if(a[i] != null)
			{	System.out.printf("%2d: %-10s", i, a[i]);
			}
			if(i < a.length-1)
			{
				System.out.print(" | ");
			} else {
				System.out.println();
			}
		}
		//System.out.println();
	}
	
	// prints ONE element of the array, the one at the given valid index within the array bounds
	public static void printAt(int index)
	{
		if(index < 0 || index >= orderedList.length) // orderedList.length or also SIZE
		{
			System.out.println("Error-index outside limits");
			return;
		}
		System.out.println(orderedList[index]);
	}
		
	// removes the element at index INDEX (changes it to NULL)
	public static String removeAt(int index)
	{
		if(index < 0 || index >= SIZE)
		{	System.out.println("Error-index outside limits");
			return null;
		}
		String removed = orderedList[index];
		orderedList[index] = null;
		//printArray(); // optional
		end--;
		return removed;
	}
	
	// replaces the name/string at index INDEX with the string REPLACE
	public static String replace(int index, String replace)
	{
		if(index < 0 || index > orderedList.length)
		{
			System.out.println("Error-index outside limits");
			return null;
		}
		String old = orderedList[index];
		orderedList[index] = replace;
		return old;
	}
	
	// returns the index of the string NAME in the array, or -1 if NAME isn't in the array
	public static int indexOfName(String name)
	{
		for(int i = 0; i < orderedList.length; i++)
		{	if(name.equalsIgnoreCase(orderedList[i]))
			{	return i;
			}
		}
		return -1;
	}
	
	public static String removeByName(String name)
	{
		int index = indexOfName(name);
		return removeAt(index);
		// complete & modify; return removed name
	}
	
	public static String replaceByName(String oldName, String newName)
	{
		int index = indexOfName(oldName);
		return replace(index, newName);
		// complete & modify; return replaced name (or boolean to show successful replacement T/F)
	}
	
	// ============== Main ================
	
	public static void main (String[] args)
	{
		printArray(orderedList);
		append("Barry"); printArray(orderedList);
		append("Diana"); printArray(orderedList);
		append("J'onn"); printArray(orderedList);
		append("Bruce"); printArray(orderedList);
		append("Clark"); printArray(orderedList);
		append("Ray Palmer"); printArray(orderedList);
		append("Victor"); printArray(orderedList);
		append("Hal"); printArray(orderedList);
		append("Gleek"); printArray(orderedList);
		
		System.out.println("Removing @5: " + removeAt(5) );
		printArray(orderedList);
		System.out.println("Inerting Kyle: " + append("Kyle") );
		printArray(orderedList);
		System.out.println("Inserting Starfire @0: " + insertAt(0, "Starfire") );
		System.out.println("Inserting Osterman @9: " + insertAt(9, "Osterman") );
		printArray(orderedList);
		System.out.println("Removing @3, @5, @8, @9");
		removeAt(3); removeAt(5); removeAt(8); removeAt(9);
		printArray(orderedList);
		System.out.println("Inserting Oracle @2: " + insertAt(2, "Oracle") );
		printArray(orderedList);
		System.out.println("Inserting Osterman @9: " + insertAt(9, "Osterman") );
		System.out.println("Inserting X @7: " + insertAt(7, "X") );
		printArray(orderedList);
		System.out.println("Removing X: " + removeByName("X") ); printArray(orderedList);
		System.out.printf("Packing array. %d indices (slots) packed.\n", pack(orderedList) );
		printArray(orderedList);
	}
}

