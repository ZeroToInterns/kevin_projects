public class BinaryTree 
{
	private Node root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data = data;
		}
		
	}
	
	//find the Node with the give data value
	public Node find(int data)
	{
		return find(root, data);
	}
	
	//recursive helper function for the find method
	private Node find(Node root, int data)
	{
		//find the node
		if(root == null || root.data == data)
		{
			return root;
		}
		if(root.data > data)
		{
			return find(root.left, data);
		}
		else
		{
			return find(root.right,data);
		}
	}
	
	//inserts a new node into the BST
	public void insert(int newData)
	{
        Node newNode = new Node(newData);
        if(root ==  null)
        {
        	root = newNode;
        	return;
        }
        Node temp = root;
        while(temp != null)
        {
        	if(newNode.data < temp.data)
        	{
        		temp = temp.left;
        	}
        	else if(newNode.data > temp.data)
        	{
        		temp = temp.right;
        	}
        }
        
        if(newData < 0)
        {
        	temp.right = newNode;
        }
        else
        {
        	temp.left= newNode;
        }
    }
	
	
	
	//prints the inorder traversal of the BST
	public void printInOrder() 
	{
		
	}
	
	//prints the Preorder traversal of the BST
	public void printPreOrder()
	{
		
	}
	
	//prints the PostOrder traversal of the BST
	public void printPostOrder()
	{
		
	}
}
