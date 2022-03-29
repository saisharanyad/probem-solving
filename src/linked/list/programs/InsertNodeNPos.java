package linked.list.programs;

import linked.list.programs.DoubleLinkedList.Node;

/**
 * 
 * @author shara
 * 1.Create a LL
 * 2.Insert node at nth position in a LL - insertFirst,insertLast,insert
 * 3.Delete node at nth position in a LL - deleteFirst,deleteLast,delete
 * 4.Print elements - Iterative
 * 
 */
public class InsertNodeNPos {
	
	Node head;
	Node tail;
	
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
	
	
	//Insert node at nth position in a LL
	public void insertNode(int pos,int data){
		
		int count = 1;
		boolean insert = false;
		if(head == null){
			return;
		}
		Node newNode;
		Node temp = head;
		
		//insertFirst - O(1)
		if(count == pos){
			newNode = new Node(data);				
			newNode.next = temp;
			head = newNode;
			insert = true;
			return;
		}
		
		//insert at nth pos - O(n)
		while(temp.next != null){
			++count;
			if(count == pos){
				Node replace = temp.next;
				newNode = new Node(data);	
				temp.next = newNode;
				newNode.next = replace;
				insert = true;
				break;
			}
			
			temp = temp.next;
		}
		
		
		//insertLast - O(n)
		if(pos == (++count)){
			newNode = new Node(data);
			temp.next = newNode;
			insert = true;
		}
		
		if(!insert){
			System.out.println("Cannot insert node at this position::"+pos);
		}
		
	}
	
	
	//InsertNode::2nd way ---- Simple code
	public void insertNodeTwo(int pos,int data){
		if(head == null)return;
		
		int count = 0;
		Node temp = head,prev = null;
		
		while(temp != null){
			++count;
			if(count == pos){
				break;
			}
			prev = temp;
			temp = temp.next;
			
		}
		
//insertFirst - O(1) ,insertLast - O(1),traversal -- O(n), insert at nth position - O(n)
	
			Node newNode = new Node(data);
			newNode.next = temp;
			if(count == 1){
				head = newNode;
			}else{
				prev.next = newNode;
			}
	}
	
	
	//Delete node at nth position in a LL
	public void deleteNode(int pos){
			
			/**int count = 1;
			if(head == null)return;
			
			//deleteFirst - O(1)
			if(count == pos){
				Node nextHead = head.next;
				head = nextHead;
			}
			//delete node at nth position,deleteLast - O(n)
			Node temp = head;
			while(temp.next != null){
				++count;
				if(count == pos){
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
			}**/
			
			//deleteFirst - O(1) , deleteLast - O(n) , delete - O(n)
			int count = 0;
			Node temp = head,prev = null;
			while(temp != null){
				++count;
				if(count == pos){
					break;
				}
				prev = temp;
				temp = temp.next;
			}
			
			temp = temp.next;
			if(prev != null){
				prev.next = temp;
			}else{
				head = temp;
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
	
	
	
	public static void main(String args[]){
		
		InsertNodeNPos insertNodeNPos = new InsertNodeNPos();
		
		//create a LinkedList
		insertNodeNPos.push(6);
		insertNodeNPos.insertNode(1,90);
		insertNodeNPos.push(5);
		insertNodeNPos.push(60);
		insertNodeNPos.push(68);
		insertNodeNPos.push(67);
		
		//print List before insertion
				System.out.println("print List before insertion");
				Node temp = insertNodeNPos.head;
				System.out.println(temp.data);
				while(temp.next != null){
					temp = temp.next;
					System.out.println(temp.data);
					
				}
		
		//insert node
		insertNodeNPos.insertNode(6,78);
		
		//Print elements - Iterative
		//print List after insertion
		System.out.println("print List after insertion");
		Node temp1 = insertNodeNPos.head;
		System.out.println(temp1.data);
		while(temp1.next != null){
			temp1 = temp1.next;
			System.out.println(temp1.data);
			
		}
		
		
		//print List after deletion
		        insertNodeNPos.deleteNode(1);
				insertNodeNPos.deleteNode(2);
				System.out.println("print List after deletion");
				Node temp2 = insertNodeNPos.head;
				System.out.println(temp2.data);
				while(temp2.next != null){
					temp2 = temp2.next;
					System.out.println(temp2.data);
					
				}
				
				//print element in a LL in recursion
				System.out.println("Print elements using recursion");
				//insertNodeNPos.printRecursive(insertNodeNPos.head);
		
	}
	
	
}
