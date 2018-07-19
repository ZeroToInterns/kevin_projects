class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next, prev;
 
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
 
    /* Function to reverse a Doubly Linked List */
    void reverse() 
    {
        while(head != null)
        {

            Node i = head.prev;

            head.prev = head.next;

            head.next = i;

            if (head.prev == null){

                return head;

            }

            head = head.prev;

        }

        return head;
    }
 
    /* UTILITY FUNCTIONS */
    /* Function to insert a node at the beginging of the Doubly Linked List */
    void push(int new_data) {
        /* allocate node */
        Node new_node = new Node(new_data);
 
        /* since we are adding at the begining, 
         prev is always NULL */
        new_node.prev = null;
 
        /* link the old list off the new node */
        new_node.next = head;
 
        /* change prev of head node to new node */
        if (head != null) {
            head.prev = new_node;
        }
 
        /* move the head to point to the new node */
        head = new_node;
    }
 
    /* Function to print nodes in a given doubly linked list 
     This function is same as printList() of singly linked lsit */
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 
        /* Let us create a sorted linked list to test the functions
         Created linked list will be 10->8->4->2 */
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);
 
        System.out.println("Original linked list ");
        list.printList(head);
 
        list.reverse();
        System.out.println("");
        System.out.println("The reversed Linked List is ");
        list.printList(head);
    }
}