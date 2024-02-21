package week1;
import java.io.*;
import java.util.*;

public class Q9996 {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int idx=0;
		String k = br.readLine();
		String rK,lK;
		
		for(int i = 0 ; i < k.length();i++ ) {
			if(k.charAt(i)=='*') {
				idx = i;
			}
		}

		//중요1
		rK=k.substring(0,idx);
		lK=k.substring(idx+1);	

		
		for(int i = 0 ; i < N;i++) {
			String use = br.readLine();
			if(rK.length()+lK.length()>use.length()) { //중요 2 반례.
				System.out.println("NE");
			}
			else { 
				if(use.substring(0,idx).equals(rK)&&use.substring(use.length()-lK.length()).equals(lK))
					System.out.println("DA");
				else 
					System.out.println("NE");
			}
			
		}

		
		
	}
}

