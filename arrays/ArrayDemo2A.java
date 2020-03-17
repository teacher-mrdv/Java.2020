public class ArrayDemo2A
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
	
	// Try System.out.println(names); it doesn't work as expected! IBIO.output(names) is even worse
	// to print an array, we have to traverse it (go though each element) and print it:
	public static void printArray()
	{	if( isEmpty() )
		{	System.out.println("Array empty");
		} else {
		// print in format [INDEX: Name] | ...
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
		}
		/* initial version of our printArray:
		for(String s : names) // enhanced for loop
		{	System.out.println(s); // print each element, including nulls, which we don't want
		}
		*/
	}
	
	// prints ONE element of the array, the one at the given index
	public static void printAt(int index)
	{
		if(index < 0 || index >= SIZE)
		{
			System.out.println("Error-index outside limits");
		} else {
			System.out.println(names[index]);
		}
	}
	
	// remove the last element from the array
	public static String removeLast()
	{
		counter--;
		String removed = names[counter];
		names[counter] = null; // optional
		return removed;
	}
	

	
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
		int index = IBIO.inputInt("Which INDEX to print? ");
		while(index < 0 || index >= counter)
		{
			index = IBIO.inputInt("ERROR-Which index to print? ");
		}
		printAt(index);
		
		// remove last element
		System.out.println("\nRemoved last: " + removeLast() );
		printArray();
		
		
		
	}

}

