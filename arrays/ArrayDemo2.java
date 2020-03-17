/*
 ARRAYDEMO2 final version
 This class creates and manipulates a list of names using an array of Strings
 * 
 Recommended: add your OWN comments, analyse the code and make sure that you understand how it works.
	Feb.2020 MDV
 */
import java.util.*; // all the good stuff, like Scanner!

public class ArrayDemo2
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
	
	// Adds a string (a name) to the array
	public static void addName(String name)
	{
		if( isFull() )
		{	System.out.println("Array full, can't add.");
		} else {
			names[counter] = name;
			counter++;
		}
	}
	
	// prints the POPULATED elements of the array (provided counter is used & updated correctly, of course
	public static void printArray()
	{	if( isEmpty() )
		{	System.out.println("Array empty");
			return;
		}
		//System.out.println("\n[INDEX: Name]");
		for(int i = 0; i < counter; i++)
		{
			System.out.print(i + ": " + names[i]);
			if(i < counter-1)
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
	
	// remove the last (POPULATED) element from the array
	public static String removeLast()
	{
		String removed = names[counter-1];
		counter--;
		names[counter] = null; // optional
		return removed;
	}
	
	// Creates a copy of the original array skipping all nulls, and returns it
	public static String[] cleanCopy(String[] original)
	{
		String[] copy = new String[original.length]; // same length as original
		int index = 0; // starting index for the new (clone) array
		for(String s : original) // iterate over each element of the original array, including NULLs
		{
			if(s != null) // Skip the NULLs...
			{
				copy[index] = s; // while copying each name
				index++;
			}
		}
		return copy;
	}
	
	// removes the element at index INDEX (changes it to NULL)
	public static String removeAt(int index)
	{
		if(index < 0 || index >= SIZE)
		{
			System.out.println("Error-index outside limits");
			return null;
		}
		String removed = names[index];
		names[index] = null;
		printArray(); // optional
		names = cleanCopy(names);
		counter--;
		return removed;
	}
	
	// replaces the name/string at index INDEX with the string REPLACE
	public static String replace(int index, String replace)
	{
		if(index < 0 || index > counter)
		{
			System.out.println("Error-index outside limits");
			return null;
		}
		String old = names[index];
		names[index] = replace;
		return old;
	}
	
	// returns the index of the string NAME in the array, or -1 if NAME isn't in the array
	// this is a sequential/linear search
	public static int indexOfName(String name)
	{
		for(int i = 0; i < counter; i++)
		{	if(name.equalsIgnoreCase(names[i]))
			{	return i;
			}
		}
		return -1; // rogue value
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
	
	// NOT efficient & counter cannot be used as index of next name to add
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
	
	
	// ============== Main ================
	
	public static void main (String[] args)
	{
		printArray();
		addName("Barry"); printArray();
		addName("Diana"); printArray();
		addName("J'onn"); printArray();
		addName("Bruce"); printArray();
		addName("Clark"); printArray();
		addName("Ray Palmer"); printArray();
		addName("Victor"); printArray();
		addName("Hal"); printArray();
		addName("Gleek"); printArray();
		
		/* input an index, validate it to make sure it has
		 * a name attached to it, then call printAt to
		 * print the contents of that index. */
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("\nINDEX OPERATIONS\n");
		System.out.print("Which INDEX to print? ");
		int index = inputScanner.nextInt();
		while(index < 0 || index >= counter)
		{
			System.out.print("Which INDEX to print? ");
			index = inputScanner.nextInt();
		}
		printAt(index);
		
		// remove last element
		System.out.println("\nRemoved last: " + removeLast() ); printArray();
		
		// remove a specific element @ index 6
		index = 6;
		System.out.println("Removed index " + index + ": " + removeAt(index));
		printArray();
		
		// replace @6 with Arthur; index still = 6
		String another = "Arthur";
		System.out.println("Replacing index " + index + ": " + replace(index, another) + " with " + another);
		printArray();
		
		System.out.print("\nPress Return/Enter to continue.");
		inputScanner.nextLine(); inputScanner.nextLine();
		String replace = "Clark"; String correction = "Kal-El";
		System.out.println("Replacing " + replaceByName(replace, correction) + " with " + correction);
		printArray();
		
		System.out.println("Removing " + removeByName("ray palmer") + " by name");
		printArray();
		
	}
	
	/*
		create a method to find a name (we assume the array has unique names only) and return its index
		
		write/complete the remove and replace methods so that they accept a name instead of an index to be removed and replaced
		
		check the .equalsIgnoreCase() and .compareToIgnoreCase() String methods @
		https://beginnersbook.com/2013/12/java-string-equals-and-equalsignorecase-methods-example/
		https://beginnersbook.com/2013/12/java-string-comparetoignorecase-method-example/
	*/
}

