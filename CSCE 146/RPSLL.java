public class RPSLL<T> extends RPSTourney
{
	class ListNode 
		{
	        private T data;
	        private ListNode link;
	        public ListNode() 
	        {
	            link = null;
	            data = null;
	        }
	        public ListNode(T newData, ListNode linkValue) 
	        {
	            data = newData;
	            link = linkValue;
	        }
	    }
		
		protected ListNode head;
	    protected ListNode tail;
	    
	    
	    public RPSLL() 
	    {
	        head = null;
	        tail = null;
	    }
	    
	    
	    public void addANodeToStart(T addData) 
	    {
	        head = new ListNode(addData, head);
	        if ((head == head.link) && (head != null))
	            //if current is at old start node
	            tail = head;
	    }
	    
	    
	    
	    /**
	     * Sets iterator to beginning of list.
	     */
	    public void resetIteration() 
	    {
	        tail = head;
	        tail = null;
	    }
	    
	    
	    /**
	     * Returns true if iteration is not finished.
	     */
	    public boolean moreToIterate() 
	    {
	        return head != null;
	    }
	    
	    
	    /**
	     * Advances iterator to next node.
	     */
	    public void goToNext() 
	    {
	        if (head != null) 
	        {
	            tail = head;
	            head = head.link;
	        } 
	        else if (head != null) 
	        {
	            System.out.println(
	                    "Iterated too many times or uninitialized iteration.");
	            System.exit(0);
	        } 
	        else 
	        {
	            System.out.println("Iterating with an empty list.");
	            System.exit(0);
	        }
	    }
	    
	    
	    /**
	     * Returns the data at the current node.
	     */
	    public T getDataAtCurrent() 
	    {
	        T result = null;
	        if (head != null)
	            result = head.data;
	        else {
	            System.out.println(
	                    "Getting data when current is not at any node.");
	            System.exit(0);
	        }
	        return result;
	    }
	    
	    
	    
	    /**
	     * Replaces the data at the current node.
	     */
	    public void setDataAtCurrent(T newData) 
	    {
	        if (head != null) 
	        {
	            head.data = newData;
	        } else {
	            System.out.println(
	                    "Setting data when current is not at any node.");
	            System.exit(0);
	        }
	    }
	    /**
	     * Inserts a new node containing newData at the end of the list.
	     * Precondition: None
	     */
	    public void insert(T newData)
	    {
	    	ListNode newNode = new ListNode();
	    	newNode.data = newData;
	    	if(head == null)
	    	{
	    		head = newNode;
	    		tail = head;
	    		return;
	    	}
	    	ListNode position = head;
	    	ListNode prevPos = null;
	    	while(position != null)
	    	{
	    		prevPos = position;
	    		position = position.link;
	    	}
	    	position = newNode;
	    	prevPos.link = position;
	    }
	    
	    /**
	     * Inserts a new node containing newData after the current node.
	     * The current node is the same after invocation as it is before.
	     * Precondition: List is not empty; current node is not
	     * beyond the entire list.
	     */
	    public void insertNodeAfterCurrent(T newData) 
	    {
	        ListNode newNode = new ListNode();
	        newNode.data = newData;
	        if (tail != null) 
	        {
	            newNode.link = tail.link;
	            tail.link = newNode;
	        } 
	        else if (head != null) 
	        {
	            System.out.println(
	                    "Inserting when iterator is past all " +
	                    "nodes or is not initialized.");
	            System.exit(0);
	        } else 
	        {
	            System.out.println(
	                    "Using insertNodeAfterCurrent with empty list.");
	            System.exit(0);
	        }
	    }
	    
	    
	    
	    /**
	     * Deletes the current node. After the invocation,
	     * the current node is either the node after the
	     * deleted node or null if there is no next node.
	     */
	    public void deleteCurrentNode() 
	    {
	        if ((head != null) && (tail!= null)) 
	        {
	            tail.link = head.link;
	            head = tail.link;
	        } 
	        else if ((head != null) && (tail== null)) 
	        {//At head node
	            head = tail.link;
	            tail = head;
	        } 
	        else //current == null
	        {
	            System.out.println(
	                    "Deleting with uninitialized current or an empty list.");
	            System.exit(0);
	        }
	    }
	    
	    
	    
	    /**
	     * Displays the data on the list.
	     */
	    public void showList() 
	    {
	        ListNode position = head;
	        while (position != null) 
	        {
	            System.out.println(position.data);
	            position = position.link;
	        }
	    }
	    
	    
	    /**
	     * Returns the number of nodes on the list.
	     */
	    public int length() 
	    {
	        int count = 0;
	        ListNode position = head;
	        while (position != null) 
	        {
	            count++;
	            position = position.link;
	        }
	        return count;
	    }
	    
	    
	    /**
	     * Sees whether target is on the list.
	     */
	    public boolean onList(T target) 
	    {
	        return find(target) != null;
	    }
	    
	    
	// Returns a reference to the first node containing the
	// target data. If target is not on the list, returns null.
	    private ListNode find(T target) 
	    {
	        boolean found = false;
	        ListNode position = head;
	        while ((position != null) && !found) 
	        {
	            T dataAtPosition = position.data;
	            if (dataAtPosition.equals(target))
	                found = true;
	            else
	                position = position.link;
	        }
	        return position;
	    }
}

