package graphs;

public class AdjacencyMatrix {
	
	/**
	 * TC:find,add,remove edge = O(1)
	 * TC: Find all adj vertices of a given vertex : O(V)
	 * SC:O(V2)
	 */
	
	private boolean adjMatrix[][];
	private int numOfVertices;
	
	public AdjacencyMatrix(int numOfVertices) {
		this.numOfVertices = numOfVertices;
		adjMatrix = new boolean[numOfVertices][numOfVertices];
	}
	
	public void addEdge(int i,int j) {
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}
	
	
	public void removeEdge(int i,int j) {
		adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
	}
	
	
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    for (int i = 0; i < numOfVertices; i++) {
	      s.append(i + ": ");
	      for (boolean j : adjMatrix[i]) {
	        s.append((j ? 1 : 0) + " ");
	      }
	      s.append("\n");
	    }
	    return s.toString();
	  }

	
	public static void main(String args[]) {
		AdjacencyMatrix adjMatrix = new AdjacencyMatrix(5);
		adjMatrix.addEdge(0,1);
		adjMatrix.addEdge(0,2);
		adjMatrix.addEdge(1,2);
		adjMatrix.addEdge(2,0);
		adjMatrix.addEdge(2,3);
		
		System.out.println(adjMatrix.toString());
		
	}

}
