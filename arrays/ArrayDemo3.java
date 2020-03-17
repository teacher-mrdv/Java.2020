/*
 * This class creates and manipulates a list
 * using an array of Strings
 * Focus: Sequential search, advanced array manipulation
 * v0.9 MDV
 * 
 */
import java.util.*;

public class ArrayDemo3
{
	public static final int SIZE = 10; // global constant, max. size of the array
	 // global variables
	public static String[] names = new String[SIZE]; // array of names (like a list)
	public static int counter = 0; // used to keep track of how many elements are in the array
	
	public static boolean isFull() // returns true when the array is full
	{
		return counter == SIZE;
	}
	
	public static boolean isEmpty() // returns true when the array is empty
	{
		return counter == 0;
	}
	
	// FLEXIBLE, but NOT efficient & counter cannot be used as index of next name to add
	// this inserts a name in the first null index found in the array
	public static boolean insert(String name)
	{
		for(int i = 0; i < names.length; i++)
		{
			if(names[i] == null)
			{
				names[i] = name;
				counter++;
				return true; //insert successful
			}
		}
		return false; // end of array reached, insert failed
	}
	
	// replace all nulls with elements existing in the array
	// move up
	public static void pack(String[] a)
	{	int empties = 0;
		for(int i = 0; i < a.length-1; i++)
		{	if(a[i] == null)
			{	empties++;
				for(int j = i; j < a.length-1; j++)
				{	a[j] = a[j+1];
				}
				System.out.print(">>>"); printArray(a);
			}
			
		}
		for(int i = a.length-1; i > a.length-1-empties; i--)
		{	a[i] = null;
		}
	}
	
	// insert an element at any index, make space for it in the array
	// if array is not full (move elements down)
	public static boolean insertAt(int index, String s)
	{
		if( isFull() || index < 0 || index >= names.length ) // range validation
		{	return false;
		}
		if(names[index] == null)	// inserting at the end of the list
		{	names[index] = s;
			return true;
		}
		counter++;				// inserting anywhere else in the list
		for(int i = names.length - 1; i > index; i--)
		{	names[i] = names[i - 1];
		}
		names[index] = s;
		return true;
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
		System.out.println();
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
		counter--;
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
		System.out.println("Inerting Kyle: " + insert("Kyle") );
		printArray(names);
		System.out.println("Inserting Starfire @0: " + insertAt(0, "Starfire") );
		printArray(names);
		System.out.println("Removing @3, @5, @8, @9");
		removeAt(3); removeAt(5); removeAt(8); removeAt(9);
		printArray(names);
		System.out.println("Inserting Oracle @2: " + insertAt(2, "Oracle") );
		insertAt(9, "Osterman"); printArray(names);
		System.out.println("Packing array");
		
		pack(names); printArray(names);
	}
}

