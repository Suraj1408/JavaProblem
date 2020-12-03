package com.org.brozelabfallowship.code;

import java.util.Scanner;

public class TicTacToeGame {

	static String createBoard[]= {" "," "," "," "," "," "," "," "," "};	
	static String turn="X";
	static int inputNum;
	public static void createBoard()
	{		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(createBoard[i]);
				System.out.print("|");
			}
			System.out.println();
		}
		
	}
	public static String ChoosePlayer()
	{
		 String player = null;
		 if(player=="X")
		 {
			return "0 for Human User"; 
		 }
		else 
		{
			return "X for Computer";
		}
		
	}
	public static void showBoard()
	{
		
		if(turn.equals("X"))
		{
			turn= "0";
		}
		else
		{
			turn="X";
		}
       TicTacToeGame.createBoard();
	}
	public static void desiredLovation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input no");
		int input=sc.nextInt();
		while(input<=9)
		{
			if(createBoard[input]==" ")
			{
				String player=ChoosePlayer();
				createBoard[inputNum]=player;
			}
			else {
				
				System.out.println("coloum is not empty");
			}
		}
		TicTacToeGame.showBoard();
	}
	
	public static void main(String[] args) {
	
		TicTacToeGame.createBoard();
	   String player= TicTacToeGame.ChoosePlayer();
	   System.err.println(player);
	   System.out.println("UC 3");
	   TicTacToeGame.showBoard();
	   System.out.println("UC 4");
	   TicTacToeGame.desiredLovation();
	   
	}	
}
