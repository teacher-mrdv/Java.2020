/*
 * Stack
 * (base class) - no main method to keep it clean
 * the purpose of base/entity classes is to DEFINE an <object>
 * here, we define what a Stack IS (a Node called top)
 * and what a Stack can do (push, pop, isEmpty, print)
 * 
 */

public class Stack
{
	Node top = null; // top.data = unused; top to refer to/point at the top of the stack
					// top.next  = refers to/points to the node after the top node
	
	public boolean isEmpty()
	{	return top == null;
	}
	
	public void push(int d)
	{	Node newNode = new Node();
		newNode.data = d;
		if( isEmpty() )
		{	top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public int pop()
	{	if(isEmpty())
		{	System.out.println( "Stack empty" );
			return 0; // rogue value
		}
		int e	= top.data; // save data to return it later
		top		= top.next; // move the top to the next node in the stack
		return e;
	}
	
	public int peek()
	{	if(isEmpty())
		{	System.out.println("Stack empty");
			return 0;
		}
		return top.data;
	}
	
	public void print()
	{	Node temp = top; // we use a temp node to avoid popping
		System.out.println( "Top" );
		while( temp != null)
		{	System.out.println( "   " + temp.data );
			temp = temp.next;
		}
		System.out.println( );
	}
	

}

