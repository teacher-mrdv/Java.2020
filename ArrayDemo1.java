public class ArrayDemo1
{
	public static final int SIZE = 5;
	
	public static void main (String[] args)
	{	
		
		String[] names = new String[SIZE];
		int[] numbers  = new int[SIZE];
		
		System.out.println("\nArrays in their initial state.\nNames:");
		for(int j =0; j < names.length; j++)
		{	System.out.println("index: " + j + " -> " + names[j]);
		}
			
		for(int j =0; j < numbers.length; j++)
		{	System.out.println("index: " + j + " -> " + numbers[j]);
		}
		/* direct initialisation of arrays - sometimes useful
		String[] names = { "Uno", "Dos", "Tres" } ;
		int[] numbers  = { 4, 6, 9, 12 };
		*/
		// We can't print arrays with IBIO.out(put)
		// Printing "the whole array" in Java doesn't make sense
		System.out.println(names);
		System.out.println(numbers);
		
		System.out.println("\nPopulating arrays");
		for(int i = 0; i < names.length; i++)
		{	
			names[i] = IBIO.input("Enter name # " + (i+1) + " : ");
		}
		System.out.println();
		for(int i = 0; i < numbers.length; i++)
		{	numbers[i] = IBIO.inputInt("Enter a number : ");
		}
		
		System.out.println("\nTraversing arrays and displaying contents\nNames:");
		for(int j =0; j < names.length; j++)
		{	System.out.println("index: " + j + " -> " + names[j]);
		}
		System.out.println("\nNumbers:");
		for(int j =0; j < numbers.length; j++)
		{	System.out.println("index: " + j + " -> " + numbers[j]);
		}
		
		System.out.println("\nDisplaying contents of both arrays with a single natural counter");
		int i = 0;
		for(int j = 0; j < names.length; j++)
		{	i = j;
			i++;
			System.out.println(i + "  : " + names[j]);
		}
		
		for(int k = 0; k < numbers.length; k++)
		{	
			i++;
			if(i < 10)
			{	System.out.println(i + "  : " + numbers[k]);
			}
			else
			{	System.out.println(i + " : " + numbers[k]);
			}
		}
		System.out.println("\nFirst name: " + names[0]);
		System.out.println("Last  name: " + names[names.length-1]);
		
	}
}

