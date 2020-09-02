package com.ds.graphs.unidirectedgraph.depthfirstsearch;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {

	/**
	 * @Ashish Ku. Dey
	 */
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	public DepthFirstSearch(int nodes){
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++){
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdges(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(V + "vertices, " + E + "edges " + "\n");
		
		for(int v = 0; v < V; v++){
			sb.append(v + " ");
			for(int w : adj[v]){
				sb.append(w + " ");
			}
			sb.append("\n");
		}
			return sb.toString();
	}
	
	public void depthfirstSearch(int s){
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		
		while(!stack.isEmpty()){
			int u = stack.pop();
			if(!visited[u]){
				visited[u] = true;
				System.out.println(u + " ");
				
				for(int v : adj[u]){
					if(!visited[v]){
						stack.push(v);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DepthFirstSearch dfs = new DepthFirstSearch(5);
		dfs.addEdges(0, 1);
		dfs.addEdges(1, 2);
		dfs.addEdges(2, 3);
		dfs.addEdges(3, 0);
		dfs.addEdges(2, 4);
		dfs.depthfirstSearch(0);

	}

}
