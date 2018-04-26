/*
 * Written by Eric Formica
 * High Low Game
 * January 28th 2015
 *
 */
import java.util.*;
public class HiLowGame
{
	private Queue<Integer> numberQueue; //queue
	private int points; //points
	private int currNumber; //variable for the current number
	
	//2 constant variables
	public static final int MIN_ARRAY_LIST_SIZE = 10;
	public static final int MAX_RANDOM_NUMBER = 100;
	
	public HiLowGame() //constructor that initializes points
	{
		setPoints(0);
		numberQueue = new LinkedList<Integer>(); //creates the linked list
	}

	//accessors and mutators
	public Queue<Integer>getNumberQueue()
	{
		return numberQueue;
	}

	public void setNumberQueue(Queue<Integer> newNumberQueue)
	{
		this.numberQueue = newNumberQueue;
	}

	public int getPoints()
	{
		return points;
	}

	public void setPoints(int aPoints)
	{
		if(points >= 0) //checks to see whether they have negative points
		{
			this.points = aPoints;
		}
		else
		{
			System.out.println("Error. Negative Points!");
			System.exit(0); //exits if negative points
		}
	}

	public int getCurrNumber()
	{
		return currNumber;
	}

	public void setCurrNumber(int newCurrNumber)
	{
		this.currNumber = newCurrNumber;
	}
	
	public void resetQueue()
	{
		numberQueue.clear(); //empty the queue
		
		Random r = new Random(); //generates a random number
		int sizeQueue = r.nextInt(MIN_ARRAY_LIST_SIZE)+ MIN_ARRAY_LIST_SIZE; 
		for(int i = 0; i < sizeQueue; i++)
		{	
			numberQueue.add(r.nextInt(MAX_RANDOM_NUMBER)); //populates it with random numbers
		}
		currNumber = r.nextInt(MAX_RANDOM_NUMBER);
	}
	
	
	public boolean guessWasCorrect(String guess)
	{
		
		if(guess.equalsIgnoreCase("higher") && currNumber >= numberQueue.peek()) //if they enter higher
		{	
			currNumber = numberQueue.remove(); //remove and return true
			return true;
		}
		else
		{
			if(guess.equalsIgnoreCase("lower") && currNumber <= numberQueue.peek()) //if they enter lower
			{
				currNumber = numberQueue.remove(); //remove and return
				return true;		
			}
		}
		return false; //else return false
			
		
	}
	

}
