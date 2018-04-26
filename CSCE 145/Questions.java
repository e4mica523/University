/*
 * Eric Formica
 * 8/26/14
 * Asking questions and stuff Problem
 */
package lab2;
import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Salutations User!");  //The greeting		
		System.out.println("What is your name?");
		String name = keyboard.nextLine(); //saves the name
		System.out.println("Are you a cat person, a dog person, or an armadillow person?"); 
		String animal = keyboard.nextLine(); //saves the animal they like
		System.out.println("Do you like tacos?"); 
		String tacos = keyboard.nextLine(); //saves the taco choice
		
		System.out.println("Your name is " + name);
		System.out.println("The animal you like is/are " + animal);
		System.out.println("Do you like Tacos:  " + tacos);
		
	}

}
