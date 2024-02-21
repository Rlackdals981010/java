package week2;

public class S5 {
static int[] dy = {-1,0,1,0};
static int[] dx = {0,1,0,-1};
	public static void main(String[] args) {
		int y=0,x=0;
		for(int i = 0 ; i < 4; i++) {
			int ny = dy[i]+y;
			int nx = dx[i]+x;
			System.out.println("("+ny+","+nx+")");
		}

	}

}
