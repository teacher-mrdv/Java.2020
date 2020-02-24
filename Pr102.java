/*
 * Binary to denary simple conversion program
 * example to help you solve problem 10.2
 * by teacher Marcos
 * Jan. 2020
 */
 
public class Pr102
{
	
	public static void main (String[] args)
	{
		String binary = IBIO.input("Enter binary number: ");
		char[] bin = binary.toCharArray();
		int sum = 0;
		System.out.println(binary.length());
		System.out.println(bin.length);
		for(int i = 0; i < bin.length; i++)
		{
			sum = sum * 2;
			if (bin[i] == '1') sum++;
		}
		System.out.println(sum);
	}
}

