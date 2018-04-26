/*
 * Written by Eric Formica
 * Star Wars Heap Tester
 * April 22nd 2015
 *
 */
import java.util.*;
import java.io.*;

public class ThingyTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Writing to files

		int blahcount = 0; //counter

		BinaryThingy b = new BinaryThingy(); //creates a new binary

		try {
			Scanner fileScanner = new Scanner(new File("blah.txt"));
			System.out.println("Scanning The Blah File and Counting the Blahs");
			
			while (fileScanner.hasNext()) //reading from a file
			{
				String line = fileScanner.nextLine();
				String[] tokens = line.split(" ");
				for (int i = 0; i < tokens.length; i++)
				{
					if (tokens[i].equals("blah"))
					{
						blahcount++;
					}
					
				}
				b.insert(blahcount); //insert method
				blahcount = 0;
			}
			fileScanner.close();
		} catch (IOException e) {
			System.out.println("An IOException has occured!  Ending life");
			System.exit(0);
		}
		// outputs the counter because blah
		// System.out.println("Number of Blahs in the blah file: " + blahcount);
		b.printInorder();
	}

}
