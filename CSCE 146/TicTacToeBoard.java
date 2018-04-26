/*
 * Written by Eric Formica
 * Tic Tac Toe Board
 * January 14th 2015
 */
public class TicTacToeBoard
{
	String [][] spaces = new String [3][3]; //creates a 3x3 board
	static String EMPTY_SPACE = "_"; //symbol for empty space
	static String X_SPACE = "X"; //symbol for x
	static String O_SPACE = "O"; //symbol for y
	
	public TicTacToeBoard() //default constructor calls the method to clear the board
	{
		clearBoard();
	}
	
	public void clearBoard() //sets every position to be an empty space
	{
		for(int i = 0; i < spaces.length; i ++)
		{
			for(int j = 0; j < spaces.length; j ++)
			{
				spaces[i][j] = EMPTY_SPACE;
			}
		}
	}
	
	public void drawBoard() //goes through every space and outputs it to the screen
	{
		for(int i = 0; i < spaces.length; i ++)
		{
			for(int j = 0; j < spaces[i].length; j ++)
			{
				System.out.print(spaces[i][j]);
				System.out.print(" | "); //separates all the spaces with |
			}
			System.out.println();
		}
	}
	
	public boolean checkHorizontalVictory()
	{
		for(int i = 0; i < 3 ;i++)
		{
			if(spaces[i][0] != "_" && spaces[i][1] == spaces[i][0] && spaces[i][2] == spaces[i][0]) //if it is a horizontal victory
			{
				return true; //yes it is a victory
				
			}
		}
		return false; //if not, then return false
	}
	
	public boolean checkVerticalVictory()
	{
		for(int i = 0; i < 3 ;i++)
		{
			if(spaces[0][i] != "_" && spaces[1][i] == spaces[0][i] &&
					spaces[2][i] == spaces[0][i]) //is it a vertical victory?
			{
				return true; //yes
				
			}
			
		}
		return false; //no
	}
	
	public boolean checkDiagonalVictory() //check whether both diagonal cases are present
	{
			if((spaces[0][0] != "_" && spaces[1][1] == spaces[0][0] &&
					spaces[2][2] == spaces[0][0]) || (spaces[0][2] != "_" && spaces[1][1] == spaces[0][2] &&
					spaces[2][0] == spaces[0][2]))
			{
				return true;
				
			}
			else
			{
				return false;
			}
		
	}
	
	public boolean checkVictory() //checks if sombody won
	{
		if(checkHorizontalVictory() == true || checkVerticalVictory() == true || checkDiagonalVictory() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkFilledBoard() //is the whole board filled?
	{
		for(int i = 0; i < spaces.length; i ++)
		{
			for(int j = 0; j < spaces[i].length; j ++)
			{
				if(spaces[i][j].equals("_"))
				{
					return false; //if there is an empty space, then return false
				}
			}
		}
		return true;
	}
	
	public boolean setSpace(int x, int y, String piece) //sets the position and which piece
	{
		if(x > 2 || y > 2) //if out of bounds then it is an error
		{
			return false;
		}
		else if(spaces[x][y].equals("X") || spaces[x][y].equals("O")) //if the spot is filled you can put anything there
		{
			return false;
		}
		else
		{
			spaces[x][y] = piece; //if ok, put the piece there
			return true;
		}
		
		
	}
	

}
