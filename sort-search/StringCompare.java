/*
 * This is the RELIABLE way to compare String objects
 * The use of == < > <= >= may cause errors!
 * 
 * EQUALS https://www.w3schools.com/java/ref_string_equals.asp
 * s1.equals(s2) = boolean, true if s1 is the same as s2 (doon't use ==)
 * 
 * COMPARETO https://www.w3schools.com/java/ref_string_compareto.asp
 * it basically does s1 -  s2, lexicographically (think ASCII/Unicode values)
 * s1.compareTo(s2) = integer:	if s1 and s2 are the same, returns 0
 * if s1 > s2, returns a positive int
 * if s1 < s2, returns a negative int
 * 
 * https://www.geeksforgeeks.org/compare-two-strings-in-java/
 * https://www.w3schools.com/java/java_ref_string.asp
 * 
 */
import java.util.Scanner;

public class StringCompare
{
	
	public static void main (String[] args)
	{
		String s1, s2;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("Input first string: ");
			s1 = in.nextLine();
			System.out.print("Input second string: ");
			s2 = in.nextLine();
			System.out.println("s1 = " + s1 + "\ts2 = " + s2);
			System.out.println("s1.equals(s2) = " + s1.equals(s2));
			System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
			System.out.println("s2.compareTo(s1) = " + s2.compareTo(s1));
			System.out.println("s2.compareTo(s2) = " + s2.compareTo(s2));
			
			if(s1.compareTo(s2) > 0)
			{	System.out.println("s1 = " + s1 + " is greater/comes after s2 = " + s2);
			} else if(s1.compareTo(s2) < 0)
			{	System.out.println("s1 = " + s1 + " is less than/comes before s2 = " + s2);
			} else {
				System.out.println("s1 = " + s1 + " and \ts2 = " + s2 + " are the same");
			}
		} while(!s1.equals(s2));
		System.out.println("\nbye bye");
	}
	
	/* For CASE INSENSITIVE comparisons, use:
	 * s1.equalsIgnoreCase(s2)
	 * s1.compareToIgnoreCase(s2)
	 */
}

