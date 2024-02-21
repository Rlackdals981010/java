package week1;
//https://www.acmicpc.net/problem/1620
import java.util.*;
import java.io.*;

public class Q1620 {

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tk.nextToken()); //도감 수록 포켓몬 
		int M = Integer.parseInt(tk.nextToken()); //맞춰야 하는 문제의 개수
		
		//입력이 영어와 숫자로 들어옴.
		//일단 도감
		HashMap<String,Integer> spokemon = new HashMap<>();
		String[] ipokemon = new String[100004];
		String get;
		for(int i = 1 ; i <= N ; i++) { //map 제작
			get = br.readLine();
			spokemon.put(get,i);
			ipokemon[i]=get;
		}
		
		
		//String -> int는 map 이용 O(logn)
		//int -> String은 array O(1)
		for(int i = 0 ; i < M ; i++) {
			get = br.readLine();
			try {//수치형의 경우
				int num = Integer.parseInt(get);
				System.out.println(ipokemon[num]);
				
			}catch(NumberFormatException e) {//문자열의 경우
				int use = spokemon.get(get); //hashpmap 접근
				System.out.println(use);
			}
		}
		
		

	}

}
