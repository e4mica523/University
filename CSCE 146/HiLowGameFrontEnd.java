import java.util.*;
public class HiLowGameFrontEnd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		boolean gameOver = false;
		HiLowGame hlGame = new HiLowGame();
		System.out.println("Welcome to the high low game!");
		while(gameOver == false)
		{
			hlGame.resetQueue();
			while(hlGame.getNumberQueue().isEmpty() == false)
			{
				System.out.println("You currently have "+hlGame.getPoints()+" points");
				System.out.println("You have have "+hlGame.getNumberQueue().size()+" guesses");
				System.out.println("The current number is "+hlGame.getCurrNumber());
				System.out.println("Is the next number in the list higher or lower?");
				System.out.println("Enter higher, lower, or exit to walk away!");
				String input = keyboard.next();
				if(input.equalsIgnoreCase("exit"))
				{
					System.out.println("You walked with "+hlGame.getPoints());
					break;
				}
				else if(hlGame.guessWasCorrect(input))
				{
					System.out.println("You are correct!");
					hlGame.setPoints(hlGame.getPoints()+10);
				}
				else
				{
					System.out.println("Sorry you lost... The number was "+hlGame.getNumberQueue().peek());
					hlGame.setPoints(0);
					break;
				}
			}
			System.out.println("Would you like to quit? Yes or no");
			String input = keyboard.next();
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Good bye!");
				System.exit(0);
			}
		}
	}

}
