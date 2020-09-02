package com.ds.graphs.adjacencymatrix.undirectedgraph;

/*
 * Implementation of graph using the adjacency matrix 
 */
public class UndirectedGraph {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//number of vertices in Graph
	private int V;
	//number of edges in graph
	private int E;
	/*
	 * two dimensional array which would be adjacency matrix 
	 * which would represent a graph 
	 */
	private int[][] adjMatrix;
	
	//Graph constructor takes number of nodes
	public UndirectedGraph(int nodes){
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	//uth row and vth column which represents an edge.
	public void addEdges(int u, int v){
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1; //because it is unidirected.
		//After every edge, will increment the edge by 1
		E++;
	}
	
	//string representation of graph
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(V + " Vertices " + E + " edges " +"\n");
		//iterate over each and every vertex 
		for(int v = 0; v < V; v++){
			sb.append(v +" : ");
			for(int w : adjMatrix[v]){
				sb.append(w + "");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		UndirectedGraph g = new UndirectedGraph(4);
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(2, 3);
		g.addEdges(3, 0);
		System.out.println(g);
		
	}

}
