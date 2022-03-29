package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 
 * @author sharanya
 * TC: vertexlist in an array/arraylist and edgelist stored as a linkedlist in 
 * an arraylist.TC to find adj vertices of a vertex = O(V) = to find index +
 * O(degree(V)=to loop through vertices
 * EdgeList can also be stored in a BST=helps in insert,delete and find a particular vertex
 * Another option to store EdgeList is to use a HashMap instead of arrayList
 */
public class AdjacencyList1 {
	
	
	
	class Node{
		int dest;
		int weight;
		
		Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
	}
	
	List<LinkedList<Node>> adjList = new ArrayList<LinkedList<Node>>();
	
	public void addEdge(int src,int dest,int weight) {
		adjList.get(src).add(new Node(dest,weight));
		adjList.get(dest).add(new Node(src,weight));
	}
	
	public void createVertexList() {
		for (int i = 0; i < 5; i++)
			adjList.add(new LinkedList<Node>());
		}
	
	
	
	public void printGraph(List<LinkedList<Node>> am) {
	    for (int i = 0; i < am.size(); i++) {
	      System.out.println("\nVertex " + i + ":");
	      for (int j = 0; j < am.get(i).size(); j++) {
	        System.out.print(" -> " + am.get(i).get(j).dest);
	      }
	      System.out.println();
	    }
	  }
	
	public static void main(String args[]) {
		AdjacencyList1 adjList1 = new AdjacencyList1();
		adjList1.createVertexList();
		adjList1.addEdge(0,1,56);
		adjList1.addEdge(0,2,56);
		adjList1.addEdge(0,3,56);
		adjList1.addEdge(1,2,56);
		
		adjList1.printGraph(adjList1.adjList);
	}

}
