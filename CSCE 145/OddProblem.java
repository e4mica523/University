/*
 * Eric Formica
 * 10/2/2014
 * Odd Problem
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class OddProblem {
	public static void main(String []args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random(); //creates a random
		int odds = 0; //keeps track of the odds
		int evens = 0; //keeps track of the evens
		System.out.println("Please enter the length for the array."); //length
		int length = keyboard.nextInt();
	
		System.out.println("Please enter the width for the array."); //width
		int width = keyboard.nextInt();
	
		int[][] Array = new int[length][width]; //create array of that length and width
		
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < width; j++)
			{
				Array[i][j] = rand.nextInt(10);	//puts a random number in the spot
				if(Array[i][j] % 2 == 0)
				{
					evens++; //if even, increase by 1, if not increase odd by 1
				}
				else
				{
					odds++;
				}
			}
		}
		
		
		//output array
		System.out.println("The Matrix:");
		for(int i = 0; i< Array.length;i++) //goes through the entire array
		{
			for(int j = 0; j < Array[0].length; j++)
			{
				System.out.print(Array[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		if(odds > evens)
		{
			System.out.println("The Matrix is more odd than even");
		
		}
		else
		{
			System.out.println("The Matrix is more even than odd");
		}
		
	}
}
