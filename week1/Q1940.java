package week1;

import java.util.*;
import java.io.*;
public class Q1940 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //재료
		int M = Integer.parseInt(br.readLine()); //갑옷에 드는 재료 개수 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];  //고유번
		for(int i = 0 ; i < N; i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
		int cnt=0;
		//2개를 선택했을때 nC2 합이 9
		for(int i = 0 ; i < arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==M)cnt++;
					
			}
		}
		System.out.println(cnt);
		

	}

}
