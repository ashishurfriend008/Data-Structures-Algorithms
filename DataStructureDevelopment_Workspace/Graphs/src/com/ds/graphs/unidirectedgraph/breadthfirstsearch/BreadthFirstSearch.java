package com.ds.graphs.unidirectedgraph.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	
	public BreadthFirstSearch(int nodes){
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
		sb.append(V + "vertices, " + E + "edges " +"/n");
		for(int v = 0; v < V; v++){
			sb.append(V + " : ");
			for(int w : adj[v]){
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
		
	}
	
	public void breadthFirstSearch(int s){
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		
		while(!q.isEmpty()){
			int u = q.poll();
			System.out.println(u + " ");
			
			for(int v : adj[u]){
				if(!visited[v]){
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BreadthFirstSearch bfs = new BreadthFirstSearch(5);
		bfs.addEdges(0, 1);
		bfs.addEdges(1, 2);
		bfs.addEdges(3, 2);
		bfs.addEdges(3, 0);
		bfs.addEdges(2, 4);
		bfs.breadthFirstSearch(0);
		
		
	}

}
