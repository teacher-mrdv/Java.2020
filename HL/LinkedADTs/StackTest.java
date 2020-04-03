/* 
 * StackTest --> we use this class to test our Stack class
 * driver, controller, manager classes
 * dot notation implies the method and its arguments act upon/interact with
 * the object before the .
 * this is part of the OOP notation/syntax that we will study in more detail in SL
 */

import java.util.*;

public class StackTest
{
	
	public static void main(String[] args)
	{	
		Stack stack1 = new Stack();
		Scanner input = new Scanner(System.in);
		int n;
		do
		{	System.out.println("Enter an int, 0 stops: ");
			n = input.nextInt();
			if(n != 0)
			{	stack1.push(n); stack1.print();
			}
		} while(n != 0);
		stack1.print();
		
		Stack stack2 = new Stack();
		while( !stack1.isEmpty() )
		{	stack2.push( stack1.pop() );
		}
		
		System.out.println("Top of the stack is: " + stack1.peek() + "\n");
		System.out.println("Top of the stack is: " + stack2.peek() + "\n");
		stack2.print();
		//System.out.println("\n\n" + stack2.top.data);
	}
	
}

