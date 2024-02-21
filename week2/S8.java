package week2;
import java.util.*;
public class S8 {
	static int n =6;
	static Vector<Integer> adj[] = new Vector[n];
	static int[] visited= new int[n];//이러면 배열 6개, 연결 노드도 6개가 최대
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <  n ;i++)
			adj[i] = new Vector<>();
		adj[1].add(2);
		adj[1].add(3);
		adj[2].add(4);
		adj[4].add(2);
		adj[2].add(5);
		dfs(1);
	}
	static void dfs(int s) {
		visited[s]=1;
		for(int v : adj[s]) {
			if(visited[v]==0)
				dfs(v);
		}
		System.out.println(s+"종료 ");
	}

}
//호출 순서는 1-2-4. 2로 돌아와서 5, 1로 돌아와서 3. 1종료.
