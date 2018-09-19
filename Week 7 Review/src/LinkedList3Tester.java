
public class LinkedList3Tester 
{

    public static void main(String[] args)
    {
    	MyLinkedList linkedList = new MyLinkedList();
    	linkedList.addAtHead(1);
    	linkedList.printLinkedList();
    	
    	linkedList.addAtTail(3);
    	linkedList.printLinkedList();
    	linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
    	linkedList.printLinkedList();
//    	linkedList.get(1);            // returns 2
//    	linkedList.deleteAtIndex(1);  // now the linked list is 1->3
//    	linkedList.get(1);            // returns 3
    	
    }

}
