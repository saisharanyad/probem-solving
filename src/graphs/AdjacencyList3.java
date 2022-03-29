package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


/**
 * 
 * @author sharanya
 * Not the correct way of implementation
 */
public class AdjacencyList3 {
	
	//we can maintain an additional array/hashset to store vertices
	
	Map<String,LinkedList<Node>> mapList = new HashMap<>();
	
	public void createVertexList() {
		
		mapList.put("a",new LinkedList<Node>());
		mapList.put("b",new LinkedList<Node>());
		mapList.put("c",new LinkedList<Node>());
	}
	
	class Node{
		String destination;
		int weight;
		
		Node(String destination,int weight){
			this.destination = destination;
			this.weight = weight;
		}
	}
	
	
	
	public static void main(String args[]) {
		AdjacencyList3 adjList = new AdjacencyList3();
		
	}
	
	

}
