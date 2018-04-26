/*
 * Written by Eric Formica
 * Lab 08
 * March 18th 2015
 *
 */
public class IntBSTree{
	private class Node
	{
		private int data;
		private Node leftChild;
		private Node rightChild;
		public Node(int aData)
		{
			this.data = aData;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	private Node root;

	public IntBSTree()
	{
		root = null;
	}
	
	public void insert(int data)
	{
		//Code this
		if(root == null)
		{
			root = new Node(data);
		}
		else
		{
			insert(root, data); //calls the recursive method
		}
	}
	
	//recursive method to help
	public Node insert(Node aNode, int data)
	{
		Integer d = data;
		if(aNode == null)
		{
			aNode = new Node(data);
		}
		else if(d.compareTo(aNode.data)<0)//Go left
		{
			aNode.leftChild = insert(aNode.leftChild,data);
		}
		else if(d.compareTo(aNode.data)>=0)//Go right
		{
			aNode.rightChild = insert(aNode.rightChild,data);			
		}
		return aNode; //returns the node
	}
	
	public void printInorder()
	{
		//Code this
		printInorder(root); //call the recursive method and passes root
	}
	
	//recursive method to help
	public void printInorder(Node aNode)
	{
		
		if(aNode == null)
			return;
		if(aNode.leftChild != null)
		{
			printInorder(aNode.leftChild); //go left
		}
		System.out.println(aNode.data); //prints the value
		if(aNode.rightChild != null)
		{
			printInorder(aNode.rightChild);		 //go right	
		}
		
		return;
	}

	public int getDepth(int value)
	{
		//Code this
		int depth = 0;
		depth = getDepth(root, value, depth); //calls the recursion
		return depth; //sends back the depth
		
	}
	
	public int getDepth(Node aNode, int value, int depth)
	{
		Integer d = value;
		if(aNode == null)
		{
			return -1; //returns -1 if not there
		}
		else
		{	
			if(d.compareTo(aNode.data)==0) //if there, return the depth
				return depth;
			else if(d.compareTo(aNode.data)<0)//Go left
			{
				depth ++;
				return  getDepth(aNode.leftChild,value,depth); //recursive call
			}
			else//Go right
			{
				depth ++;
				return getDepth(aNode.rightChild,value, depth); //recursive call	
			}
		}	
	}
	
	

}

