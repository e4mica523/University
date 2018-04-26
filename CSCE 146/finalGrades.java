/*
 * Written by Kevon Smith
 */

import java.io.*;
import java.util.Scanner;
public class finalGrades 
{

	static final String IN_FILE_NAME = "grades.txt";

	 
	public static void main(String[] args) 

	{
	 
	// TODO Auto-generated method stub
	 
	String fileName = IN_FILE_NAME;

	String line = null;

	try 
	{
		Scanner fileScanner = new Scanner(new File (fileName)); 
		FileReader fileReader = new FileReader(fileName);
	 
		BufferedReader bufferedReader = new BufferedReader(fileReader);
	
		while((line = bufferedReader.readLine()) != null)
		{
			String copyGrades = fileScanner.next().toUpperCase();
			if (copyGrades.contains("LABS"))
			{

			}
			System.out.println(line);
		}

		}
	catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	
	public 
		
}
