/*
 * Eric Formica
 * 9/17/14
 * Triangle Creator
 */


import java.util.Scanner;
public class triangleCreator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Triangle Land! I can Make Triangles with stars! Enter the size: ");
		int peak = keyboard.nextInt();
		int max = peak; //copy the input as an int
		
		 for ( int i = 1 ; i <= max ; i++ )
	      {
	         for ( int j = 1 ; j <= i ; j++ ) //each row of *
	         {
	            System.out.print("*"); //output a star
	         }
	 
	         System.out.println(); //goes to the next line
	         
	      }

		 for ( int i = max-1 ; i >= 1 ; i-- ) //identical loop, except it works in reverse, starting at the top
	      {
	         for ( int j = 1 ; j <= i ; j++ )
	         {
	            System.out.print("*"); //output a star
	         }
	 
	         System.out.println(); //goes to the next line
	         
	      }
	}

}
