package week2;

public class S2 {
	static boolean[][] arr = new boolean[10][10];
	static boolean[] visited =  new boolean[10]; //i노드에 방문을 했다는 걸 의
	public static void main(String[] args) {
		arr[1][2]=true;arr[2][1]=true;
		arr[1][3]=true;arr[3][1]=true;
		arr[3][4]=true;arr[4][3]=true;

		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				if(arr[i][j]&&visited[i]==false)//i-j연결, 미방문 
					check(i);
		}
		
	}
	static void check(int i) {
		visited[i]=true;//이제 방문 했다.
		System.out.println(i);
		
		for(int j=0;j<10;j++) {
			if(visited[j])continue;//j에 방문 했으면 다음 노드 확인
			if(arr[i][j])//i,j에 연결되어 있으면
				check(j);//재귀호
		}
		return;
	}

}
