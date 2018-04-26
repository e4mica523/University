/*
 * Written by Eric Formica
 * Math Progressions
 * February 11th 2015
 *
 */
import java.util.*;
public class MathProgressions
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in); //sets up the scanner
		System.out.println("Welcome to the Math Stuff.");
		System.out.println("Enter a number and I will calculate the geometric and harmonic sequences");
		double number = keyboard.nextDouble(); //takes and stores the input
		
		System.out.println("Geometric is: "); //geometric
		for(int i = 1; i <= number; i++) //loop for the call
		{
			System.out.print(i + "=" + geometric(i) + " "); //calls the recursive method
			
		}
		System.out.println();
		
		System.out.println("Harmonic is : "); //harmonic
		for(int i = 1; i <= number; i++) //loop for the call
		{
			System.out.print(i + "=" + harmonic(i) + " "); //calls the recursive method
		}
		System.out.println();
		
	}
	
	public static double geometric(double num) //geometric method
	{
		if(num > 1)
		{
			return num * geometric(num - 1); //number times the previous number and recursively calls the method again
		}
		else
		{
			return 1.0; //ends the recursion
		}
		
	}
	
	public static double harmonic(double num) //harmonic method
	{
		if(num > 1)
		{
			return (1/num) * harmonic((num - 1)); //multiplies the inverse by the next number in the recursion
		}
		else
		{
			return 1.0; //stops the method
		}
		
	}

}
