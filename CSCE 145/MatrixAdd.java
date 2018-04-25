import java.util.Scanner;

/*
 * Eric Formica
 * 9/25/2014
 * Matrix Addition
 * 
 */
public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length for the first array."); //length 1
		int length1 = keyboard.nextInt();
		
		System.out.println("Please enter the height for the first array."); //width 1
		int width1 = keyboard.nextInt();
		
		int[][] Arr1 = new int[length1][width1]; //create array of that length and width
		
		
		System.out.println("Please enter the length for the second array."); //length 2
		int length2 = keyboard.nextInt();
		
		System.out.println("Please enter the height for the second array."); //length 2
		int width2 = keyboard.nextInt();
		
		int[][] Arr2 = new int[length2][width2]; //create array of that length and width
		
		int[][] AddedArr = new int[length1][width1]; //create an array to store added nums
		
		if(length1 == length2 && width1 == width2)
		{	
		
			//populate 1st 2d array
			for(int i=0; i< Arr1.length;i++) //goes through the entire array and populates it
			{
				for(int j = 0; j < Arr1.length; j++)
				{
					System.out.println("Enter the number in matrix 1 spaces " + (i+1) + "," + (j+1));
					Arr1[i][j] = keyboard.nextInt();
					
				}
				
				
			}
			
			//populate 2nd 2d array
			for(int i=0; i< Arr2.length;i++) //goes through the entire array and populates it
			{
				for(int j = 0; j < Arr2.length; j++)
				{
					System.out.println("Enter the number in matrix 2 spaces " + (i+1) + " , " + (j+1));
					Arr2[i][j] = keyboard.nextInt();
					
				}
				
				
			}
			
			//adding the array numbers
			
			for(int i=0; i< AddedArr.length;i++) //goes through the entire array
			{
				for(int j = 0; j < AddedArr.length; j++)
				{
					
					AddedArr[i][j] = (Arr1[i][j] + Arr2[i][j]); //adds two arrays and stores it in third
					
				}
				
				
			}
			
			//output array
			for(int i = 0; i< Arr1.length;i++) //goes through the entire array
			{
				for(int j = 0; j < Arr1.length; j++)
				{
					System.out.print(Arr1[i][j] + " ");
					
				}
				
				System.out.println();
				
			}
			
			
			System.out.println("+");
			//output 2nd array
			for(int i=0; i< Arr2.length;i++) //goes through the entire array 
			{
				for(int j = 0; j < Arr2.length; j++)
				{
					System.out.print(Arr2[i][j] + " ");
					
				}
				System.out.println();
				
			}
			
			System.out.println("=");
			//output the added array
			
			for(int i=0; i< AddedArr.length;i++) //goes through the entire array
			{
				for(int j = 0; j < AddedArr.length; j++)
				{
					System.out.print(AddedArr[i][j] + " ");
					
				}
				System.out.println();
				
			}
			
			
		
		}
		else //if the sizes dont match, doesnt add them and prints an error
		{
			System.out.println("The matrices do not match. Unable to add!");
		}

	}

}
