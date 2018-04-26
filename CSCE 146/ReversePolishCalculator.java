/*
 * Written by Eric Formica
 * Reverse Polish Calculator
 * February 4th 2015
 *
 */
import java.util.*;

public class ReversePolishCalculator {
	Stack<Integer> valueStack = new Stack<Integer>(); // creates the valueStack of the Integer type

	public void ReversePolishCalulator() // constructor
	{
		valueStack = new Stack<Integer>();

	}

	public int calculate(String symbol) // calculate method
	{
		Scanner operation = new Scanner(symbol); // sets up scanner

		int val1; // values to keep track of the first value
		int val2; // keeps track of second in case of subtraction and division

		try {

			while (operation.hasNext()) {
				String token = operation.next();

				if (token.equals("+")) // if it is addition
				{
					
					if (valueStack.size() >= 2) // makes sure it is at least 2
												// numbers
					{
						// pops the 2 numbers
						val1 = valueStack.pop();
						val2 = valueStack.pop();
						valueStack.push(val1 + val2); // adds the numbers
					} else {
						System.out.println("Error");
						return 0; // returns 0 if there is an error
					}
				} else if (token.equals("-")) // subtraction
				{
					if (valueStack.size() >= 2) // at least 2 numbers?
					{
						val1 = valueStack.pop();
						val2 = valueStack.pop();
						valueStack.push(val2 - val1); // subtracts the first
														// number in by the last
					} else {
						System.out.println("Error");
						return 0; // return 0 if there is an error
					}
				} else if (token.equals("*")) // multiplication
				{
					if (valueStack.size() >= 2) // have to have at least 2 to
												// multiply
					{
						val1 = valueStack.pop();
						val2 = valueStack.pop();
						valueStack.push(val1 * val2); // multiplies the two
														// numbers
					} else {
						System.out.println("Error");
						return 0; // returns 0 if there is an error
					}
				} else if (token .equals("/")) // division
				{
					if (valueStack.size() >= 2) // need at least 2 numbers to
												// divide
					{
						val1 = valueStack.pop();
						val2 = valueStack.pop();
						valueStack.push(val2 / val1); // divides the first value
														// by the others
					} else {
						System.out.println("Error");
						return 0; // returns 0 if there is an error
					}
				} else {
					int number = Integer.parseInt(token); // converts to an
															// Integer
					valueStack.push(number);
					// System.out.println("Error");
					// return 0; //return 0 if there is an error
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (valueStack.size() == 1) // if its only 1 number
		{
			return valueStack.pop(); // return that same number
		} else {
			System.out.println("Error");
			return 0;
		}
	}

}
