package linked.list.programs;

import linked.list.programs.InsertNodeNPos.Node;

/**
 * 
 * @author shara
 * 1.Print elements in a LL in reverse and natural order - Recursion
 * 2.Reverse a LL - Recursion
 */
public class RecursionLL {
	
	
	//Print elements - Recursion
		public void printRecursive(Node node){
			
			if(node == null){
				return;
			}
			System.out.println(node.data);
			printRecursive(node.next);
			
		}
		
		
		//Reverse  LL - Recursion
		public void reverseLLRecursion(Node node){
			if(node == null){
				return;
			}
			
						
			reverseLLRecursion(node);
			
		}
}
