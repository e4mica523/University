/*
 * Written by Eric Formica
 * Double Linked List
 * January 21th 2015
 * I used JJ's source code as a guide to try to get it to work
 */
public class GenDoubleLinkedList<T>
{
	private class ListNode //internal method
	{
		//instance variables data and the next and current links
		private T data;
		private ListNode nextLink;
		private ListNode prevLink;
		
		public ListNode() //default constructor
		{
			data = null;
			nextLink = null;
			prevLink = null;
		}
		
		//parameterized constructor
		public ListNode(T newData, ListNode newNext, ListNode newPrev)
		{
			data = newData;
			nextLink = newNext;
			prevLink = newPrev;
		}
	}
	
	private ListNode head;
	private ListNode current;
	
	//constructor
	public GenDoubleLinkedList()
	{
		head = new ListNode();
		current = head;
	}
	
	//required methods
	public void goToNext() //goes to the next position in the node
	{
		if(current != null)
		{
			current = current;
			current = current.nextLink;
		}
		else if(head != null)
		{
			System.out.println("Error!! Out of Bounds!!"); //no more left error
			System.exit(0);
		}
		else
		{
			System.out.println("This list has no values."); //empty list error
			System.exit(0);
		}	
	}
	
	public void goToPrev()
	{
		if(current != null)
		{
			current = current;
			current = current.prevLink;
		}
		else if(head != null)
		{
			System.out.println("Error!! Out of Bounds!!"); //no more left error
			System.exit(0);
		}
		else
		{
			System.out.println("This list has no values."); //empty list error
			System.exit(0);
		}	
	}
	
	public T getDataAtCurrent() //gets and returns the data in the current position
	{
		T result = null;
        if (current != null)
        {	
            result = current.data;
        }    
        else
        {
            System.out.println("Error. No Node has been selected to get"); //unable to find the node
            System.exit(0);
        }
        return result;
		
	}
	
	public void setDataAtCurrent(T newData) //set data method
	{
		if(current != null)
		{
			current.data = newData;
		}
		if(current == head)
		{
			current.data = newData;
		}
		else
		{
			System.out.println("Error. Cannot set if no node has been selected"); //if can't find, there is an error
			System.exit(0);
		}
	}
	
	public void insertNodeAfterCurrent(T newData) //inserting a new node data value
	{
		ListNode newNode = new ListNode();
        newNode.data = newData;
        if (current != null)
        {
            newNode.nextLink = current.nextLink;
            newNode.prevLink = current;
            current.nextLink = newNode;
        } 
        else if (head != null)
        {
            System.out.println(
                    "Error Out of Bounds or not initialized.");
            System.exit(0);
        }
        else
        {
            System.out.println(
                    "Error the list is empty");
            System.exit(0);
        }
	}
	
	public void deleteCurrentNode() //removing the selected node
	{
		if ((current != null) && (current != null)) 
        {
            current.prevLink.nextLink = current.nextLink;
            current.nextLink.prevLink = current.prevLink;
            current = current.nextLink;
        } 
        else if ((current != null) && (current == null)) 
        {//At head node
            head = current.prevLink;
            current = head;
        } 
        else //current == null
        {
            System.out.println(
                    "Error! Can't delete with an empty list");
            System.exit(0);
        }
		
	}
	
	public void showList() //show the listNode
	{
		ListNode position = head;
	    while (position != null)
	    {
	    	System.out.println(position.data);
	        position = position.nextLink;
	    }
	}
	
	public boolean inList(T target) //determines whether the data is in the list
	{
		 ListNode position = head;
	        while ((position != null))
	        {
	            T dataAtPosition = position.data;
	            if (dataAtPosition.equals(target))
	            {	
	                return true; //if it is return true
	            }    
	            else
	            {	
	                position = position.nextLink;
	            }    
	        }
	        return false; //if not return false
	}
}
