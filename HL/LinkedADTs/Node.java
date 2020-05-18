public class Node
{
	int		data;	// this will contain a number
	Node	next;  // this is NULL by default

	public Node() {	}	// empty constructor
	
	public Node(int n)	// constructor method instantiates (creates) + initialising the node
	{
		data = n;
		next = null;
	}

}

