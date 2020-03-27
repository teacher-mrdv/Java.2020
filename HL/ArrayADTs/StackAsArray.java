public class StackAsArray
{
	public static final int SIZE = 5;
	public static int[] stack = new int[SIZE];
	public static int top = 0;
	
	public static boolean isEmpty()
	{
		/*
		boolean result;
		if(top == 0)
		{	System.out.println("Stack is empty");
			result = true;
		} else
		{	System.out.println("Stack is NOT empty");
			result = false;
		}
		return result;
		*/
		// or, in short:
		return top == 0;
	}
	
	public static boolean isFull()
	{
		return top == SIZE;
	}
	
	public static void push(int x)
	{
		if( isFull() )
		{	System.out.println("Cannot push " + x + ", stack is full");
		} else {
			stack[top] = x;
			top++;
		}
	}
	
	public static int pop()
	{
		int p = 0;
		if( isEmpty() )
		{	System.out.println("Cannot pop-stack empty");
		} else {
			top--;
			p = stack[top];
		}
		return p;
	}
	
	public static void printStack()
	{
		for(int i = 0; i < top; i++)
		{
			System.out.print( stack[i] + " <- " );
		}
		System.out.println("TOP");
	}
	
	/* modify printStack() so that it prints the stack
	 * vertically instead of horizontally
	 * TOP
	 * 4
	 * 7
	 * 11
	 * 12
	 * 9
	 */
	
	public static void main (String[] args)
	{
		System.out.println( isEmpty() );
		push(9);
		printStack();
		push(12);
		printStack();
		push(11);
		printStack();
		push(7);
		printStack();
		push(4);
		printStack();
		push(1);
		printStack();
		
		System.out.println();
		for(int i = 0; i <= SIZE; i++)
		{
			System.out.println( "Popping: " + pop() );
			printStack();
		}
	}
}

