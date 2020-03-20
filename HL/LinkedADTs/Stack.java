public class Stack
{
	Node top = null;
	
	public boolean isEmpty()
	{	return top == null;
	}
	
	public void push(int d)
	{	Node newNode = new Node();
		newNode.data = d;
		if(isEmpty())
		{	top = newNode;
		}
	

}

