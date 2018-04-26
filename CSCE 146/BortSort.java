/*
 * Written by Eric Formica
 * Bort Sort
 * March 4th 2015
 *
 */
import java.util.*;
public class BortSort {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] bortArray = {"Bort","asdf","asdfbort","asdfasdfbortBortBORTbort","bortbortbortbortBORTBORTBORTBORT","qwertqwertqwertqwertbortBORT","bortzilla","bortderbort",
								"bored"};
		System.out.println("Unsorted\n");
		
		for(String bortString : bortArray)
		{
			System.out.println(bortString);
		}
		
		String[] bortSorted = new String[bortArray.length];
		
		System.out.println("\nBORT SORTED!!!\n");
		
		bortSorted = bortSort(bortArray);
		
		for(String bortString : bortSorted)
		{
			System.out.println(bortString);
		}
	}
	private static class BortCountUnit
	{
		private String bortWord;
		private int bortCount;
		public BortCountUnit()
		{
			this.bortWord = "";
			this.bortCount = 0;
		}
	}
	public static int count(String word)
	{
		String lowercase = word.toLowerCase(); //changes it to lowercase
		int num = 0; //count variable
		while(lowercase.indexOf("bort") >= 0)
		{
			num++;
			lowercase = lowercase.substring(lowercase.indexOf("bort") + 1);
		}
		return num;
	}
	
	public static String[] bortSort(String[] bortArray)
	{
		
		int[] numArr = new int[bortArray.length]; //int array for the numbers
		int[] sortCounts = new int[bortArray.length];
		String [] result = bortArray; //result array
		String [] sortRes = new String[bortArray.length]; //sorted result array
		
		for(int i = 0; i < bortArray.length; i++)
		{
			numArr[i] = count(bortArray[i]); //calls the count method
		}
		
		//sorting with insertion sort
		for(int i=0;i<numArr.length;i++)
		{
			for(int j=0;j<bortArray.length;j++)
			{
				if(j>=i)//reached the end of the sorted array
				{
					sortCounts[j] = numArr[i];
					sortRes[j] = result[i];
					break;
				}
				else if(sortCounts[j]>numArr[i])
				{
					for(int k=sortCounts.length-1;k>j;k--)
					{
						sortCounts[k] = sortCounts[k-1]; //swap
						sortRes[k] = sortRes[k-1]; //swap
					}
					sortCounts[j] = numArr[i]; //swapping
					sortRes[j] = result[i]; //swapping
					break;
				}				
			}
		}
		return sortRes;
	}

}
