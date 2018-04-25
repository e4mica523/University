/*
 * Eric Formica
 * 9/23/2014
 * Temperature Calculator
 * 
 */
import java.util.Scanner;
public class TemperatureCalc {
	
	
	public static final int DAYS = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prompts the user and sets up the scanner
		System.out.println("Please enter the temperature for 10 days.");
		Scanner keyboard = new Scanner(System.in);
		int[] tempArr = new int[DAYS]; //creates an int array to store temps
		double average = 0;
				
		for(int i=0; i<tempArr.length;i++) //goes through the entire array
		{
			System.out.println("Enter the temperature for day "+(i+1)); //populates the array with the temps they enter
			tempArr[i] = keyboard.nextInt();
			average += tempArr[i]; //calculating the average
		}
		
		average = average / DAYS; //divides by num of days to get average
		System.out.println("The average temperature: " + average);
		
		System.out.println("The days above the average are as follows:");
		for(int i = 0; i < tempArr.length; i++) //goes through entire array
		{
			if(tempArr[i] > average) //if above average, display it
			{
				System.out.println("Day " + (i+1) + " with "+ tempArr[i]); //displays the temps over average
			}
		}
		
		
	}
}
