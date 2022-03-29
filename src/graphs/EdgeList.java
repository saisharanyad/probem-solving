package graphs;

import java.util.ArrayList;
import java.util.List;


/**
 * TC: to find all vertices adjacent to a given vertex=O(E) = O(V2) in
 *  WC as max number of edges = n(n-1)/2
 * TC: to find if 2 vertices are adjacent =O(E)
 * Space for vertices=O(V) Space for edges=O(E) TotalSpace=O(V+E)
 */
public class EdgeList {
	
	class Vertex{
		String name;
		long population;
		long area;
		
		Vertex(String name,long population,long area){
			this.name = name;
			this.population = population;
			this.area = area;
		}
	}
	
	class Edge{
		int weight;
		int vertex1;
		int vertex2;
		
		Edge(int weight,int vertex1,int vertex2){
			this.weight = weight;
			this.vertex1 = vertex1;
			this.vertex2 = vertex2;
		}
	}
	
	//Arrays can be replaced with List so dynamically vertices and edges can be added
	Vertex[] cityVertices=new Vertex[4];
	Edge[] edges=new Edge[6];
	public  void edgeList() {
		//vertices can also be stored in a map
		cityVertices[0] = new Vertex("SF",5875748,84848393);
		cityVertices[1] = new Vertex("SD",6867868,34646456);
		cityVertices[2] = new Vertex("LA",21435465,89889898);
		cityVertices[3] = new Vertex("OC",235465577,898798797);
		
		//For each edge vertex1 and vertex2 can have indices of vertices or references of vertices
		edges[0] = new Edge(2,0,1);
		edges[1] = new Edge(5,1,2);
		edges[2] = new Edge(4,2,0);
		edges[3] = new Edge(6,3,1);
		edges[4] = new Edge(4,2,3);
		edges[5] = new Edge(8,3,0);
			
	}
	
	public void findNeighborsOfaVertex(String vertex) {
		List<String> vertexList = new ArrayList<String>();
		for(Edge edge : edges) {
			if(cityVertices[edge.vertex1].name.equals(vertex)) {
				vertexList.add(cityVertices[edge.vertex2].name);
			}else if(cityVertices[edge.vertex2].name.equals(vertex)) {
				vertexList.add(cityVertices[edge.vertex1].name);
			}
		}
		
		System.out.println(vertexList);
	}
	
	
	public static void main(String args[]) {
		EdgeList edgeList = new EdgeList();
		edgeList.edgeList();
		edgeList.findNeighborsOfaVertex("SF");
	}

}
