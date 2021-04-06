public class TicTacToe {

	public static void gameBoard()
	{
		char[] Board = new char[10];
		Board [1]=' '; Board [2]=' '; Board [3]=' '; Board [4]=' '; Board [5]=' '; Board [6]=' '; Board [7]=' '; Board [8]=' '; Board [9]=' ';
		for (int i=1; i<Board.length; i++)
		{
			System.out.println("Box "+i+"["+Board[i]+"]");
		}
	}
	public static void main(String[] args) {

		gameBoard();
	}

}
