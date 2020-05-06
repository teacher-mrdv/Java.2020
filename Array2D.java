public class Array2D
{
	public static void printDetail(char[][] a)
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
	
	public static void print(char[][] a)
	{
		for (int row = 0; row < a.length; row++)
        {
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + "|");
			}
			System.out.println("\n------");
        }
        
	}
	
	public static void main(String[] args)
	{	/* declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
		//char[][] array2d = new char[3][3];
		char[][] array2d = {	{ '*', '*', '*' },
								{ '*', '*', '*' },
								{ '*', '*', '*' }	};
		
		printDetail(array2d);
		System.out.println();
		print(array2d);
	}
}

