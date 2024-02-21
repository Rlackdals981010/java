package week1;
import java.io.*;
import java.util.*;

public class Q2309 {
    static int n = 9, r=7;
    static int[] arr = new int[n];
    
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < n ; i++)
            arr[i]=Integer.parseInt(br.readLine());
        //자바는 순열을 재귀로 풀어야함..
        mPm(n,r,0);        
        
	}
	static void mPm(int n, int r, int depth){
		if(r==depth) {
			solve();
			return;
		}
		for(int i = depth; i < n ; i++) {
			swap(i,depth);
			mPm(n,i,depth+1);
			swap(i,depth);
		}
	}
	static void swap(int i,int depth) {
		int m = arr[i];
		arr[i]=arr[depth];
		arr[depth]=m;
	}
	static void solve() {
		int sum = 0;
		for(int i= 0;i<r;i++)
			sum+=arr[i];
		if(sum==100) {
			Arrays.sort(arr,0,r); //이러면 0~r-1까지 대상
			for(int i=0;i<r;i++)
				System.out.println(arr[i]);
			System.exit(0);
		}
			
	}
}
