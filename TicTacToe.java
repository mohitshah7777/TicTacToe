import java.util.Scanner;

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

	public static char chooseLetter()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter either (x) or (o)");
		String key=input.next();
		char playerInput=key.charAt(0);

		while(true)
		{
			if(playerInput == 'x' || playerInput == 'X')
			{
				System.out.println("Player chose = "+playerInput); 
			}
			else if(playerInput == 'o' || playerInput == 'O')
			{
				System.out.println("Player chose = "+playerInput);
			}
			else
			{
				System.out.println("Wrong Input");
			}
			return playerInput;
		}
	}
	public static void main(String[] args) {

		gameBoard();
		chooseLetter();
	}

}
