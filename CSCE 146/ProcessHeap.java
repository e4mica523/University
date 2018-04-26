/*
 * Eric Formica
 * 3/25/15
 * ProcessHeap
 */
public class ProcessHeap {
	int size;
	Process[] heap;

	public ProcessHeap() //default constructor
	{
		this.heap = new Process[10];
		size = 0;
	}

	public ProcessHeap(int aSize)
	{
		heap = new Process[aSize];
		size = 0;
	}

	// insert method
	public void insert(Process value)
	{
		if (size >= heap.length) {
			System.out.println("Max size of the heap has been reached");
			return;
		}
		heap[size] = value;
		bubbleUp();
		size++;
	}

	private void bubbleUp() //bubbleup method
	{
		int index = this.size;
		while (index > 0 && (this.heap[index/2].getPriority() < this.heap[index].getPriority()))
		{
			// swap
			Process temp = heap[index / 2];
			heap[index / 2] = heap[index];
			heap[index] = temp;
			index = index / 2;
		}
	}

	public void bubbleDown()
	{
		
		int index = 0;
		while(index*2+1 < size)//While there is a left child
		{
			//Find smallest child
			int bigIndex = index*2+1;
			if(index*2+2 < size &&
			heap[index*2+2].getPriority() > heap[index*2+1].getPriority()) //Right was bigger than left so change it
			{
				bigIndex = index*2+2;
			}
			System.out.println(index + "" + bigIndex);
			System.out.println(heap[1].getName() + " " + heap[0].getName());
			if(heap[index].getPriority() < heap[bigIndex].getPriority())//If current index is greater than smaller index
			{
				//SWAP
				Process temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
			{
				break;//We're done!
			}
			index = bigIndex;//Update the index to continue
		}
		//version 2
		/*int index = 0;
		int smallIndex = index * 2 + 2;
		while (index <= size)// as long as there is a left child
		{
			// find where the smallest value is
			int largeIndex = index * 2 + 1;
			if (this.heap[smallIndex].getPriority() > this.heap[largeIndex]
					.getPriority()) 
			{
				if(heap[index].getPriority() < this.heap[largeIndex].getPriority())
				{	
					Process temporary = heap[index];
					heap[index] = heap[smallIndex];
					heap[smallIndex] = temporary;
				}	
			}
			if (this.heap[index * 2].getPriority() > this.heap[smallIndex]
					.getPriority())
			{
				// swap the values
				Process temporary = heap[index];
				heap[index] = heap[largeIndex];
				heap[largeIndex] = temporary;
			}
		}
		*/
	}

	public Process peek()
	{
		if (heap == null)
		{
			return null;
		}
		return heap[0];
	}

	public Process remove()
	{
		Process firstVal = peek();
		heap[0] = null;
		size--;

		bubbleDown();
		return firstVal;
	}

	public void printHeap()
	{

		for (Process p : heap)
		{
			if (p == null)
				break;
			System.out.println(p.toString());
		}
	}

	public boolean isEmpty() {
		return this.heap[0] == null;
	}

	public static void heapSort(ProcessHeap aHeap)
	{
		ProcessHeap newP = new ProcessHeap(aHeap.size);
		for (int i = 0; i < aHeap.size; i++) {
			System.out.println(newP.remove());
		}
		aHeap = newP;
	}

}
