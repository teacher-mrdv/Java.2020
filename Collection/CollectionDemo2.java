import java.util.*;

public class CollectionDemo2
{
	
	public static void main (String[] args)
	{
		Collection list = new Collection();
		int[] numbers = { 1,2,3,4,5,6,7,8,9,10,11,12 };
		System.out.println( Arrays.toString(numbers) );
		for(int i = 0; i < numbers.length; i++)
		{	if(numbers[i] % 3 == 0)
			{	list.addItem(numbers[i]+"" );
			}
		}
		list.resetNext();
		while(list.hasNext())
		{
			System.out.print(list.getNext() + " ");
		}
	}
}

