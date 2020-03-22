import java.util.*;

public class CollectionDemo
{
	
	public static void main (String[] args)
	{
		Collection list = new Collection();
		list.addItem("Joe");
		list.addItem("Adam");
		list.addItem("James");
		list.addItem("Bob");
		System.out.println("Collections SL Demo");
		System.out.println(list + "\n");
		
		list.resetNext();
		int size = 0;
		
		while( list.hasNext() )
		{	System.out.println( list.getNext() );
			size++;
		}
		System.out.println(size);
		String[] names = new String[size];
		list.resetNext();
		for(int i = 0; i < size; i++)
		{	names[i] = list.getNext();
		}
		System.out.println("Collection to array");
		System.out.println( Arrays.toString(names) );
	}
}

