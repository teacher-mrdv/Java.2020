/* 
 * Tic Tac Toe prototype class
 * work in progress, code as of 19 May 2020
 *
 * This problem is somewhat related to the magic squares problem, for more information
 * about magic square, check https://en.wikipedia.org/wiki/Magic_square
 *
 */


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

	public static boolean printRow(char[][] board, int row)
	{
		if( board == null )
		{
			return false;
		}
		row = Math.abs(row);
		row = row % board.length;
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
		return true;
	}
	
	public static void printColumn(char[][] board, int col)
	{
		if( board == null )
		{
			return;
		}
		col = Math.abs(col);
		col = col % board[0].length;
		for(int row = 0; row < board.length; row++)
		{
			System.out.println( board[row][col] );
		}
		System.out.println( );
	}
	
	public static void printDiagonal1(char[][] board)
	{
		for(int i = 0; i < board.length; i++)
		{	System.out.print( board[i][i] + " ");
		}
	}
	
	// 0 1 2 3 4 .. n
	// n .. 4 3 2 1 0
	public static void printDiagonal2(char[][] board)
	{
		int len = board.length-1;// -1 to match the largest INDEX in the array because indices start from 0
		for(int i = 0; i < board.length; i++)
		{	System.out.print( board[i][len-i] + " ");
		}
	}


	public static void main(String[] args)
	{	/* declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
		//char[][] board = new char[3][3];		// 0 2  1 1  2 0
		char[][] board= {	{ '1', '2', '3' },
							{ '4', '5', '6' },
							{ '7', '8', '9' }
						};
		
		printBoard(board);
		System.out.println();					// 0 4	
		//					   0    1    2    3    4	length=5
		char[][] board2= {	{ '1', '2', '3', '4', '5' },
							{ '6', '7', '8', '9', 'A' },
							{ 'B', 'C', 'D', 'E', 'F' },
							{ 'G', 'H', 'I', 'J', 'K' },
							{ 'L', 'M', 'N', 'O', 'P' },
						};
		
		printBoard(board2);
		System.out.println();
		
		System.out.println("\nPrinting rows 3 & 9");
		System.out.println( printRow(board2, 3) );
		System.out.println( printRow(board2, 9) );
	
		System.out.println("\nPrinting columns 5 & 9");
		printColumn(board2, 5);
		printColumn(board2, 9);

		System.out.println("\nPrinting Diagonal 1");
		printDiagonal1(board);
		System.out.println();
		printDiagonal1(board2);
		
		System.out.println("\nPrinting Diagonal 2");
		printDiagonal2(board);
		System.out.println();
		printDiagonal2(board2);
	}
}

