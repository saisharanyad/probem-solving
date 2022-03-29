package linkedlistprograms.megh;

public class LinkedList {
	
	Node head;
	
	public void addNode(int data){
		if(head == null){
			Node newNode = new Node();
			newNode.setData(data);
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		Node temp1 = new Node();
		temp1.setData(data);
		temp.next = temp1;
		
	}
	
	public void printList(){
		if(head == null){
			return;
		}
		
		Node temp = head;
		System.out.println(temp.data);
		while(temp.next != null){
			temp = temp.next;
			System.out.println(temp.data);
		}
	}
	
	public void insertNodeAtTheBegin(int data){
		if(head == null){
			head = new Node();
			head.setData(data);
			return;
		}
		
		Node temp = head;
		Node newNode = new Node();
		newNode.setData(data);
		head = newNode;
		newNode.next = temp;
	}
	
	public static void main(String args[]){
		LinkedList linkedList = new LinkedList();
		
		//linkedList.addNode(15);
		//linkedList.addNode(20);
		//linkedList.addNode(30);
		
		linkedList.printList();
		System.out.println("-------------------------");
		linkedList.insertNodeAtTheBegin(45);
		//linkedList.insertNodeAtTheBegin(55);
		linkedList.printList();
	}

}
