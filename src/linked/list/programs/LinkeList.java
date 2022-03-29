package linked.list.programs;

/**
 * 
 * 
 * @author shara
 * 
 * Implementation of LinkedList performs following operations
 * 1.add elements to the linked list
 * 2.Move the last element in the linked list to the first - Upgrad question
 *
 */
public class LinkeList {
	
	Node head;
	Node tail;
	Node prev;
	public void moveLastElementToHead()
	{
	
		if(head == tail || head == null){
			return;
		}
		
		/** ---1.
		 * Node current = head;
		while(current.next != null){
		    if(current.next.data ==  tail.data){
		        Node temp1 = new Node(tail.data);
		        temp1.next = head;
		        head = temp1;
		        current.next = null;
		        tail = current;
		        break;
		    }
		  current = current.next;
		}**/
		
		/**
		 * 2.
		 * Node temp = head;
		 * while(temp.next != null)
		 * {
		 * if(temp.next == tail){
		 * 		
		 * 		Node temp1 = head;
		 * 		head = tail;
		 * 		head.next = temp1;
		 * 		tail = temp;
		 * 		tail.next = null;
		 * 		break;
		 * }
		 * 		temp = temp.next;
		 * }
		 * 
		 * 
		 */
		
		
		Node temp= head;
		head = tail;
		head.next = temp;
		prev.next = null;
		tail = prev;
	}
	public void push(int data)
   	 {
		//TODO
		if(head == null){
		    head = new Node(data);
		    return;
		}
		 Node current = head;
		 while(current.next != null){
		     current = current.next;
		 }
		 current.next = new Node(data);
		 prev = current;
		 tail = current.next;
    }
	public void printList()
   	{
        		//TODO  
        		if(head == null){
        		    return;
        		}
        		Node current = head;
        		while(current != null){
        		    System.out.printf("%d ", current.data);
        		    current = current.next;
        		}
   	}
	
class Node
	{
		int data;
		Node next;
		Node(int d) 
		{
			this.data = d; 
			this.next = null; 
		}
	}


}
