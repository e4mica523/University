/*
 * Written by Eric Formica
 * Star Wars Heap
 * April 8th 2015
 *
 */
public class StarWarsHeap
{
	private Sheep[] heap; //creates an array of sheep
	private int size;
	private int maxSize;
	
	public minHeap(int maxSize) //constructor
	{
		this.maxSize=maxSize;
		this.size=0;
		this.heap=new Sheep[this.maxSize+1];
	}
	public boolean isEmpty() //checks to see if it is empty
	{
		return this.size==0;
	}
	public Sheep peek() 
	{
		if(this.isEmpty())
		{
			throw new IllegalStateException(); //if empty throw exception
		}
		return heap[1];
	}
	public String toString()
	{
		return Arrays.toString(heap); //calls the toString
	}
	public boolean hasParent(int i) //checks if it has a parent
	{
		return i>1;
	}
	public int leftIndex(int i)
	{
		return i*2;
	}
	public int rightIndex(int i)
	{
		return i*2 +1;
	}
	public boolean hasLeftChild(int i)
	{
		return leftIndex(i)<=this.size;
	}
	public boolean hasRightChild(int i)
	{
		return rightIndex(i)<=this.size;
	}
	public int parentIndex(int i)
	{
		return i/2;
	}
	public Sheep parent(int i)
	{
		return heap[parentIndex(i)];
	}
	public void swap(int index1,int index2) //swaps the two sheep
	{
		Sheep temp=heap[index1];
		heap[index1]=heap[index2];
		heap[index2]=temp;
	}
	public void climbUp() //same as bubble up
	{
		int index=this.size;
		while(hasParent(index) && parent(index).getWeight()>heap[index].getWeight())
		{
			swap(index,parentIndex(index));
			index=parentIndex(index);
		}
	}
	public void climbDown() //same as bubble down
	{
		int index=1;
		while(hasLeftChild(index))
		{
			int small=leftIndex(index);
			if(hasRightChild(index) && heap[leftIndex(index)].getWeight()> heap[rightIndex(index)].getWeight())
			{
				small=rightIndex(index);
			}
			if(heap[index].getWeight() > heap[small].getWeight())
			{
				swap(index,small);
			}
			else
			{
				break;
			}
			index=small;
		}
	}
	public Sheep removeSheep() //removes sheep from the heap
	{
		Sheep result=peek();
		heap[1]=heap[this.size];
		heap[this.size]=null;
		this.size--;
		climbDown(); //calls bubble down
		return result;
	}
	public void addSheep(Sheep newSheep) //adds the sheep
	{
		this.size++;
		int index=size;
		heap[index]=new Sheep(newSheep.getName(), newSheep.getWeight()); //gets the name and weight
		
		climbUp();
	}
	public void sheepRollCall()
	{
		for(int i=1;i<=this.size/2;i++)
		{
			if(heap[i]!=null && heap[2*i]!=null && heap[2*i+1]!=null)System.out.println("PARENT: "+heap[i].toString()+" ; LEFT CHILD: "+heap[2*i].toString()+" ; RIGHT CHILD: "+heap[2*i+1].toString());
		}
	}
	
	public Sheep[] sheepHeapSort() //sorts the heap
	{
		Sheep[] newSheep=new Sheep[size];
		int i=0;
		while(size>0)
		{
			newSheep[i]=this.removeSheep();
			i++;
		}
		return newSheep;
	}

}
