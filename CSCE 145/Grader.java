/*
 * Eric Formica
 * 10/14/2014
 * Grader
 * 
 */
import java.util.Scanner;
public class Grader
{
	Scanner keyboard = new Scanner(System.in);
	double quiz1, quiz2, midterm, finalExam, finalGrade; //variables
	
	
	void setQuiz1() //method for getting quiz1
	{
		
		System.out.println("Enter the first Quiz grade(0-100)");
		quiz1 = keyboard.nextInt();
		if(quiz1 < 0 || quiz1 > 100) //if out of bounds, they are dumb
		{
			System.out.println("You are a moron. No grade for you.");
			System.exit(0);
		}
		
	}
	
	void setQuiz2() //method for getting quiz2
	{
		
		System.out.println("Enter the second Quiz grade(0-100)");
		quiz2 = keyboard.nextInt();
		if(quiz2 < 0 || quiz2 > 100) //if out of bounds, they are dumb
		{
			System.out.println("You are a moron. No grade for you.");
			System.exit(0);
		}
	}
	
	void setMidtermExam() //method for getting midterm
	{
		
		System.out.println("Enter the midterm  grade(0-100)");
		midterm = keyboard.nextInt();
		if(midterm < 0 || midterm > 100) //if out of bounds, they are dumb
		{
			System.out.println("You are a moron. No grade for you.");
			System.exit(0);
		}
	}
	
	void setFinalExam() //method for getting final exam
	{
		
		System.out.println("Enter the final exam grade(0-100)");
		finalExam = keyboard.nextInt();
		if(finalExam < 0 || finalExam > 100) //if out of bounds, they are dumb
		{
			System.out.println("You are a moron. No grade for you.");
			System.exit(0);
		}
	}
	
	void calculateFinalGrade() //method for calculating final grade
	{
		quiz1 = quiz1 * 0.125; //12.5%
		quiz2 = quiz2 * 0.125;
		midterm = midterm * 0.25; //25%
		finalExam = finalExam * 0.50; //50%
		
		finalGrade = (quiz1 + quiz2 + midterm + finalExam); //adds all the grades up to get grade
	}
	
	void printFinalGrade() // printing final grade
	{
		System.out.println("The Final Grade is: " + finalGrade);
		if(finalGrade > 90 && finalGrade <= 100) //if this range, its an A
		 {
			System.out.println("A");
		 }
		 if(finalGrade >= 80 && finalGrade < 90) //if this range, its a B
		 {
			 System.out.println("B");
		 }
		 if(finalGrade >= 70 && finalGrade < 80) //if this range, its a C
		 {
			 System.out.println("C");
		 }
		 if(finalGrade >= 60 && finalGrade < 70) //if this range, its a D
		 {
			 System.out.println("D");
		 }
		 if(finalGrade >= 0 && finalGrade < 60) //if this range, its an F
		 {
			 System.out.println("F");
		 }

	}
	
	
}
