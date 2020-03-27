// driver, controller, manager classes

public class StackDemo
{
	
	public static void main(String[] args)
	{	//
		Stack stack1 = new Stack();
		stack1.push(7); stack1.print();
		stack1.push(4); stack1.print();
		stack1.push(6); stack1.print();
		stack1.push(5); stack1.print();
		stack1.push(1); stack1.print();
		
		Stack stack2 = new Stack();
		for(int i = 0 ; i < 5; i++)
			System.out.println(stack1.pop());
		stack1.print();
		// dot notation implies the method and its arguments 
		stack2.print();
	}
	
}

