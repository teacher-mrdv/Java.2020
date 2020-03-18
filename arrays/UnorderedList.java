/*
 * This class creates and manipulates a list (unordered)
 * using an array of Strings				  =========
 * Focus: Sequential search, advanced array manipulation
 * v0.9 MDV
 * 
 * [A list is a COLLECTION]
 */
import java.util.*;

public class UnorderedList
{
	public static final int SIZE = 10; // global constant, max. size of the array
	 // global variables
	public static String[] names = new String[SIZE]; // array of names (like a list)
	
	public static boolean isFull() // returns true when the array is full
	{	int counter = size(names);
		return counter == SIZE;
	}
	
	public static boolean isEmpty() // returns true when the array is empty
	{	int counter = size(names);
		return counter == 0;
	}
	
	// count populated elements in an unordered list (array)
	public static int size(String[] a)
	{	int populated = 0;
		for(String s : a)
		{	if( s != null)
			{	populated++;
			}
		}
		return populated;
	}
	
	// FLEXIBLE, but NOT efficient & counter cannot be used as index of next name to add
	// this inserts a name in the first null index found in the array
	public static boolean insert(String name)
	{
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] == null)
			{	names[i] = name;
				return true; //insert successful
			}
		}
		return false; // end of array reached, insert failed
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
				printArray(a); // tracing purposes only, optional
			}
		}
		for(int i = a.length-1; i > a.length-1-empties; i--) // clean up
		{	a[i] = null;
		}
		return empties; // number of gaps/empty indices 'packed'
	}
	
	// prints the POPULATED elements of the array (provided counter is used & updated correctly, of course
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
		if(index < 0 || index >= names.length) // names.length or also SIZE
		{
			System.out.println("Error-index outside limits");
			return;
		}
		System.out.println(names[index]);
	}
		
	// removes the element at index INDEX (changes it to NULL)
	public static String removeAt(int index)
	{
		if(index < 0 || index >= SIZE)
		{	System.out.println("Error-index outside limits");
			return null;
		}
		String removed = names[index];
		names[index] = null;
		//printArray(); // optional
		return removed;
	}
	
	// replaces the name/string at index INDEX with the string REPLACE
	public static String replace(int index, String replace)
	{
		if(index < 0 || index > names.length)
		{
			System.out.println("Error-index outside limits");
			return null;
		}
		String old = names[index];
		names[index] = replace;
		return old;
	}
	
	// returns the index of the string NAME in the array, or -1 if NAME isn't in the array
	public static int indexOfName(String name)
	{
		for(int i = 0; i < names.length; i++)
		{	if(name.equalsIgnoreCase(names[i]))
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
		printArray(names);
		insert("Barry"); printArray(names);
		insert("Diana"); printArray(names);
		insert("J'onn"); printArray(names);
		insert("Bruce"); printArray(names);
		insert("Clark"); printArray(names);
		insert("Ray Palmer"); printArray(names);
		insert("Victor"); printArray(names);
		insert("Hal"); printArray(names);
		insert("Gleek"); printArray(names);
		
		System.out.println("Removing @5: " + removeAt(5) );
		printArray(names);
		System.out.println("Inserting Kyle: " + insert("Kyle") );
		printArray(names);
		System.out.println("Inserting Starfire: " + insert("Starfire") );
		System.out.println("Inserting Osterman: " + insert("Osterman") );
		printArray(names);
		System.out.println("Removing @3, @5, @8");
		removeAt(3); removeAt(5); removeAt(8);
		printArray(names);
		System.out.println("\nPacking array."); 
		System.out.printf("%d indices (slots) packed.\n", pack(names) );
		System.out.println(); 
		
		printArray(names);
		System.out.printf("Total elements: %d\n", size(names) );
	}
}

