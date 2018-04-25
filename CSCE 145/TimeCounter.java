/*
 * Eric Formica
 * 9/4/14
 * Time Counter Lab Problem,
 */



package lab3;
import java.util.Scanner;

public class TimeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the time counter. Please enter your time in the format \"Hours : Minutes\"");
		String time = keyboard.nextLine();
		String copy = time;
		System.out.println("Please enter an amount of minutes to increase the time by.");
		int increase = keyboard.nextInt();
		
		//Finds the first instance of a space
		int workingIndex = copy.indexOf(":");
		//Gets everything from the start to the first space
		String hours = copy.substring(0,workingIndex);
		//Updates the input to get the next part
		copy = copy.substring(workingIndex+1);		
		
		int min = Integer.parseInt(copy); //converts the two to ints
		int hrs = Integer.parseInt(hours);
		
		int newMin = min + increase;
		String hZero = ""; //declares strings the ints will become
		String mZero = "";
		mZero = Integer.toString(newMin);
		hZero = Integer.toString(hrs);
	
		while(newMin >= 60) //if min is over 60, increase hours by 1 and start min over
		{
			
			int difference = newMin - 60;  //gets how much over 60 it is
			hrs++; //increases hour by 1
			newMin = 00; //resets the minutes
			newMin = newMin + difference; //adds the remainder
			mZero = Integer.toString(newMin);//converts both the hrs and min back to strings
			hZero = Integer.toString(hrs);
			
			
			if(hrs >= 24) //if hours is over 24, it resets it back to 0
			{
				difference = hrs - 24;
				hrs = 0;
				
				hrs = hrs + difference; //adds the over amount to hours
				hZero = Integer.toString(hrs); //converts the new hrs to string again
				
				while(newMin >= 60) //keeps reseting it as long as minute is over 60
				{
					
					difference = newMin - 60; //repeated process for minutes
					hrs++;
					newMin = 0;
					newMin = newMin + difference;
					mZero = Integer.toString(newMin);
					mZero = "0" + mZero;
					hZero = Integer.toString(hrs);
					hZero = "0" + hZero;
				}	
				
			}
			
		}
		//outputs the result
		System.out.println("When you add " + increase + " to the time of " + time + " you get a new time of " + hZero + " : " + mZero);
	
	}

}
