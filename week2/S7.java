package week2;

public class S7 {
	static int n =3;
	static int[][] map = {{1,0,1},{1,0,1},{0,1,1}};
	static int[] dy= {-1,0,1,0};
	static int[] dx= {0,1,0,-1};
	static int[][] visited=new int[n][n];
	public static void main(String[] args) {
		go(0,0);

	}
	static void go(int y,int x) {
		visited[x][y]=1;
		System.out.println("("+y+","+x+")");
		
		for(int i =0;i<4;i++) {
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0||nx>=n||ny>=n||nx<0)continue; //범위 밖 경우 
			if(visited[ny][nx]==1)continue; //저번에 방문했을 경우 
			if(map[ny][nx]==0)continue; // 갈 수 없는 경우
			go(ny,nx);
		}
	}

}
