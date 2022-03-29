package linked.list.programs;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
	
	static class Node {
        int val;
        int min;
        Node next;
        Node(int val, int min) {
            this(val, min, null);
        }
        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    } 
	
	 static Node head = null;
	 
	 
	 static int[] min_stack(int[] operations) {

	        List<Integer> res = new ArrayList<>();
	        
	        for (int i : operations) {
	            if (i == 0) { // get min
	                if (head == null) 
	                	res.add(-1);
	                else 
	                	res.add(head.min);
	            } 
	            else if (i == -1) { // pop
	                if (head != null) 
	                	head = head.next;
	            } 
	            else { // push
	                if (head == null) head = new Node(i, i);
	                
	                else {
	                    Node newNode = new Node(i, Math.min(i, head.min), head);
	                    head = newNode;
	                }
	            }
	        }
	        
	        return res.stream().mapToInt(i -> (i == null ? 0 : i)).toArray();
	    }
	 
	 public static void main(String args[]) {
		 int arr[] = {10, 5, 0, -1, 0, -1, 0};
		 int[] result = min_stack(arr);
		 
		 for(int x: result) {
			 System.out.println(x);
		 }
	 }

}
