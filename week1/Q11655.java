package week1;

import java.util.*;
import java.io.*;

//ROT13은 기존 아스키 + 13의 문자로 변환하는 
public class Q11655 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String org = br.readLine();
		StringBuilder sb = new StringBuilder();
		int t;
		
		for(int i = 0 ; i < org.length();i++) {
			if(org.charAt(i)>=(int)'a'&&org.charAt(i)<=(int)'z') {
				t=org.charAt(i)+13;
				if(t>'z') t-=26;
				sb.append((char)t);
			}
			else if(org.charAt(i)>=(int)'A'&&org.charAt(i)<=(int)'Z') {
				t=org.charAt(i)+13;
				if(t>'Z') t-=26;
				sb.append((char)t);
			}
			else
				sb.append(org.charAt(i));
		}
		String use = sb.toString();
		System.out.println(use);

	}

}
