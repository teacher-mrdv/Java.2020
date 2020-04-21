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
		{	System.out.print( temp.data + " <- " );
			temp = temp.next; // moves the temp pointer (node) to the next element in the Q
		}
		System.out.println();
	}
	
	// next lesson: insert (after a specific node/element)
	
	// HW: create a LinkedListTest class to test
	// create a linked list, append and remove items. Look at the QueueTest class for examples. 

}

