class MyLinkedList 
{
    Node head;
    Node end;
	class Node
	{ 
		int data;
		Node next;
		Node(int x) 
        {
           data = x;
           this.next = null;
        }
	}
	
    /** Initialize your data structure here. */
    public MyLinkedList() 
    {

      this.head = null;
      this.end = null;      
        

    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) 
    {
        Node temp = head;
        while( temp != null && index > 0)
        {
        	temp = temp.next;      	
        }
        return temp.data;
    }
    
    /** Gets the length of the linked list**/
    public int getSize()
	{
		Node temp = head;
		int count = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			count++;
		}
		
		return count;
	}
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) 
    {
    	Node newNode = new Node(val);
    	if(this.head == null)
    	{
    		newNode.next = head;
    		head = newNode;
    		end = newNode;
    	}
    	else
    	{
    		newNode.next = head;
    		head = newNode;
    	}    	
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) 
    {
    	Node newNode = new Node(val);
    	
        if(this.head == null)
        {
            this.head = newNode;
            this.end = newNode;
        }
        else 
        {
        	this.end.next = newNode;
        	this.end = newNode;
        }

        	      
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) 
    {
    	Node newNode = new Node(val);
       
    	if(this.head == null && index == 0) 
		{
			this.head = newNode;
			this.end = newNode; 
		}
    	else if(index < 0 || index > this.getSize())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	else if(index == this.getSize())
		{
			this.addAtHead(newNode.data);
		}
    	else 
    	{
    		Node temp = head;
    		for(int i = 0; i < index - 1; i++)
			{
				temp = temp.next;
			}
			newNode.next= temp.next;
			temp.next = newNode;			
    	}
    }
    

	/** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) 
    {
        
    }
    
    public void printLinkedList()
    {
    	Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
    }
   
    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
