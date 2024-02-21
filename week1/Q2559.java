package week1;
import java.util.*;
import java.io.*;


public class Q2559 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken());//전체 날짜
		int K = Integer.parseInt(tk.nextToken());//연속 날짜
		
		tk=new StringTokenizer(br.readLine());//
		int[] tem = new int[N];
		for(int i = 1 ; i<=N;i++)
			tem[i]=Integer.parseInt(tk.nextToken());
		
		int[] sum = new int[N+1];
		for(int i = 1 ; i<=N;i++)
			sum[i]=sum[i-1]+tem[i];
		
		int max=-10000004;
		for(int i=K;i<=N;i++) {
			if(max<sum[i]-sum[i-K])
				max=sum[i]-sum[i-K];
		}
		
		System.out.println(max);
		
	}

}
