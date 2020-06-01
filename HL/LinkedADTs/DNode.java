public class DNode
{
	DNode	previous;
	int		data;	// this will contain a number
	DNode	next;  // this is NULL by default

	public DNode() {	}	// empty constructor
	
	public DNode(int n)		// constructor method instantiates (creates) + initialises the node
	{
		previous = null;
		data = n;
		next = null;
	}

}

/*

*/
