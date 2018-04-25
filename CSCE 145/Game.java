import java.util.Scanner;
public class Game
{
	Team t1 = new Team(); //objects for the teams
	Team t2 = new Team();
	private String team1;
	private String team2;
	Scanner keyboard = new Scanner(System.in);

	void Start()
	{
		System.out.println("Welcome to the scoreboard");
		System.out.println("Enter the first Team name: ");
		team1 = keyboard.nextLine();
		t1.setName(team1); //passes the first team name
		System.out.println("Enter the second Team name: ");
		team2 = keyboard.nextLine();
		t2.setName(team2); //passes the second team name
		
		String choice = "";
		
		while(!choice.equals("over")) //while they don't enter "over"
		{
				
				System.out.println("Enter the team (either 1 or 2) Or enter 'over' to end the game");
				choice = keyboard.nextLine();
				
				if(choice.equals("1")) //if they enter 1, it allows them to add to team 1
				{	
					System.out.println("Enter the score to add");
					int increase = keyboard.nextInt();
					t1.ScorePoints(increase); //adds the points to team 1
				}
				else if(choice.equals("2"))
				{
					System.out.println("Enter the score to add");
					int increase = keyboard.nextInt();
					t2.ScorePoints(increase); //adds the points to team 2
				}
				
				if(choice.equals("over"))
				{
					break;
				}

				//outputs the scoreboard and who is winning
				System.out.println("Team " + t1.getName() + " Score: " + t1.getScore());
				System.out.println("Team " + t2.getName() + " Score: " + t2.getScore());
				if(t1.getScore() > t2.getScore())
				{
					System.out.println("Team " + t1.getName() + " is winning!");
				}
				else if(t2.getScore() > t1.getScore())
				{
					System.out.println("Team " + t2.getName() + " is winning!");
				}
				else
				{
					System.out.println("The game is tied!");
				}
		}

		//at the end it determines who won
		System.out.println("Team " + t1.getName() + " score: " + t1.getScore());
		System.out.println("Team " + t2.getName() + " score: " + t2.getScore());
		if(t1.getScore() > t2.getScore())
		{
			System.out.println("Team " + t1.getName() + " has won!");
		}
		else if(t2.getScore() > t1.getScore())
		{
			System.out.println("Team " + t2.getName() + " has won!");
		}
		else
		{
			System.out.println("The game ends in a  tie!");
		}
		
	}

	
	
}
