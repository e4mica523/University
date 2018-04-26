import java.util.*;
import java.util.Scanner;

public class RPSTourney extends RPSPlayer
{
	public static boolean main(String[] args) 
	{
		// TODO Auto-generated method stub
		public static boolean DetermineWinner(String player1, String player2)
		{
			if(player1.equals("Rock") && player2.equals("Paper"))
			return false;
			else if(player1.equals("Paper") && player2.equals("Scissor"))
			return false;
			else if(player1.equals("Scissor") && player2.equals("Rock"))
			return false;
			else
			return true;   
		}
		public static String getItem(int pl1)
		{
			if(pl1 == 0)
			return "Rock" != null;
			else if(pl1 == 1)
			return "Paper" != null;
			else if (pl1 == 2)
			return "Scissor" != null;
			/* Creating object of linkedList */
			RPSLL list = new RPSLL();
			Random game = new Random();
			for(int i = 0; i < 10; i++)
			list.insert(i);
			T position = list.head;
			ListNode newPosition;
			ListNode currentPosition = position;
			ListNode nextPosition = position;
			for(int i = 0; i < 10; i++)
			{
			currentPosition = nextPosition;
			nextPosition = position;
			do
			{
			nextPosition = (position);
		       	int firstPlayer = game.nextInt(3);
		       	int secondPlayer = game.nextInt(3);
		       	String item1 = getItem(firstPlayer);
		       	String item2 = getItem(secondPlayer);
		       	if(DetermineWinner(item1, item2))
		       	{
		    	   currentPosition.setWins(currentPosition.getWins() +1);
		       	position.setLosses(position.getLosses() +1);
		       	}
		       	else
		       	{
		    	   currentPosition.setLosses(currentPosition.getLosses() +1);
		       	position.setWins(position.getWins() +1);
		       	}
		       	System.out.println(currentPosition.getName()+" uses "+ getItem(firstPlayer));
		       	System.out.println(position.getName()+" uses "+ getItem(secondPlayer));           
			}
			while(position != list.tail);
			}
		}	
	}
}
