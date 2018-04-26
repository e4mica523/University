import java.util.*;

public class sortComparison 
{
	static int bubbleCount = 0;
	static int selectionCount = 0;
	static int mergeCount = 0;
	static int quickCount = 0;
	
	public static void main(String[] args) 
	{	
		// TODO Auto-generated method stub
		RandomArray(1000);
		Integer [] data = Array1;
		Integer [] data2 = Array2;
		Integer [] data3 = Array3;
		Integer [] data4 = Array4;
		
		System.out.println("Bubble Sort");
		bubbleSort();
		
		System.out.println("Selection Sort");
		selectionSort();
		
		System.out.println("Merge Sort");
		mergeSort();
		
		System.out.println("Quick Sort");
		quickSort();
		
		System.out.println("Bubble sort: " + bubbleCount);
		System.out.println("Selection sort: " + selectionCount);
		System.out.println("Merge sort: " + mergeCount);
		System.out.println("Quick sort: " + quickCount);
	}
//Selection Sort
	 public static int[] selectionSort(int[] a)
	 {
		 for (int i = 0; i < a.length - 1; i++)
	     {
			 int min = i;
	         for (int j = i + 1; j < a.length; j++)
	         {
	        	 selectionCount++;
	        	 if (a[j] < a[min])
	        	 {
	        		 min = j;
	        		 int temp = a[i]; 
	        		 a[i] = a[min];
	        		 a[i] = temp; 
	        	 }
	         }
	     }
	     return a;
	 }
	
		 
	
//Bubble Sort 
	public static int[] bubbleSort(int[] b)
	{
		boolean done = false;
		int n = b.length;
		while(done == false)
		{
			done = true;
			for(int i=0; i<n;i++)
			{	bubbleCount++;
				if(b[i] > b[i+1])
				{
					int temp = b[i];
					b[i] = b[i+1];
					b[i+1] = temp;
					done = false;
				}
			}
			
		}
		return b;
	}
	
//Merge Sort 
	public static void mergeSort(int[] c)
	{
		int size = c.length;
		if(size < 2)//HALT AND RETURN!!
		{
			return;
		}
		int mid = size/2;
		int leftSize = mid;
		int rightSize = size - mid;
		int [] left = new int[leftSize];
		int [] right = new int[rightSize];
		
		//populate left
		for(int i=0; i<mid; i++)
		{
			left[i] = c[i];
		}
		//populate right
		for(int i=mid; i<size; i++)
		{
			right[i- mid] = c[i];
		}
		mergeSort(left);
		mergeSort(right);
		//merge
		merge(left,right,c);
	}
	public static void merge(int[] left, int[] right, int[] c)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i=0;//index for left
		int j=0;//index for right
		int k=0;//index for a
		while(i<leftSize && j<rightSize)
		{
			if(left[i] <= right[j])
			{
				c[k] = left[i];
				i++;
				k++;
			}
			else 
			{
				c[k] = right[j];
				j++;
				k++;
			}
			mergeCount++;
		}
		while(i<leftSize)
		{
			c[k] = left[i];
			i++;
			k++;
		}
		while(j<rightSize)
		{
			c[k] = right[j];
			j++;
			k++;
		}
	}
	
//Quick Sort 
	public static void quickSort(int[] d, int left, int right)
	{
		int index = partition(d,left,right);
		if(left < index - 1)
		{
			quickSort(d,left,index-1);
		}
		if(index < right)
		{
			quickSort(d, index+1, right);
		}
	}
	
	public static int partition(int[] d, int left, int right)
	{
		int i = left;
		int j = right;
		
		int pivot = d[(left+right)/2];
		while (i<=j)
		{
			while(d[i] < pivot)
			{
				i++;//correct position so move forward
				quickCount++;
			}
			while(d[j] > pivot)
			{
				j--;//correct position
				quickCount++;
			}
			if(i<=j)
			{
				int temp = d[i];
				d[i] = d[j];
				d[j] = temp;
				i++;
				j--;
			}
			quickCount++;
		}
		return i;
	}	
	
	public static Integer[] Array1, Array2, Array3, Array4;
	public static void RandomArray(int n)
	{
		Random r = new Random();
		Array1 = new Integer[n];
		Array2 = new Integer[n];
		Array3 = new Integer[n];
		Array4 = new Integer[n];
		
		for(int i = 0; i < n; i++)
		{
			Array1[i] = r.nextInt();
			Array2[i] = Array1[i];
			Array3[i] = Array1[i];
			Array4[i] = Array1[i];
		}
	}
}
