package com.org.brozelabfallowship.code;

public class TicTacToeGame {

	
	char createBoard[][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};	
	
	public void createBoard()
	{
		
	//	board =new char[10];
		
		
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
	
	
	public static void main(String[] args) {
		
		
		TicTacToeGame t=new TicTacToeGame();
		t.createBoard();
		
	}
	
	
	
	
	
}
