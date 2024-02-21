package week2;
import java.util.*;
import java.io.*;

public class S9 {
	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};
	static int N,M;
	static int[][] map;
	static int[][] visited;
	static int cnt=0;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		N = Integer.parseInt(tk.nextToken());
		M = Integer.parseInt(tk.nextToken());
		map = new int[104][104];
		visited = new int[104][104];
		for(int i = 0 ; i < N ; i++) {
			tk = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(tk.nextToken());
			}
		}
		for(int i = 0 ; i < N ; i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==1&&visited[i][j]==0) {
					cnt++;
					dfs(i,j);
				}
			}
		}
		System.out.println(cnt);

	}
	static void dfs(int y, int x) {
		visited[y][x]=1;
		
		for(int i=0;i<4;i++) {
			int ny = dy[i]+y;
			int nx = dx[i]+x;
			
			if(ny<0||nx<0||ny>=N||nx>=M)continue;
			if(visited[ny][nx]==1)continue;
			if(map[ny][nx]==0)continue;
				dfs(ny,nx);
			
		}
		return;
			
	}

}
