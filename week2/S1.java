package week2;

public class S1 {

	public static void main(String[] args) {
		boolean[][] arr = new boolean[10][10];
		arr[1][2]=true;arr[2][1]=true;
		arr[1][3]=true;arr[3][1]=true;
		arr[3][4]=true;arr[4][3]=true;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
			
	}

}
