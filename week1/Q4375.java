package week1;

import java.util.*;
import java.io.*;

public class Q4375 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//3이면 111 7이면 111111 이렇게 n의 배수중에서 1로만 이뤄진 값중 가장 작은값의 1개수를 달라는 뜻임
		String use; 

		while((use=br.readLine())!=null) {
			int n = Integer.parseInt(use);
			if(n%2==0||n%5==0)System.exit(0);
			
			long ret=1,cnt = 1;
			
			while(true) {
				if(cnt%n==0) {
					System.out.println(ret);
					break;
				}
				else {
					cnt = (cnt *10) +1;
					cnt %=n;
					ret++;
				}
			}
		}	
	}	
}
