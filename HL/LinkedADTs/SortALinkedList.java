// Sorting a linked list, using a BST
public class SortALinkedList
{
	static LinkedList<Integer> sorted = new LinkedList<>();
	
	private static void inOrder(BNode node)
	{
		if (node.left != null)		// node.getLeft() in pseudocode
			inOrder(node.left);		
		sorted.add(node.data);		// node.getData() in pseudocode
		if (node.right != null)
			inOrder(node.right);	// node.getRight() in pseudocode
	}	
	
	public static void main(String[] args)
	{
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(7); llist.add(4); llist.add(2); llist.add(5);
		llist.add(1); llist.add(9); llist.add(6); llist.add(3);
		System.out.println("Linked list: " + llist + "\n");
		Iterator<Integer> list = llist.iterator(); // this is just so that we can use .hasNext() and .netxt() [getNetxt() Java equivalent]
		// list.resetNext() // pseudocode only
		BSTree bst = new BSTree( list.next() ); // list.getNext() in pseudocode
		while( list.hasNext() )
		{
			bst.add( list.next() ); // list.getNext() in pseudocode
		}
		inOrder(bst.root);	// node.getRoot() in pseudocode
		System.out.println("\nSorted linked list: " + sorted);
	}
}

