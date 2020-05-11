public class LinkedListTest
{
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
		System.out.println("Appending---");
		for( int n : a )
		{
			System.out.printf("%d ", n);
			l.append(n);
			l.print();
		}
		System.out.println("\nInserting after---");
		System.out.println("Inserting 15 after 5");
		l.insertAfter(15, 5); l.print();
		System.out.println("Inserting 12 after 2");
		l.insertAfter(12, 2); l.print();
		System.out.println("Inserting 13 after 3");
		l.insertAfter(13, 3); l.print();
		System.out.println("Removing 0, 15, 13, 12, 99"); // for 99, nothing should happen, remove1 returns false
		l.remove1(0) ; l.print();
		l.remove1(15); l.print();
		l.remove1(13); l.print();
		l.remove1(12); l.print();
		System.out.println( l.remove1(99) ); l.print();
		System.out.println("Inserting before---");
		System.out.println("Inserting 0 before 5");
		l.insertBefore(0, 5);  l.print();
		System.out.println("Inserting 33 before 3");
		l.insertBefore(33, 3); l.print();
		System.out.println("Inserting 22 before 2");
		l.insertBefore(22, 2); l.print();
		System.out.println("Removing 0, 33, 22, 99"); // for 99, nothing should happen, remove returns false
		l.remove(0) ; l.print();
		l.remove(33); l.print();
		l.remove(22); l.print();
		System.out.println( l.remove(99) ); l.print();
		
		System.out.println("\nInserting sorted");
		LinkedList sorted = new LinkedList();
		Node current = l.first;
		l.print();
		while( current != null )
		{	//System.out.println(current);
			sorted.insert(current.data);
			sorted.print();
			current = current.next;
		}
		System.out.println("bye bye");
	}

}

