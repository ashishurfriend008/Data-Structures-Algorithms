package com.ds.graphs.adjacencymatrix.unidirectedgraph.adjacencylist.representation;

import java.util.LinkedList;

//Represent a graph through an array of Linked List
public class AdjacencyListRepresentation {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//create an array of linked list
	private LinkedList<Integer>[] adj;
	//number of vertices
	private int V;
	//number of edges
	private int E;
	
	public AdjacencyListRepresentation(int nodes){
		this.V = nodes;
		/*
		 * as the graph is getting initialized the value of E = 0. 
		 * Because currently there are no edges.
		 */
		this.E = 0;
		//create an instance of array of linked list
		this.adj = new LinkedList[nodes];
		/*
		 * iterate over each and every vertex.
		 * Create separate linked list for each and every index of the array 
		 */
		for(int v = 0; v < V; v++){
			adj[v] = new LinkedList<>();
		}
	}
	
	/*
	 * creating edge between u and v. We have to provide the value of v into 
	 * the linked list of u. Similarly, we have to provide the value of u into 
	 * the linked list of v 
	 */
	public void addEdges(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
		/*increment the value of E by 1 because it signifies that the edge 
		 * is being placed between u and v. 
		 */
		E++;
	}
	
	//this method returns the string representation of graph
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E +" edges" +"\n");
		for(int v = 0; v < V; v++){
			sb.append(v + " : ");	
		/*
		 * it will bring back Linked List associated with that vertex 
		 * and iterate over it and print its content  	
		 */
		for(int w : adj[v]){
			sb.append(w + " ");
		}
		    sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		AdjacencyListRepresentation g = new AdjacencyListRepresentation(4);
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(2, 3);
		g.addEdges(3, 0);
		System.out.println(g);
		

	}

}
