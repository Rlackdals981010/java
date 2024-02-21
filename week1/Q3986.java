package week1;

import java.util.*;
import java.io.*;

public class Q3986 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//stack에서 pop하는 느낌
		
		int N = Integer.parseInt(br.readLine()); //단어 개수 = 반복 횟수 
		int cnt=0; //좋은 단어 개수 
		
		for(int i = 0;i<N;i++) {
			String use = br.readLine();
			Stack<Character> st = new Stack<>();
			for(int j=0;j<use.length();j++) {;
				
				if(st.isEmpty())  //이렇게 size확인하는거 필수임 st.size()로 해도 되긴
					st.push(use.charAt(j));		
				else {
					if(st.peek()==use.charAt(j)) 
						st.pop();						
					else
						st.push(use.charAt(j));					
				}

			}
			if(st.isEmpty())
				cnt++;		
		}
		System.out.println(cnt);
	}

}
//짝짓기 , 폭발 처럼 붙은거 -> 스택 생각하