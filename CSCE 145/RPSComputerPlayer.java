import java.util.Random;
public class RPSComputerPlayer extends RPSPlayer
{
	Random rand;

	public RPSComputerPlayer()
	{
		super();
		rand = new Random();
	}
	
	public void chooseGesture()
	{
		int choice = rand.nextInt(3);
		if(choice == 0)
		{
			super.setGesture("rock");
		}
		if(choice == 1)
		{
			super.setGesture("paper");
		}
		if(choice == 2)
		{
			super.setGesture("scissors");
		}
	}
	
	
	

}
