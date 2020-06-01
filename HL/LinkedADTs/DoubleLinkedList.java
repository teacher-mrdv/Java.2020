public class DoubleLinkedList
{
	DNode first = null; // single pointer ("head") --> saves memory
	
	
	public boolean isEmpty()
	{	return first == null;
	}
	
	public void append(int n)
	{	DNode newNode = new DNode();
		newNode.data = n;
		if( isEmpty() ) // list empty
		{	first = newNode; // add the first element to the list
		} else {		// list not empty
			DNode temp = first;
			while( temp.next != null) // traverse to the last element in the list
			{	temp = temp.next;
			}
			temp.next = newNode;
			newNode.previous = temp;
		}
	}

	public void myInsert(int n)
	{
		DNode newNode = new DNode();
		newNode.data = n;
		if( isEmpty() )		// empty list case
		{
			first = newNode;
			return;
		}
		if( n <= first.data )// new element is smaller than (or equal to) the first element
		{
			newNode.next = first;
			first = newNode;
		} else {			// insert after first element
			DNode previous = first;
			DNode current = first.next;
			while(current != null)
			{
				if(previous.data < n && current.data >= n)
				{
					break;
				} else {
					previous = previous.next;
					current = current.next;
				}
			}
			newNode.next  = current;
			previous.next = newNode;
		}
	}


	public void insert(int n)
	{
		DNode newNode = new DNode(n);
		//newNode.data = n;
		if( isEmpty() )		// empty list case
		{
			first = newNode;
			return;
		}
		if( n <= first.data )// new element is smaller than (or equal to) the first element
		{
			newNode.next = first;
			first = newNode;
		} else {			// insert after first element
			DNode current = first; 
            while (current.next != null && current.next.data <= newNode.data) 
			{
				current = current.next;
			}
            newNode.next = current.next; 
            current.next = newNode;
		}
	}

	public boolean remove1(int delete) // 'next.next' version
	{	if( isEmpty() )
		{	return false;
		}
		if( first.data == delete )
		{	first = first.next;
			return true;
		}
		DNode current = first;
		while(current.next != null && current.next.data != delete) // look for DNode to delete until we get to the last element of the linked list
		{	current = current.next;
		}
		if(current.next == null) // check if we are at the end of the list (delete not found)
		{	return false;
		} else {				// if we are not at the last element of the linked list
			current.next = current.next.next;
			return true;
		}
	}
	
	public boolean remove(int delete)	// neater version with two Nodes/pointers
	{	if( isEmpty() )
		{
			return false;
		}
		if( first.data == delete )
		{
			first = first.next;
			return true;
		}
		// traverse list until we find the item to delete
		DNode previous = first;
		DNode current  = previous.next;
		while(current.next != null && current.data != delete)
		{
			previous = previous.next;
			current  = current.next;
		}
		if(current.next == null)		// element nor found, return false
		{
			return false;
		} else 							// element found, delete it
		{
			previous.next = current.next;
			return true;
		}
	}
	
	public void print()
	{	if( isEmpty() )
		{
			System.out.println( "List empty" );
			return;
		}
		DNode current = first; // we use a temp DNode to avoid popping
		System.out.print( "first -> " );
		while( current != null)
		{
			System.out.print( current.data + " <=> " );
			current = current.next; // moves the temp pointer (DNode) to the next element in the Q
		}
		System.out.println("null");
	}
	
	// next lesson: insert (after a specific DNode/element)
	public void insertAfter(int n, int after)
	{
		if( isEmpty() )
		{
			append(n); //System.out.println( "List empty" );
			return;
		}
		DNode newNode = new DNode();
		newNode.data = n;
		DNode current = first;
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
		DNode newNode = new DNode();
		newNode.data = n;
		if( first.data == before )
		{	newNode.next = first;
			first = newNode;
		} else {
			DNode previous = first;
			DNode current  = first.next;
			
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

/*

*/
