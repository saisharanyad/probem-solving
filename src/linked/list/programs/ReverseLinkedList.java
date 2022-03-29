package linked.list.programs;

/**
 * 
 * @author shara
 * 1. Reverse a LL in 3 different ways.1&2 ways are similar with O(n2) TC. 3 way is O(n) TC.
 */

public class ReverseLinkedList {
	
	Node head;
	Node tail;
	Node newHead;
	
	
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
	
	
	//Create a LL
		public void push(int data){
			
				//TODO
				if(head == null){
				    head = new Node(data);
				    return;
				}
				
				 Node temp = head;
				 while(temp.next != null){
					 temp = temp.next;
				 }
				 temp.next = new Node(data);
				 tail = temp.next;
		    
		}
		
		
		public void reverseLL1(){
			
			if(head == null || head == tail){
				return;
			}
						
			Node curr = tail, temp = head;
			Node newTemp;
			newHead = new Node(curr.data);
			newTemp = newHead;
			
			
			while(true){
				
				while(temp.next != null){
					
					if(temp.next == curr){
						curr = temp;
						newTemp.next = new Node(curr.data);
						newTemp = newTemp.next;
						break;
					}
					temp = temp.next;
				}
				
				if(head == curr){
					break;
				}
				temp = head;
			}
		}
		
		public void reverseLL2(){
			
			if(head == null || head == tail){
				return;
			}
						
			Node curr = tail, temp = head;
					
			while(true){
				
				while(temp.next != null){
					
					if(temp.next == curr){
						curr.next = temp;
						temp.next = null;
						curr = temp;
						break;
					}
					temp = temp.next;
				}
				
				if(head == curr){
					break;
				}
				temp = head;
			}
		}
		
		public void reverseLL3(){
			
			if(head == null){
				return;
			}
			Node temp = head,curr = null,prev = null;
			
			while(temp != null){
				curr = temp;
				temp = temp.next;
				curr.next = prev;
				prev = curr;
			}
			head = curr;
			
		}
		
				
	
	public static void main(String args[]){
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		//create a LinkedList
		reverseLinkedList.push(6);
		reverseLinkedList.push(5);
		reverseLinkedList.push(60);
		reverseLinkedList.push(68);
		reverseLinkedList.push(67);
		System.out.println("Print elements in LL");
		
		Node temp = reverseLinkedList.head;
			System.out.println(temp.data);
			while(temp.next != null){
				temp = temp.next;
				System.out.println(temp.data);
				
			}
		
		
		
		System.out.println("Print elements in reverse");
		//reverseLinkedList.reverseLL1();
		//reverseLinkedList.reverseLL2();---doesn't work
		reverseLinkedList.reverseLL3();
		Node temp1 = reverseLinkedList.head;
		System.out.println(temp1.data);
		while(temp1.next != null){
			temp1 = temp1.next;
			System.out.println(temp1.data);
			
		}
	}

}
