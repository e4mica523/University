/**
 *  @author  Eric Formica                     *
 *  @version  1.2, 09 September 2014                      *
 *  This program checks whether a date is an actual date                                 *
 */


import java.util.Scanner;
public class Lab04
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a date in the format month/day/year:");
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		String copy = date;
			
			
		//Finds the first instance of slash
		int workingIndex = copy.indexOf("/");
		//Gets everything from the start to the first slash
		String month = copy.substring(0,workingIndex);
		int months = Integer.parseInt(month);
		//Updates the input to get the next part
		copy = copy.substring(workingIndex+1);
			
		//Get the days
		workingIndex = copy.indexOf("/");
		String day = copy.substring(0,workingIndex);
		int days = Integer.parseInt(day);
		copy = copy.substring(workingIndex+1);
			
		//Get the years
		String year = copy.substring(0,workingIndex);
		int years = Integer.parseInt(year);
		copy = copy.substring(workingIndex+1);
			
		if(months <= 0 || months > 12 ) //if out of month range, output its not a valid month
		{
			System.out.println(months + " Is not a valid month of the year!");
		}
		else
		{
				
			if(days > 31 || days < 1) //if out of day range, output its not a valid day
			{
				System.out.println(date + " is not a valid day!");
			}
			else
			{
				if(days < 31 && (months == 2 || months == 4 || months == 6 || months == 9 || months == 11)) //if a month with only 30 days
				{
					int remainder = years % 4; //divisible by 4?
					int doubleCheck = remainder % 100; //divisible by 100?
					int tripleCheck = remainder % 400; //divisible by 400?
					
					
					if(months == 2 && (remainder == 0)) //is it divisible by 4?
					{
						if(doubleCheck == 0) //how about 100?
						{
							if(tripleCheck == 0) //400?
							{
								
								System.out.println(date + " Is a valid date!"); //its a good date
							}
							else
							{
									System.out.print(date + " Is not a valid date");//if they enter > 28 and not a leap year, its an error
							}
							
						}
					}
					
									
				}	
				else if(months > 0 && months < 12) //if 31 day month, its okay
				{
					System.out.println(date + " is a valid date!"); //its a good date
							
				}
				else
				{
					System.out.println(days + " Is not a valid day of that month!"); //not a valid day of that month
				}				
					
			}
				
		}
				
	}			
}
