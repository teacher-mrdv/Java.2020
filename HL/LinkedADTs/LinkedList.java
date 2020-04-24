public class LinkedList
{
	Node first = null; // single pointer ("head") --> saves memory
	
	public boolean isEmpty()
	{	return first == null;
	}
	
	public void append(int n)
	{	Node newNode = new Node();
		newNode.data = n;
		if( isEmpty() ) // list empty
		{	first = newNode; // add the first element to the list
		} else {		// list not empty
			Node temp = first;
			while( temp.next != null) // traverse to the last element in the list
			{	temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public boolean remove1(int delete)
	{	if( isEmpty() )
		{	return false;
		}
		if( first.data == delete )
		{	first = first.next;
			return true;
		}
		Node temp = first;
		while(temp.next.data != delete)
		{	temp = temp.next;
		}
		temp.next = temp.next.next;
		return true;
	}
	
	public boolean remove(int delete)
	{	if( isEmpty() )
		{	return false;
		}
		if( first.data == delete )
		{	first = first.next;
			return true;
		}
		Node temp1 = first;
		Node temp2 = temp1.next;
		while(temp2.data != delete)
		{	temp1 = temp1.next;
			temp2 = temp2.next;
		}
		temp1.next = temp2.next;
		return true;
	}
	
	public void print()
	{	if( isEmpty() )
		{	System.out.println( "List empty" );
			return;
		}
		Node temp = first; // we use a temp node to avoid popping
		System.out.print( "first -> " );
		while( temp != null)
		{	System.out.print( temp.data + " -> " );
			temp = temp.next; // moves the temp pointer (node) to the next element in the Q
		}
		System.out.println("null");
	}
	
	// next lesson: insert (after a specific node/element)
	public void insertAfter(int n, int after)
	{
		Node newNode = new Node();
		newNode.data = n;
		Node current = first;
		while( current.next != null )
		{	if( current.data == after )
			{	break;
			}
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	
	/* Homework:
	 * create a linked list test class (i.e. LinkedListTest.java)
	 * append, remove and insert items (and print the linked list to see the changes).
	 * Look at the QueueTest class for examples.
	 * 
	 * extra challenge: code an test insertBefore method ;)
	 */
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		int[] a = { 0, 5, 7, 3, 1, 8, 2 };
		for( int n : a )
		{	l.append(n);
			l.print();
		}
		l.insertAfter(15, 5); l.print();
		l.insertAfter(12, 2); l.print();
		l.insertAfter(13, 3); l.print();
		l.remove(0) ; l.print();
		l.remove(15); l.print();
		l.remove(13); l.print();
		l.remove(12); l.print();
		
	}
}

