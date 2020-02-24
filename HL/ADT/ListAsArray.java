public class ListAsArray
{
	public static final int SIZE = 5;
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
		{	queue[end] = s;
			end++;
			return true;
		} else {
			return false;
		}
	}
	
	public static String remove(int index)
	{	// list.length or SIZE
		if( isEmpty() || index < 0 || index >= list.length )
		{	return null; // ""
		}
		String out = list[index];
		int i;
		for(i = index; i < list.length - 1; i++)
		{	list[i] = list[i+1];
		}
		end--;
		list[i+1] = null;
		// end of additional code to clean up the queue
		return out;
	}
	
	public static void clearQueue()
	{
		head = 0; // queue[head] = null;
		tail = 0; // queue[tail] = null;
	}
	
	public static void printQueue()
	{
		printArray(); // optional; comment this line out when no longer needed.
		if( !isEmpty() )
		{
			System.out.print("Head -> ");
			for(int i = head; i < tail; i++)
			{	System.out.print(queue[i] + " <- ");
			}
			System.out.println("Tail");
		} else {
			System.out.println("Queue empty");
		}
		System.out.println();
	}
	
	// copies the previous queue into a new queue
	// skipping any dequeued element
	public static String[] queueCopy(String[] original)
	{
		int qi = 0;
		String[] queueCopy = new String[SIZE];
		for(int i = head; i < tail; i++)
		{
			queueCopy[qi] = queue[i];
			qi++;
		}
		return queueCopy;
	}
	
	// prints values of head, tail, whole array contents 
	public static void printArray() 
	{	// for debugging/showing inner queue status
		System.out.printf("HEAD = %d ~ TAIL = %d ", head, tail);
		for(int i = 0; i < queue.length; i++)
		{	System.out.printf("| %d:%s ",i , queue[i]);
		}
		System.out.println();
	} // for more information about printf: https://alvinalexander.com/programming/printf-format-cheat-sheet
	
	
	
	public static void main (String[] args)
	{
		// test the queue just like we did the stack previously
		System.out.println("\nQUEUE SIMULATED WITH ARRAY\n");
		printQueue();
		enqueue("Yana"); printQueue();
		enqueue("Kevin"); printQueue();
		enqueue("Harish"); printQueue();
		enqueue("Andrew"); printQueue();
		enqueue("Reon"); printQueue();
		enqueue("Albus"); printQueue();
		System.out.println(dequeue() + " dequeued."); printQueue();
		enqueue("John"); printQueue();
		System.out.println(dequeue() + " dequeued."); printQueue();
		
		// play with the queue until you understand how it works! add, remove, and modify enqueue and dequeue method calls. Just remember to call printQueue after each enQ/deQ so that you can see how the array, head, tail and Q change
	}
}

