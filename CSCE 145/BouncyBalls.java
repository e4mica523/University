/*
 * Eric Formica
 * 10/7/2014
 * Lab Exam Bouncy Balls
 * 
 */
import java.util.Scanner;
public class BouncyBalls {
	public static void main(String []args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the boucy ball program");
		System.out.println("Please Enter the initial velocity: ");
		double velocity = keyboard.nextDouble(); //records the velocity as a double
		double height = 0; //keep track of the height
		
		int numberOfBounces = 0;  //keep track of bounces
		int time = 0; //monitor time
		while(numberOfBounces < 5) //5 bounces
		{
			System.out.println("Time: " + time + "  Height: " + height); //output the information
			height = height + velocity;
			velocity = velocity - 32; //gravity subtraction
				
			if(height < 0) //if height is less than 0, bounce
			{
				height = height * -0.5;
				velocity = velocity * -0.5;
				System.out.println("BOUNCE!");
				numberOfBounces++;
			}
			time++;	//increase the time
				
		}
	}
		
		
}

