package week2;
import java.util.*;
import java.io.*;

public class S11 {
	static int[][] map = {{1,0,1,0,1},{1,1,1,0,1},{0,0,1,1,1},{0,0,1,1,1},{0,0,1,1,1}};
	static int[][] visited;
	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken());
		int M = Integer.parseInt(tk.nextToken());
		
		tk = new StringTokenizer(br.readLine());
		int sy = Integer.parseInt(tk.nextToken());
		int sx = Integer.parseInt(tk.nextToken());
		
		tk = new StringTokenizer(br.readLine());
		int cy = Integer.parseInt(tk.nextToken());
		int cx = Integer.parseInt(tk.nextToken());
			
		visited= new int[N][M];	//방문 처리할 배
		visited[sy][sx]=1; // 시작지점 방문처리 -> 이거 안하고 0으로 두면 양방향이면 다시 돌아가버림..
		Queue<int[]>q = new LinkedList<>();//순서 정하기용 
		q.add(new int[] {sy,sx}); //시작지점 큐 추가 
		while(!q.isEmpty()) {
			int[] pos = q.poll();//현재 위치에서 떠날꺼니까 빼고 
            int y = pos[0];//현재 y좌표 
            int x = pos[1];//현재 x좌표 
            
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];//현 y좌표에서 4방으로 이동할때 y좌표 
                int nx = x + dx[i];//현 x좌표에서 4방으로 이동할때 x좌표 

                if (ny < 0 || ny >= N || nx < 0 || nx >= M || map[ny][nx] == 0) continue;
                if (visited[ny][nx] != 0) continue;

                visited[ny][nx] = visited[y][x] + 1; //nx가 현재 위치 y가 전 위치 
                q.offer(new int[]{ny, nx}); // 현 위치 추가 
            }		
		}
		 System.out.println(visited[cy][cx]);
		 
		// 최단거리 디버깅
		 for (int i = 0; i < N; i++) {
			 for (int j = 0; j < M; j++) {
				System.out.print(visited[i][j] + " ");
	         }
	         System.out.println();
		 }
	
	}
}
