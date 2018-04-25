/*
 * Eric Formica
 * 8/21/14
 * Lab1
 */
package lab1;
import java.util.Scanner;
public class FirstProgram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello out there.");
	     //two forward slashes means the rest of the line is a comment!! 

	    //Make a String variable for storing a first name -- change this to your first name
	     String firstName = "Eric";
	     //Make a String variable for storing a last name -- change this to your last name
	     String lastName = "Formica";

	     //Make a char variable that indicates the grade you want to make in this class
	     char grade = 'A'; //note single quotes ' around characters

	     //Finally, output all of that information to the screen
	     System.out.println("My first name is " + firstName + " and my last name is " + lastName +
	             " and if I study hard, I will make a(n) " + grade + " in CSCE145!"); 

	    //Prompt the user to input two numbers to add
	     System.out.println("I will now add two integer values, please enter the two integer values separated by a space: ");

	     //Now create and connect a Scanner object to the keyboard
	     Scanner keyboard = new Scanner(System.in);

	     //Now use the keyboard object to retrieve values from the user
	     int value1 = keyboard.nextInt();
	     int value2 = keyboard.nextInt();
	     int result = value1 + value2; //This adds the values

	     System.out.println("The result of adding " + value1 + " and " + value2 + " is: " + result); 

	    System.out.println("Goodbye!");
 

	}

}
