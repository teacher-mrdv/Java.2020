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
	
	public void insert(int n) // insert in order; insert but keeping the linked list sorted in ascending order
	{
		// your code goes here
		Node newNode = new Node();
		newNode.data = n;
		if( isEmpty() )
		{	first = newNode;
			return;
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
		Node current = first; // we use a temp node to avoid popping
		System.out.print( "first -> " );
		while( current != null)
		{	System.out.print( current.data + " -> " );
			current = current.next; // moves the temp pointer (node) to the next element in the Q
		}
		System.out.println("null");
	}
	
	// next lesson: insert (after a specific node/element)
	public void insertAfter(int n, int after)
	{
		if( isEmpty() )
		{	append(n); //System.out.println( "List empty" );
			return;
		}
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
	
	public void insertBefore(int n, int before)
	{
		if( isEmpty() )
		{	append(n); //System.out.println( "List empty" );
			return;
		}
		Node newNode = new Node();
		newNode.data = n;
		if( first.data == before )
		{	newNode.next = first;
			first = newNode;
		} else {
			Node previous = first;
			Node current  = first.next;
			
			while( current.next != null )
			{	if( current.data == before )
				{	break;
				}
				previous = previous.next;
				current = current.next;
			}
			newNode.next  = current;
			previous.next = newNode;
		}
	}
	
}

