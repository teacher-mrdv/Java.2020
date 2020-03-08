public class ListAsArray
{
	public static final int SIZE = 10;
	public static String[] list = new String[SIZE];
	public static int end = 0;
	
	public static boolean isEmpty()
	{	return end == 0; // queue[head] == null;
	}
	
	public static boolean isFull()
	{	return end == list.length;
	}
	
	// return true if append is successful; false otherwise
	public static boolean append(String s)
	{	if( !isFull() )
		{	list[end] = s;
			end++;
			return true;
		} else {
			return false;
		}
	}
	
	public static String remove(int index)
	{	// list.length or SIZE
		if( isEmpty() || index < 0 || index >= list.length )
		{	return null;
		}
		String out = list[index];
		if(index == list.length-1)	// check if removing last element
		{	list[index] = null;		// because it's the easiest to do
		} else {	// otherwise, move all elements after index to remove 1 slot up
			int i;
			for(i = index; i < list.length-1; i++)
			{	list[i] = list[i+1];
			}
			list[i] = null;
			// end of additional code to clean up the queue
		}
		end--;
		return out;
	}
	
	public static void clearList()
	{
		end = 0;
	}
	
	public static void printList()
	{
		printArray(); // optional; comment this line out when no longer needed.
		if( !isEmpty() )
		{
			for(int i = 0; i < end; i++)
			{	System.out.println(i + " : " + list[i]);
			}
			System.out.println("< end >");
		} else {
			System.out.println("List empty");
		}
		System.out.println();
	}
	
	/******* HOMEWORK ******************************************************/
	// create an insert method: isFull? is index==null? copy down & insert
	// return true if the insertion was successful, false otherwise
	public static boolean insert(String s)
	{	// replace and add your code here
		return false;
	}
	/******* HOMEWORK ******************************************************/
	
	// prints end + whole array contents 
	public static void printArray() 
	{	// for debugging/showing inner queue status
		System.out.printf("END = %d ", end);
		for(int i = 0; i < list.length; i++)
		{	System.out.printf("| %d:%s ",i , list[i]);
		}
		System.out.println();
	} // for more information about printf: https://alvinalexander.com/programming/printf-format-cheat-sheet
	
	
	
	public static void main (String[] args)
	{
		System.out.println("\nLIST SIMULATED WITH ARRAY\n");
		printList();
		append("Anakin"); printList();
		append("Lilith"); printList();
		append("Padme"); printList();
		append("Ben"); printList();
		append("Yoda"); printList();
		String extra = "Adam";
		if(append(extra))
		{	printList();
		} else {
			System.out.printf("Error appending %s to list\n", extra);
		}
		if(remove(5) == null)
		{	System.out.println("Removal (5) unsuccessful");
		} else {
			printList();
		}
		System.out.println("\nRemoving index 4");
		remove(4); printList();
		append("Leia"); printList();
		System.out.println("Removing index 1");
		remove(1); printList();
		append("Lando"); printList();
		
		/*** HW *** play with the list until you understand how it works!
		 * append, remove, and insert elements. Just remember to call printList()
		 * after each operation so that you can see how the array (list) changes.
		 * Finally, add 3 calls to the insert method:
		 * 		insert names at indices 0, 3 and 9.
		 * Correct any errors you find as you test this code.
		 ***/
	}
}

