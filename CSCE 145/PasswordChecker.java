/**
 *  @author  Eric Formica                     *
 *  @version  1.2, 02 September 2014                      *
 *  This program confirms a password typed into a      *
 *    console window                                   *
 */



package lab03;

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args)
	{
		String secret = "Flynn";
		
		
		System.out.println("Welcome to the Grid User. I am Tron, Please Enter you Username."); //greeting
		Scanner keyboard = new Scanner(System.in);
		
		String user = keyboard.nextLine(); //Enter the Username
	    System.out.println("Please Enter your Password.");
	    String pass = keyboard.nextLine(); //Enter the password
	    
	    if(pass.equals(secret)) //is what they entered equal to the secret password?
	    {
	    	System.out.println("Password accepted. Welcome " + user); //if right, you may enter
	    }
	    else
	    {
	    	
	    	System.out.println("Error. Wrong Password! Please Enter your Password."); //wrong pass = ask again
		    pass = keyboard.nextLine(); //Enter the password again
		    
		    if(pass.equals(secret)) //is what they entered equal to the secret password?
		    {
		    	System.out.println("Password accepted. Welcome " + user); //if right, enter 
		    }
		    
		    else
		    {	
		    	System.out.println("Password Incorrect! Please Stand By for Deresolution!");//if wrong, derezz
		    }
	    }
	    
	    
	}

}
