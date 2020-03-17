/*
 * This class creates and manipulates a list
 * using an array of Strings
 * Focus: Sequential search, advanced array manipulation
 * v0.3 MDV
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
	public static void pack(String [] array)
	{
		// your code
	}
	
	// insert an element at any index, make space for it in the array
	// if array is not full (move elements down)
	public static boolean insertAt(int index, String s)
	{
		// your code
		return true;
	}
	
	// prints the POPULATED elements of the array (provided counter is used & updated correctly, of course
	public static void printArray()
	{	/*
		if( isEmpty() )
		{	System.out.println("Array empty");
			return;
		}
		System.out.println("\n[INDEX: Name]");
		*/
		for(int i = 0; i < names.length; i++) // traversal
		{
			//if(names[i] != null)
			{	System.out.print(i + ": " + names[i]);
			}
			if(i < names.length-1)
			{
				System.out.print(" | ");
			} else {
				System.out.println();
			}
		}
		System.out.println();
		/*
		for(String s : names) // enhanced for loop
		{	System.out.println(s); // print each element of the array, including NULLs
		}
		*/
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
//		for(int i = index; i < names.length-1; i++)
//		{	
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
		printArray();
		insert("Barry"); printArray();
		insert("Diana"); printArray();
		insert("J'onn"); printArray();
		insert("Bruce"); printArray();
		insert("Clark"); printArray();
		insert("Ray Palmer"); printArray();
		insert("Victor"); printArray();
		insert("Hal"); printArray();
		insert("Gleek"); printArray();
		
		removeAt(5);
		printArray();
		insert("Kyle");
		printArray();
		
	}
}

