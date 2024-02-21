package week1;

import java.util.*;
import java.io.*;

public class Q9375 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		int N = Integer.parseInt(br.readLine());
		HashMap<String,Integer> arr = new HashMap<>();
		for(int t = 0  ; t < N ; t++) {
			arr.clear();
			int n = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < n ;i++) {
				tk = new StringTokenizer(br.readLine());
				String name = tk.nextToken();
				String type = tk.nextToken();
				arr.put(type, arr.getOrDefault(type,0)+1); //이거
			}
			long use=1;
			for(Map.Entry<String,Integer>entry : arr.entrySet()) { //이거
				use*=(entry.getValue()+1); //이거
			}
			System.out.println(use-1);
				
			
		}

	}

}
