package week1;

import java.util.*;
import java.io.*;
public class Q1213 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String use = br.readLine();
		int[] arr = new int['Z'];
		for(int i = 0 ; i < use.length();i++) {
			arr[use.charAt(i)-'A']++;
		}
		//전부 짝수거나 하나만 음수
		int flag=0;
		int i=0;
		while(i < arr.length) {
			if(arr[i]%2!=0)flag++;//arr[i]&1도 홀수임 홀수는 2진수로 표현할때 마지막이 1이라서 and연산자..
			if(flag>=2) {
				System.out.println("I'm Sorry Hansoo");
				System.exit(0);
			}				
			i++;
		}
		//팰린드롬 제작  
		StringBuilder sb = new StringBuilder();
		for(i=arr.length-1;i>=0;i--) {
			for(int j=0;j<arr[i]/2;j++)
				sb.append((char)(i+'A')); //기억  
			for(int j=0;j<arr[i]/2;j++)
				sb.insert(0,(char)(i+'A')); //기억 
			if(arr[i]%2==1)
				sb.insert(sb.length()/2, (char)(i+'A'));
		}
		String h = sb.toString();
		System.out.println(h);

	}

}
