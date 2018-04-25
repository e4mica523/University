/*
 * Eric Formica
 * 9/16/14
 * Grade Program
 */

import java.util.Scanner;


public class Lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables for grades, highest, lowest, and average
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int numberOfGrades = 0; //keeps track of the number of grades
		int highest = 0;
		int lowest = 0;
		double average = 0.0;
		int total = 0;
		
		System.out.println("Welcome to the Grade Machine!");
		//Now create and connect a Scanner object to the keyboard
	     Scanner keyboard = new Scanner(System.in);
		
	     System.out.println("Please enter a grade number between 0 and 100 or a negative number to exit");
	     int num = keyboard.nextInt(); //saves the entered number
		 int grade = num;
		 
		
		 while(grade > 0) //while they don't enter a negative number
		 {
			 
			 
			 if(grade > 90 && grade <= 100) //if this range, its an A
			 {
				 a++;
			 }
			 if(grade >= 80 && grade < 90) //if this range, its a B
			 {
				 b++;
			 }
			 if(grade >= 70 && grade < 80) //if this range, its a C
			 {
				 c++;
			 }
			 if(grade >= 60 && grade < 70) //if this range, its a D
			 {
				 d++;
			 }
			 if(grade >= 0 && grade < 60) //if this range, its an F
			 {
				 f++;
			 }
			  
			 if(grade > 0)
			 {
				 
				 if(grade > highest) //if it is higher than the highest, it becomes the new highest
				 {
					 highest = grade;
				 }
				 if(grade < lowest) //if it is lower than the lowest, it becomes the new lowest
				 {
					 lowest = grade;
				 }
				 
				 
				 numberOfGrades++; //increases numberofGrades
				 total = total + grade; //increases total amount of grades
				 average = total / (double)numberOfGrades; //finds average
			 }
			 
			 System.out.println("Enter another number between 0 and 100 or -1 to quit");
			 grade = keyboard.nextInt(); //prompts them to either start over or quit
			 
		 }
		 
		 //outputs all the results
		 System.out.println("Total Number of Grades is " + numberOfGrades);
		 System.out.println("Number of A's: " + a);
		 System.out.println("Number of B's: " + b);
		 System.out.println("Number of C's: " + c);
		 System.out.println("Number of D's: " + d);
		 System.out.println("Number of F's: " + f);
		 System.out.println("Highest Grade: " + highest);
		 System.out.println("Lowest Grade: " + lowest);
		 System.out.println("Average Score: " + average);
		 

	}

}
