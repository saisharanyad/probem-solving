package linked.list.programs;

/**
 * 
 * @author shara
 *  1.Create a DoublLinkedList
 *  2.Print elements in a DLL in forward and reverse order
 *  3.Insert node at nth position
 *  4.Delete node at nth position
 */

public class DoubleLinkedList {
	
	Node head,tail;
	
	public void add(int data){
		
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		Node newNode = new Node(data);
		temp.next = newNode;
		newNode.prev = temp;
		tail = newNode;
	}
	
	public void insertNode(int pos,int data){
		if(head == null)return;
		int count = 0;
		
		Node temp = head,prev = null;
		
	
		while(temp != null){
			++count;
			if(pos == count){
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
		//insertFirst - O(1) , insert at nth pos = O(n)
		//insertLast -- O(1) , traversal - O(n)
	
			Node newNode = new Node(data);
			if(temp != null){
				newNode.next = temp;
				temp.prev = newNode;
			}else{
				tail = newNode;
			}
			
			if(prev != null){
				prev.next = newNode;
				newNode.prev = prev;
			}else{
				head = newNode;
			}
		
	}
	
	public void deleteNode(int pos){
		
		//deleteFirst - O(1) , deleteLast - O(n) , delete - O(n)
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
		
		temp = temp.next;
		if(temp != null){
			temp.prev = prev;
		}else{
			tail = prev;
		}
		if(prev != null){
			prev.next = temp;
		}else{
			head = temp;
		}
	}
	
	public static void main(String args[]){
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(5);
		dll.add(4);
		dll.insertNode(2, 21);
		dll.add(6);
		dll.add(3);
		dll.deleteNode(1);
		dll.add(9);
		
		
		System.out.println("Print elements in a DLL in forward order");
		
		Node temp = dll.head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		System.out.println("Print elements in a DLL in reverse order");
		Node temp1 = dll.tail;
		while(temp1 != null){
			System.out.println(temp1.data);
			temp1 = temp1.prev;
		}
	}
	
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data = data;
		}
		
	}

}
