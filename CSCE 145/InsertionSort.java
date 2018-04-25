import java.util.Scanner;
/*
 * Eric Formica
 * 9/30/2014
 * Insertion Sort
 * 
 */

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length for your array.");
		int length = keyboard.nextInt();
		int [] Arr1 = new int[length]; //2 arrays, one they enter, and the sorted one
		int [] SortedArr = new int[length];
		
		for(int i=0; i< Arr1.length;i++) //goes through the entire array and populates it
		{
				System.out.println("Enter the number at position " + i);
				Arr1[i] = keyboard.nextInt();
				SortedArr[i] = Arr1 [i];
		}
		
		//insertion sort
		
		for(int i = 0; i < Arr1.length; i++)
		{
			int j = i;
			int temp = SortedArr[i];
			while((j > 0) && (SortedArr[j-1] > temp))
			{
				
				SortedArr[j] = SortedArr[j-1];
                j--;
			}
			SortedArr[j] = temp;
			
		}
		
		System.out.println("The first array: ");
		for(int i=0; i< Arr1.length;i++) //goes through the entire array and populates it
		{
			System.out.print(Arr1[i] + " ");		
		}
		
		System.out.println("\nThe sorted array: ");
		for(int i=0; i< SortedArr.length;i++) //goes through the entire array and populates it
		{
			System.out.print(SortedArr[i] + " ");		
		}
		
		
	}

}
