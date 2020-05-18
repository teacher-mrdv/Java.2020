public class TicTacToe
{
	
	public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
	{
		int rowLength = a.length;	// number of rows
		for(int row = 0; row < rowLength; row++)
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
/*		
		System.out.println("\nPrinting rows 4 & 9");
		printRow(board2, 4);
		printRow(board2, 9);
		
		System.out.println("\nPrinting columns 5 & 9");
		printColumn(board2, 5);
		printColumn(board2, 9);
*/
	}
}

