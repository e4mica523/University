/*
 * Eric Formica
 * 9/2/14
 * Coin Counter Lab Problem,
 */

package lab03;

import java.util.Scanner;

public class CoinCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		
		System.out.println("Welcome to the Coin Counter!");
		//Now create and connect a Scanner object to the keyboard
	     Scanner keyboard = new Scanner(System.in);
		
	     System.out.println("Please enter a change amount between 1 and 99");
	     int change = keyboard.nextInt(); //saves the entered number
	     
	     
	     int mod = change % 25; //gets the remainder for quarters
	     int leftover = mod; //creates a temporary variable
	     quarters = change - mod; //finding value of quarters
	     quarters = quarters / 25;// sets the exact number of quarters by dividing
	     
	     int mod2 = leftover % 10; //gets the remainder for dimes
	     leftover = mod2;
	     dimes = mod - leftover; //finding total value of dimes
	     dimes = mod / 10; //sets the number of dimes by dividing
	     
	     int mod3 = leftover % 10; //gets the remainder for nickels
	     leftover = mod3;
	     nickels = mod2 - leftover;
	     nickels = mod2 / 5; //sets the number of nickels
	    
	     int mod4 = leftover % 10; //gets the remainder for pennies
	     leftover = mod4;
	     pennies = mod3 - leftover; //total amount of pennies subtracted
	     pennies = mod3 / 1;//sets the number of pennies
	     
	     //Outputs all the values
	     
	     System.out.println("Your Change of " + change + " cents consists of:");
	     System.out.println("Quarters: " + quarters);
	     System.out.println("Dimes: " + dimes);
	     System.out.println("Nickels: " + nickels);
	     System.out.println("Pennies: " + pennies);

	}

}
