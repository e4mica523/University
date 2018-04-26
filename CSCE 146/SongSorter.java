/*
 * Written by Eric Formica
 * Song Sorter
 * April 15th 2015
 *
 */
public class SongSorter {
	private Song[] heap;
	private int maxSize;
	private int size;

	public SongSorter() //default constructor
	{
		maxSize = 900;
		size = 0;
		heap = new Song[maxSize + 1];
	}

	public SongSorter(int aSize) // constructor
	{
		heap = new Song[aSize];
		size = 0;
	}
	public void bubbleDown() {
		// System.out.println("Yo we here");
		int index = 0;
		int bigIndex = index * 2 + 1;
		// size = 9;
		System.out.println("Just a sorting error passing through");
		while (index * 2 + 1 < size)// While there is a left child
		{
			// Find smallest child
			System.out.println("Just a sorting error passing through");
			if ((index * 2 + 2) < size
					&& (heap[rightIndex(index)].getDuration() > heap[leftIndex(index)]
							.getDuration())) // Right was bigger than left so
												// change it
			{
				bigIndex = index * 2 + 2;
			}
			if (heap[index * 2 + 1].getDuration() < heap[bigIndex]
					.getDuration())// If current index is greater than smaller
									// index
			{
				// SWAP
				Song temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			} else {

				break;// We're done!
			}
			index = bigIndex;// Update the index to continue
		}

	}

	public int leftIndex(int i) {
		return i * 2 + 1;
	}

	public int rightIndex(int i) {
		return i * 2 + 2;
	}

	public void insert(Song s) {
		if (size >= heap.length) {
			System.out.println("Max size of heap has been reached");
			return;
		}
		heap[size] = s;
		bubbleUp();
		size++;
	}

	private void bubbleUp() { //bubble up method
		int index = this.size;
		while (index > 0 && (this.heap[index / 2].getDuration()
				< this.heap[index].getDuration())) {
			// swap
			Song temp = heap[index / 2];
			heap[index / 2] = heap[index];
			heap[index] = temp;
			index = index / 2;
		}
	}

	public Song removeSong() {
		// System.out.println("We are here");
		Song firstVal = heap[0];
		// heap[0] = null;
		for (int i = 0; i < heap.length - 1; i++) {
			heap[i] = heap[i + 1]; // shift up
		}
		heap[heap.length - 1] = null; // sets the empty spot to null
		size--;

		bubbleDown();
		return firstVal;
		// return "";

	}

	
	//AFTER THE ENTIRE LAB, UNABLE TO SORT THE ARRAY
	public static Song[] sortByDuration(Song[] s)
	{

		for(int x = 0; x < s.length; x++)
		{
			//insert(s[x]);
		}
		
		SongSorter newS = new SongSorter();

		for (int i = 0; i < s.length; i++) {

			System.out.println(newS.removeSong());
		}

		return s;
	}

}
