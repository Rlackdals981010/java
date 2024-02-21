package week1;
//import java.util.*;
import java.io.*;

public class Q1159 {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		for(int i=0 ; i<N ; i++) {
			String use = br.readLine();
			arr[use.charAt(0)-'a']++;			
		}
		StringBuilder retB = new StringBuilder();
		for(int i=0; i < 26; i++) {
			if(arr[i]>=5) 
				retB.append((char)(i+'a'));			
		}
		String ret = retB.toString();
		if(ret.length()!=0) System.out.print(ret);
		else System.out.print("PREDAJA");
		
	}
}
