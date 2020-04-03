public class QueueTest
{
	
	public static void main (String[] args)
	{	// declaring and instantiating (creating an empty queue)
		Queue q1 		 = new Queue();
		q1.enqueue(1); q1.print();
		q1.enqueue(3); q1.print();
		q1.enqueue(4); q1.print();
		q1.enqueue(7); q1.print();
		
		while(!q1.isEmpty())
		{	System.out.println( q1.dequeue() );
			q1.print();
		}
		System.out.println( "\n\n" );
		System.out.println( q1.tail.data );
		
	}
}

