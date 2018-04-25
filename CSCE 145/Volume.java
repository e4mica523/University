/*
 * Eric Formica
 * 8/21/14
 * Volume Lab Problem,
 */
package lab1;
import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Volume Calculator!");
		//Now create and connect a Scanner object to the keyboard
	     Scanner keyboard = new Scanner(System.in);
		
	     System.out.println("Please enter the mass in grams:");
	     int mass = keyboard.nextInt(); //saves the entered mass
			
	     System.out.println("Please enter the density in grams per cubic centimeters");
	     int density = keyboard.nextInt(); //saves the density entered
		
	     int volume = mass / density; //volume is found by dividing mass by density

	     //outputs what they entered with the result below
	     System.out.println("The mass you entered: " + mass + " grams");
	     System.out.println("The density you entered: " + density + " grams per cubic centimeters");
	     System.out.println("The volume of your object is: " + volume + " cubic centimeters");
	     


	}

}
