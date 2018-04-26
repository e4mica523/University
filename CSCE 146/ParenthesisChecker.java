/*
 * Written by Eric Formica
 * Lab Exam 1
 * February 25th 2015
 *
 */
import java.util.*;
import java.io.*;
public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testArray ={"(a)",
				"((((()))))",
				"(asdf)((ababa)(((bob))))",
				"())",
				"((NOPE)",
				"This works I suppose",
				""};
		for(int i=0;i<testArray.length;i++)
		{
			System.out.print("Test number "+i+" ");
			if(parenthesisChecker(testArray[i]))
			{
				System.out.println("is well formed!");
			}
			else
			{
				System.out.println("is wrong.  All wrong");
			}
		}
	}
	public static boolean parenthesisChecker(String aString)
	{
		Stack<Integer> aStack = new Stack<Integer>(); //creates a stack to hold values
		for(int i = 0; i < aString.length(); i++)
		{
			int val = aString.charAt(i); //stores the value into a temp variable
			if(val == '(') //if '('
			{
				aStack.push(val); //push it into the stack
			}
			if(val == ')') //if ')'
			{
				if(aStack.isEmpty() == true) //if it is empty
				{	
					return false; //quit
				}
				aStack.pop(); //otherwise pop it off the stack
			}
		}
		if(aStack.isEmpty() == true) //if it is completely empty
		{
			return true; //return true
		}
		else
		{
			return false; //return false
		}


	}

}
