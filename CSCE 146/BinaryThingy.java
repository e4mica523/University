
public class BinaryThingy<T extends Comparable<T>>
{
	private class Node
	{
		private T data;
		private Node leftChild;
		private Node rightChild;
		public Node(T aData)
		{
			this.data = aData;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	private Node root;
	public BinaryThingy()
	{
		root = null;
	}
	public void insert(T data)
	{
		if(root == null)
		{
			root = new Node(data);
		}
		else
			insert(root,data);
	}
	public Node insert(Node aNode, T data)
	{
		if(aNode == null)
		{
			aNode = new Node(data);
		}
		else if(data.compareTo(aNode.data)<0)//Go left
		{
			aNode.leftChild = insert(aNode.leftChild,data);
		}
		else if(data.compareTo(aNode.data)>=0)//Go right
		{
			aNode.rightChild = insert(aNode.rightChild,data);			
		}
		return aNode;
	}
	public boolean search(T data)
	{
		return recursiveSearch(root,data);
	}
	public boolean recursiveSearch(Node aNode, T data)
	{
		if(aNode == null)
			return false;
		if(aNode.data.compareTo(data)==0)
			return true;
		else if(aNode.data.compareTo(data)>0)
			return recursiveSearch(aNode.rightChild,data);
		else
			return recursiveSearch(aNode.leftChild,data);
		
	}
	public Node deleteMinFromTree(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode;
		aNode.leftChild = deleteMinFromTree(aNode.leftChild);
		return aNode;
	}
	public Node findMinInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
		
	}
	public void delete(T value)
	{
		root = delete(root,value);
	}
	public Node delete(Node aNode, T value)
	{
		//Find the value
		if(aNode == null)
			return null;
		if(value.compareTo(aNode.data)<0)
			aNode.leftChild = delete(aNode.leftChild,value);
		else if(value.compareTo(aNode.data)>0)
			aNode.rightChild = delete(aNode.rightChild,value);
		else //Value is found
		{
			if(aNode.rightChild == null)
				return aNode.leftChild;
			if(aNode.leftChild == null)
				return aNode.rightChild;
			Node temp = aNode;
			aNode = findMinInTree(aNode.rightChild);
			aNode.rightChild = deleteMinFromTree(aNode.rightChild);
			aNode.leftChild = temp.leftChild;
		}
		return aNode;
	}

	public void printInorder()
	{
		printInorder(root);
	}
	public void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		if(aNode.leftChild != null)
		{
			printInorder(aNode.leftChild);
		}
		System.out.println(aNode.data.toString());
		if(aNode.rightChild != null)
		{
			printInorder(aNode.rightChild);			
		}
		
		return;
	}
}

