package week1;

import java.util.*;
import java.io.*;


public class Q1629 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(tk.nextToken());
		long B = Long.parseLong(tk.nextToken());
		long C = Long.parseLong(tk.nextToken());
		
		long use = go(A,B,C);
		
		System.out.println((int)use);

		
	}
	static long go(long A, long B, long C) { //거듭제곱의 시간 복잡도를 줄이는 방법임.
		if(B==1)
			return A%C;
		
		long ret = go(A,B/2,C);//2^8의 경우 2^4 * 2^4이므로 2^8->2^4로 반갈 
		ret = (ret*ret)%C; //2^8 = 2^4 * 2^4 표현 
		if(B%2==1) //근데 2^9처럼 지수가 홀수면? 
			ret = (ret*A)%C; //2^1을 따로 곱해준다. 2^9 = 2^8*2^1 
		return ret;
	}

}
