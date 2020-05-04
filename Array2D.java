public class Array2D
{
	public static void print(char[][] a)
	{
		for (int row = 0; row < a.length; row++)
        {
			System.out.print( "row: " + row + " | ");
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print( "col: " + col + " = " + a[row][col] + "   ");
			}
			System.out.println();
        }
        
	}
	
	public static void main (String[] args)
	{
		//char[][] array2d = new char[3][3];
		char[][] array2d = {	{'*', '*', '*' },
								{'*', '*', '*' },
								{'*', '*', '*' }	};
		
		print(array2d);
	}
}

