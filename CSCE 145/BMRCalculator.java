/*
 * Eric Formica
 * 9/11/14
 * BMR Calculator Program
 */

import java.util.Scanner;
public class BMRCalculator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the BMR calcuator!"); //intro
		
		System.out.println("First question: are you Male or Female? Enter \"M\" for male and \"F\" for Female"); //gender
		String gender = keyboard.nextLine();//save the gender
		
		System.out.println("Good. Now please enter your height in inches"); //height 
		double height = keyboard.nextDouble();//save the height
			
		System.out.println("Okay. Now please enter your weight in pounds");
		double weight = keyboard.nextDouble();//save the weight
			
		System.out.println("What is your age?");
		int age = keyboard.nextInt(); //save the age
		
		keyboard.nextLine();
		System.out.println("How would you describe your lifestyle? Sedentary, Somewhat Active, Active, Highly Active?");
		String condition = keyboard.nextLine(); //lifestyle
		
		//calculate the bmr for each gender
		double maleBMR = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
		double femaleBMR = (666 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
		
		
		//all the lifestyle choices and their outputs	
		if(condition.equalsIgnoreCase("Sedentary"))
		{
			if(gender.equalsIgnoreCase("M"))
			{
				
				maleBMR = maleBMR + (0.20 * maleBMR);
				System.out.println("Your BMR is " + maleBMR + " calories!");
				//calculate for male
				
			}
			else if(gender.equalsIgnoreCase("F"))
			{
				femaleBMR = femaleBMR + (0.20 * femaleBMR);
				System.out.println("Your BMR is " + femaleBMR + " calories!");
				//calculate for female
			}
				
		}
		else if(condition.equalsIgnoreCase("Somewhat Active"))
		{
				
			if(gender.equalsIgnoreCase("M"))
			{
				maleBMR = maleBMR + (0.30 * maleBMR);
				System.out.println("Your BMR is " + maleBMR + " calories!");
				//calculate for male
				
			}
			else if(gender.equalsIgnoreCase("F"))
			{
				femaleBMR = femaleBMR + (0.30 * femaleBMR);
				System.out.println("Your BMR is " + femaleBMR + " calories!");
				//calculate for female
			}
									
		}
			
		else if(condition.equalsIgnoreCase("Active"))
		{
			if(gender.equalsIgnoreCase("M"))
			{
				maleBMR = maleBMR + (0.40 * maleBMR);
				System.out.println("Your BMR is " + maleBMR + " calories!");
				//calculate for male
				
			}
			else if(gender.equalsIgnoreCase("F"))
			{
				femaleBMR = femaleBMR + (0.40 * femaleBMR);
				System.out.println("Your BMR is " + femaleBMR + " calories!");
				//calculate for female
			}
					
			//display calculation
							
		}
		else if(condition.equalsIgnoreCase("Highly Active"))
		{
			if(gender.equalsIgnoreCase("M"))
			{
				maleBMR = maleBMR + (0.50 * maleBMR);
				System.out.println("Your BMR is " + maleBMR + " calories!");
				//calculate for male
				
			}
			else if(gender.equalsIgnoreCase("F"))
			{
				femaleBMR = femaleBMR + (0.20 * femaleBMR);
				System.out.println("Your BMR is " + femaleBMR + " calories!");
				//calculate for female
			}
					
							
		}
		
	}

}
