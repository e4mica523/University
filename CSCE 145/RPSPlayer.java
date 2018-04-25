
public class RPSPlayer implements RPSPlayerInterface
{
	//instance variables for points and selection
	private String gesture;
	private int points;
	
	public RPSPlayer() //default constructor
	{
		gesture = "none";
		points = 0;
	}

	public String getGesture()//accessor
	{
		return gesture;
	}

	public void setGesture(String gesture) //sets the choice and checks for errors
	{
		if(gesture.equalsIgnoreCase("Rock" ) || (gesture.equalsIgnoreCase("Scissors"))
				|| (gesture.equalsIgnoreCase("Paper")))
		{
			this.gesture = gesture;
		}
		else
		{
			System.out.println("This is not a valid choice");
			this.gesture = "none";
		}
			
		
	}

	public int getPoints() //returns the points
	{
		return points;
	}

	public void setPoints(int points) //sets the points
	{
		this.points = points;
	}
	
	public void chooseGesture()
	{
		gesture = "none";
	}
	
	
	
	

}
