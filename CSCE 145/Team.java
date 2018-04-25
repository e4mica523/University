
public class Team
{
	//variables for score and name
	private String name = "";
	private int score = 0;
	
	
	String getName() //returns the name
	{
	return this.name;
	}
	
	void setName(String name) //sets the name
	{
		this.name = name;
	}
	 
	int getScore() //gets the score
	{
		return this.score;
	}
	

	void ScorePoints(int score) //adds points to the total score
	{
		if(score == 1 || score == 2 || score == 3)
		{
			this.score += score;
		}
		else
		{
			System.out.println("Invalid point increase!");
		}
	}
	
}
