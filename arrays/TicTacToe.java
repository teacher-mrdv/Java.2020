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

	public static void printRow(char[][] board, int row)
	{
		if( board == null )
		{
			return;
		}
		row = Math.abs(row);		// |x|; if( row < 0 ) row = row * -1;
		row = row % board.length;	// % modulo;  allows roll over of values
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
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
		for(int d = 0; d < board.length; d++)
		{	System.out.println( board[d][d] );
		}
	}
	
	
	
	// 0 1 2 3 4 .. n
	// n .. 4 3 2 1 0
	public static void printDiagonal2(char[][] board)
	{
		int size = board.length;
		for(int d = 0; d < size; d++)
		{	System.out.println( board[d][size-1-d] );
		}
	}

	public static boolean checkRow(char[][] board, int row, char player)
	{
		if( board == null )
		{
			return false;
		}
		row = Math.abs(row);		// |x|; if( row < 0 ) row = row * -1;
		row = row % board.length;	// % modulo;  allows roll over of values
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			if(board[row][col] != player)
			{	return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{	/* declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
		//char[][] board = new char[3][3];		// 0 2  1 1  2 0
		char[][] board= {	{ 'O', 'X', 'O' },
							{ 'X', 'O', 'X' },
							{ 'X', 'X', 'X' }
						};
		
		printBoard(board);
		System.out.println();					// 0 4	1 3  2 2  3 1  4 0
		//					   0    1    2    3    4		length=5
		char[][] board2= {	{ '1', '2', '3', '4', '5' },	//  0
							{ '6', '7', '8', '9', 'A' },	//  1
							{ 'B', 'C', 'D', 'E', 'F' },	//  2
							{ 'G', 'H', 'I', 'J', 'K' },	//  3
							{ 'L', 'M', 'N', 'O', 'P' },	//  4
						};
		
		printBoard(board2);
		System.out.println();
		
		System.out.println("\nPrinting rows 3 & 9");
		printRow(board2, 3);
		printRow(board2, 9);
	
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
		
		int row = 2;
		System.out.println( "\nChecking player X, row " + (row+1) + "=" + checkRow(board, 2, 'X') ); // checks if player X won row 2 (3rd row)
	}
}

