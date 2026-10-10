package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Graph {
	int vertex;
	List<List<Integer>> adjacencyList;
	 public Graph(int vertex) {
		 this.vertex=vertex;
		 adjacencyList=new ArrayList<>();
		 
		 for(int i=0;i< vertex;i++) {
			 adjacencyList.add(new ArrayList<>());
		 }
	}
	public void addEdge(int x,int y) {
		adjacencyList.get(x).add(y);
		adjacencyList.get(y).add(x);
	}
	public void display() {
		
		for(int i=0;i<adjacencyList.size();i++) {
			List<Integer>neighbours=adjacencyList.get(i);
			System.out.println("Index: "+i);
			for(int neighbour:neighbours) {
				System.out.print(neighbour+" ");
			}
			System.out.println();
		}
	}
	public void dfsRecursive(int startVertex) {
		//int noofVertices = 0;
		Deque<Integer> dfsrecursive=new ArrayDeque<>();
		boolean visited[]=new boolean[vertex];
		dfsRecursive(startVertex,visited);
	}
	private void dfsRecursive(int startVertex, boolean [] visited) {
		visited[startVertex] = true;
		System.out.print(startVertex+" ");
		List<Integer> neighbours=adjacencyList.get(startVertex);
		for(int neighbour:neighbours) {
			if(!visited[neighbour]) {
				dfsRecursive(neighbour,visited);
			}
		}
		
		
	}
	public void dfsIterative(int startVertex1) {
		Deque<Integer>stack=new ArrayDeque<>();
		boolean visited[]=new boolean[vertex];
		stack.push(startVertex1);
		while(!stack.isEmpty()) {
			int vertex=stack.pop();
		}
	}
	public static void main(String[] args) {
		Graph gra=new Graph(6);
		gra.addEdge(0, 1);
		gra.addEdge(0, 4);
		gra.addEdge(0, 5);
		gra.addEdge(1, 2);
		gra.addEdge(2, 3);
		gra.addEdge(3, 4);
		gra.display();
		gra.dfsIterative(0);
		gra.dfsRecursive(0);
		

	}
	

}
