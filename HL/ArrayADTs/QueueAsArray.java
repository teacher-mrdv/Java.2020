public class QueueAsArray
{
	public static final int SIZE = 5;
	public static String[] queue = new String[SIZE];
	public static int head = 0;
	public static int tail = 0;
	
	public static boolean isEmpty()
	{
		return tail == 0; // queue[head] == null;
	}
	
	public static boolean isFull()
	{
		return tail == SIZE;
	}
	
	public static void enqueue(String s)
	{
		if( !isFull() )
		{
			queue[tail] = s;
			tail++;
		} else {
			System.out.println("Queue is full. " + s + " not added.");
		}
	}
	
	public static String dequeue()
	{
		if(isEmpty() )
		{
			System.out.println("Error - Queue is empty");
			return null; // ""
		}
		String out = queue[head];
		head++;
		// code below creates a new queue replacing the old
		// one without the dequeued elements
		queue = queueCopy(queue);
		tail = tail - head; // also, tail--;
		head = 0;
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

