package graphs;

import java.util.HashSet;
import java.util.LinkedList;


/**
 * 
 * @author sharanya
 * Object-Pointers approach
 * TC:takes same as AdjList1 implementation.But here in this implementation 
 * it is good to store vertices separately.That way we don't need a HashSet of Nodes
 */
public class AdjacencyList2 {
	
	
	class Node {
	    private String name;
	    private LinkedList<Edge> edgeList;

	    public Node(String name) {
	        this.name = name;
	        edgeList = new LinkedList < > ();
	    }
	}
	    
	    
	    class Edge {
	        private int weight;
	        private Node destVertex;

	        public Edge(Node dest, int w) {
	            this.destVertex = dest;
	            this.weight = w;
	        }

	        public Edge(Node dest) {
	            this.destVertex = dest;
	            this.weight = 1;
	        }
	    }
	
	
	
	private HashSet<Node> nodes = new HashSet<>();
	
	public void addVertices() {
		Node v1 = new Node("0");
		Node v2 = new Node("1");
		Node v3 = new Node("3");
		Node v4 = new Node("4");
		nodes.add(v1);
		nodes.add(v2);
		nodes.add(v3);
		nodes.add(v4);
		
		
		addEdges(v1,v2,40);
		addEdges(v2,v3,46);
		addEdges(v3,v4,78);
		addEdges(v2,v4,4);
	}
	
	
	public void addEdges(Node v1,Node v2,int weight) {
		v1.edgeList.add(new Edge(v2,weight));
		v2.edgeList.add(new Edge(v1,weight));
	}
	
	public void printGraph() {
        for (Node v: nodes) {
            System.out.print("vertex name: " + v.name + ":\n");
            for (Edge e: v.edgeList) {
                System.out.print("destVertex: " + e.destVertex.name + ", weight: " + e.weight + "\n");
            }
            System.out.print("\n");
        }
    }
	
	public static void main(String args[]) {
		AdjacencyList2 al2 = new AdjacencyList2();
		al2.addVertices();
		al2.printGraph();
		
	}
	
}
