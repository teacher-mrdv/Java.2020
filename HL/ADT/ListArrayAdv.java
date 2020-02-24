/*
 * Simulation of a (linked) list using arrays - full version
 * mdv 2019
 */
public class ListArrayAdv
{
	public static char[] list = new char[1]; // !!!
	public static int end = 0; // to keep track of the end of the list
	
	public static boolean isEmpty()
	{	return end == 0;
	}
	
	public static boolean isFull()
	{	return end == list.length;
	}
	
	public static void append(char element)
	{
		if(isFull() == true)
		{	char[] newList = new char[list.length+1];
			for(int i = 0; i < end; i++)
			{	newList[i] = list[i];
			}
			newList[end] = element;
			list = newList;
		} else {
			list[end] = element;
		}
		end++;
	}
	
	public static int indexOf(char element)
	{
		for(int i = 0; i < list.length; i++)
		{
			if(element == list[i])
			{	return i;
			}
		}
		return -1;
	}

	public static void printList()
	{
		for(int i = 0; i < end; i++)
		{	System.out.printf("%2d : %c", i, list[i]);
			if(i == end-1)
			{	System.out.println(" <-- END");
			} else {
				System.out.println();
			}
		}
	}
	
	// converts list to a String
	public static String listToString()
	{	String output = "";
		if(list != null)
		{	for(int i = 0; i < end; i++)
			{	output = output + list[i];
			}
		}
		return output;
	}

	public static boolean replace(int index, char repl)
	{
		if(index < 0 || index > list.length)
		{	return false;
		} else {
			list[index] = repl;
			return true;
		}
	}

	public static int replace(char orig, char repl)
	{	int count = 0; // count replacements made
		int index = indexOf(orig); // check if char to replace is in list or not
		if(index != -1)
		{	for(int i = index; i < end; i++)
			{	if(list[i] == orig)
				{	list[i] = repl;
					count++;
				}
			}
		}
		return count;
	}

	public static int remove(char element)
	{	int count = 0;
		int remove;
		do
		{	remove = indexOf(element);
			if(remove == -1)
			{	break; // or return 0;
			}
			if(remove == end-1) // special case: removing the end of the list
			{	count++;
				end--;
				break;
			}
			for(int i = remove; i < end-1; i++)
			{	list[i] = list[i+1];
			}
			end--;
			count++;
		} while(remove != -1);
		resize(); // if count>0
		return count;  // success
	}
	
	// create a method to remove directly by INDEX
	public static boolean remove(int index)
	{
		if(index < 0)
		{	return false;
		} else 	if(index >= end) // special case: removing the end of the list
		{	end--;
		} else {
			for(int i = index; i < end-1; i++)
			{	list[i] = list[i+1];
			}
			end--;
		}
		resize();
		return true;  // success
	}
	
	public static void resize()
	{	char[] newList = new char[end];
		for(int i = 0; i < end; i++)
		{	newList[i] = list[i];
		}
		list = newList;
	}
	
	// create a method to insert an element AT an index of the list
	public static void insert(char element, int position)
	{
		char[] newList = new char[list.length+1];
		int index = 0;
		for(int i = 0; i < end; i++)
		{	char temp = list[i];
			if(position == i)
			{	newList[index] = element;
				index++;
			}
			newList[index] = temp;
			index++;
		}
		if(position >= end)
		{	newList[end] = element;
		}
		list = newList;
		end++;
	}

	
	public static void main (String[] args)
	{
		System.out.println("\nappend('*'):");
		append('*');	printList();
		System.out.println("\nappend('+'):");
		append('+');	printList();
		System.out.println("\nappend('a'):");
		append('a');	printList();
		System.out.println("\nappend('r'):");
		append('r');	printList();
		System.out.println("\nappend('t'):");
		append('t');	printList();
		System.out.println("\nappend('p'):");
		append('p');	printList();
		System.out.println("\nappend('a'):");
		append('a');	printList();
		System.out.println("\nappend('l'):");
		append('l');	printList();
		System.out.println("\nappend('e'):");
		append('e');	printList();
		System.out.println("\nList length = " + list.length);
		System.out.println("List to String: " + listToString() );
		System.out.println("\nremove('*'):" + remove('*'));
		printList();
		System.out.println("\ninsert('D', 0):");
		insert('D', 0);	printList();
		System.out.println("\ninsert('r', 9):");
		insert('r', 9);	printList();
		System.out.println("\ninsert('h', 5):");
		insert('h', 5);	printList();
		System.out.println("\ninsert('~', 6):");
		insert('~', 6);	printList();
		System.out.println("\ninsert('V', 7):");
		insert('V', 7);	printList();
		System.out.println("\nreplace(8, 'a'):" + replace(8, 'a'));
		printList();
		System.out.println("\nreplace(9, 'd'):" + replace(9, 'd'));
		printList();
		System.out.println("\nremove(10):" + remove(10));
		printList();
		System.out.println("\ninsert('+', 99):");
		insert('+', 99);	printList();
		System.out.println("List length = " + list.length);
		System.out.println("\nremove('+'):" + remove('+'));
		printList();
		System.out.println("\nappend('#'):");
		append('#');	printList();
		System.out.println("\nremove(end):" + remove(end));
		printList();
		System.out.println("\nList length = " + list.length);
		System.out.println("List to String: " + listToString() );
	}
}
/*

append('*'):
 0 : * <-- END

append('+'):
 0 : *
 1 : + <-- END

append('a'):
 0 : *
 1 : +
 2 : a <-- END

append('r'):
 0 : *
 1 : +
 2 : a
 3 : r <-- END

append('t'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t <-- END

append('p'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p <-- END

append('a'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a <-- END

append('l'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l <-- END

append('e'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l
 8 : e <-- END

List length = 9
List to String: *+artpale

remove('*'):1
 0 : +
 1 : a
 2 : r
 3 : t
 4 : p
 5 : a
 6 : l
 7 : e <-- END

insert('D', 0):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l
 8 : e <-- END

insert('r', 9):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l
 8 : e
 9 : r <-- END

insert('h', 5):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : p
 7 : a
 8 : l
 9 : e
10 : r <-- END

insert('~', 6):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : p
 8 : a
 9 : l
10 : e
11 : r <-- END

insert('V', 7):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : p
 9 : a
10 : l
11 : e
12 : r <-- END

replace(8, 'a'):true
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : a
10 : l
11 : e
12 : r <-- END

replace(9, 'd'):true
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : d
10 : l
11 : e
12 : r <-- END

remove(10):true
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : d
10 : e
11 : r <-- END

insert('+', 99):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : d
10 : e
11 : r
12 : + <-- END
List length = 13

remove('+'):2
 0 : D
 1 : a
 2 : r
 3 : t
 4 : h
 5 : ~
 6 : V
 7 : a
 8 : d
 9 : e
10 : r <-- END

append('#'):
 0 : D
 1 : a
 2 : r
 3 : t
 4 : h
 5 : ~
 6 : V
 7 : a
 8 : d
 9 : e
10 : r
11 : # <-- END

remove(end):true
 0 : D
 1 : a
 2 : r
 3 : t
 4 : h
 5 : ~
 6 : V
 7 : a
 8 : d
 9 : e
10 : r <-- END

List length = 11
List to String: Darth~Vader


*/
