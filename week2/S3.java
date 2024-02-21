package week2;

import java.util.*;

public class S3 {
	static int V = 4;
	static Vector<Integer> adj[] = new Vector[V];
	public static void main(String[] args) {
		
		for(int i = 0 ; i < V ;i++) //초기화 해줘야함
			adj[i]=new Vector<>();
		
		adj[0].add(1);
		adj[0].add(2);
		adj[0].add(3);
		
		adj[1].add(0);
		adj[1].add(2);
		
		adj[2].add(0);
		adj[2].add(1);
		
		adj[3].add(0);
		
		for(int i = 0 ; i < V ; i++) {
			System.out.print(i+":");
			for(int there:adj[i])
				System.out.print(there+" ");
			System.out.println();
		}

	}

}
