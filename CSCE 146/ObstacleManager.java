/*
 * Written by Eric Formica
 * Obstacle Manager
 * February 18th 2015
 *
 */
 import java.util.*;
 import java.awt.*;
public class ObstacleManager
{
	private ArrayList <Obstacle> obstacles; //creates the arraylist
	private int counter; //counter variable
	
	public ObstacleManager() //constructor
	{
		obstacles = new <Obstacle> ArrayList();
		counter = 0; //initializes the counter to 0
	}

	public ArrayList<Obstacle> getObstacles() //getter for obstacles
	{
		return obstacles;
	}
	
	public void update() //updates
	{

		for(int i = 0; i < obstacles.size(); i++)
		{
			int xPos = obstacles.get(i).getX(); //gets x pos of obstacle
			obstacles.get(i).update();
			
			if(xPos < -obstacles.get(i).WIDTH) //if it is out of bounds
			{
				obstacles.remove(i); //remove the obstacle
			}
			
		}
		counter = counter + Game.DELTA_TIME; //adds the time to the counter
		if(counter == 2000) //2 second limit
		{
			Obstacle newOb = new Obstacle(); //creates a new obstacle
			obstacles.add(newOb); //adds it to the obstacles
			counter = 0; //resets the counter
		}
		
	}
	
	public void draw(Graphics g) //draw method
	{
		for(int i = 0; i < obstacles.size();i++)
		{
			Obstacle drawOb = obstacles.get(i); //gets the position
			drawOb.draw(g); //calls the obstacle draw method
		}
	}

	
	
	

}
