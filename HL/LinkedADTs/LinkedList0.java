public class LinkedList0
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

	// insert in order; insert a node, but keeping the linked list sorted in ascending order
	public void insert(int n)
	{
		Node newNode = new Node();
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
			Node previous = first;
			Node current = first.next;
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


	public void insert2(int n)
	{
		Node newNode = new Node();
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
			Node current = first; 
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
		Node current = first;
		while(current.next != null && current.next.data != delete)
		{	current = current.next;
		}
		if(current.next == null)
		{	return false;
		} else {
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
		Node previous = first;
		Node current  = previous.next;
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
		Node current = first; // we use a temp node to avoid popping
		System.out.print( "first -> " );
		while( current != null)
		{
			System.out.print( current.data + " -> " );
			current = current.next; // moves the temp pointer (node) to the next element in the Q
		}
		System.out.println("null");
	}
	
	// next lesson: insert (after a specific node/element)
	public void insertAfter(int n, int after)
	{
		if( isEmpty() )
		{
			append(n); //System.out.println( "List empty" );
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
	
	public static void main(String[] args)
	{
		System.out.println("\nInserting sorted");
		LinkedList0 sorted = new LinkedList0();
		int[] a = { 5,7,3,1,9,2 };
		for(int n : a)
		{	//System.out.println(current);
			sorted.insert(n);
			sorted.print();
		}
	}
	
}

