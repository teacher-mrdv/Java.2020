public class Array2DHW1
{
	public static void printDetail(char[][] a)
	{
		int rowLength = a.length;	// number of rows
		for (int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			System.out.print( "row: " + row + " | ");
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( "col: " + col + " = " + a[row][col] + "   ");
			}
			System.out.println();
        }

	}
	
	/* complete this method so it prints our 2D char array in the following format:
		1 | 2 | 3
		---------
		4 | 5 | 6
		---------
		7 | 8 | 9
		
		1|2|3|4|5
		---------
		numbers are for reference only
	*/
	public static void print(char[][] a)
	{
		int rowLength = a.length;	// number of rows
		for (int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( a[row][col] );
				if(col < columnLength-1)
				{	System.out.print("|");
				}
			}
			System.out.println();
			if(row < rowLength-1)
			{	for(int i = 0; i < columnLength*2-1; i++)
				{	System.out.print("-");
				}
			}
			System.out.println();
        }
	}
	
	public static void main(String[] args)
	{	/* declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
		//char[][] board = new char[3][3];
		char[][] board= {	{ '1', '2', '3' },
							{ '4', '5', '6' },
							{ '7', '8', '9' }
						};
		
		printDetail(board);
		System.out.println();
		print(board);
		
		char[][] board2= {	{ '1', '2', '3', '4', '5' },
							{ '6', '7', '8', '9', 'A' },
							{ 'B', 'C', 'D', 'E', 'F' },
							{ 'G', 'H', 'I', 'J', 'K' },
						};
		
		printDetail(board2);
		System.out.println();
		print(board2);
		
		char[][] b2 = { {'a', 'b'}, {'c', 'd'} };
		print(b2);
	}
}

