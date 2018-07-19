public class LinkedList 
{
	Node head;
	Node end; 
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		Node newNode = list.new Node(5);
		Node newNode2 = list.new Node(6);
		Node newNode3 = list.new Node(8);
		
		list.add(newNode);
		list.add(newNode2);
		list.add(newNode3);
		
		Node newNode4 = list.new Node(7);
		list.insert(newNode4, 2);
		list.printlist();
		
		System.out.println(list.head.data);
		System.out.println(list.end.data);
	}
	
	public LinkedList()
	{
		this.head = null;
		this.end = null;
	}
	
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	
	// Add (adds an element to the end of the linked list)
	public void add(Node newNode) //Already have a node created or public void add(int data) and creating a node inside the the method
	{
		if(this.head == null) //Initializes the head and end if node is empty
		{
			this.head = newNode;
			this.end = newNode;
		}
//		else //linked list is not empty
//		{
//			Node temp = head; //point to same object that the head is currently pointing to
//			while(temp.next != null)
//			{
//				temp = temp.next;
//			}
//			temp.next = newNode;
//			this.end = newNode;
//		}
//		or
		this.end.next = newNode;
		this.end = newNode;
	}
	
	public void insert(Node newNode,int index)//Already have a node created or public void add(int data) and creating a node inside the the method
	{
			if(this.head == null && index == 0) //if linked list is empty
			{
				this.head = newNode;
				this.end = newNode; 
			}
			else if(index > this.getSize() || index < 0) //index is invalid
			{
				throw new IndexOutOfBoundsException();
			}
			else if(index == this.getSize())
			{
				this.add(newNode);
			}
			else //linked list is not empty and index to insert is valid
			{
				Node temp = head;
				for(int i = 0; i < index - 1; i++)
				{
					temp = temp.next;
				}
				newNode.next= temp.next;
				temp.next = newNode;					
			}
		// 5 -> 6 -> 8 -> Null
	}
	
	//Delete (Deletes any element from the linked list) Deletes it by dereferencing the nodes
	public void deleteNode(Node node)
	{
		if(head.data == node.data)
		{
			head = head.next;
		}
		Node temp = head;
		while(temp.next.data != node.data)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
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
	
	public void printlist()
	{
		Node temp = this.head;
		for(int i = 0; i < this.getSize(); i++)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}