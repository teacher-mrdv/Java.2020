
public class Queue
{
	Node head = null;
	Node tail = null;
	
	public boolean isEmpty()
	{	return head == null; // && tail == null;
	}
	
	public void enqueue(int d)
	{	Node newNode = new Node();
		newNode.data = d;
		if( isEmpty() ) // empty queue
		{	head = newNode;
			tail = head;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int dequeue()
	{	if( isEmpty() )
		{	System.out.println( "Queue empty" );
			return 0; // rogue value
		}
		int save = head.data;
		head = head.next;
		if( head==null )
		{	tail=null; // for thorough cleanup, optional
		}
		return save;
	}
	
	public void print()
	{	if( isEmpty() )
		{	System.out.println( "Queue empty" );
			return;
		}
		Node temp = head; // we use a temp node to avoid popping
		System.out.print( "Head -> " );
		while( temp != null)
		{	System.out.print( temp.data + " <- " );
			temp = temp.next; // moves the temp pointer (node) to the next element in the Q
		}
		System.out.println( " Tail" );
	}
	
}

