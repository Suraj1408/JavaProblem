public class TicTacToeGameUc2 {

	
	static char createBoard[][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};	
	
	public static void createBoard()
	{		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(createBoard[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
		
	}

	public static String ChoosePlayer()
	{
		 String player = null;
		 System.out.println("Choose yours");
		 if(player=="X")
		 {
			return "0 for Human User"; 
		 }
		else 
		{
			return "X for Computer";
		}
		
	}
	
	public static void main(String[] args) {
	
		TicTacToeGame.createBoard();
	   String player= TicTacToeGame.ChoosePlayer();
	   System.err.println(player);
	}
	
	
	
	
	
}
