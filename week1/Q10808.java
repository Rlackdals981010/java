package week1;

//import java.util.*;
import java.io.*;

//counting 은 map, array
//String 기반 -> hashmap = key:value
//int 기반 -> array (단 10만, 100만, 1000만... 은 MAP을 사용)
public class Q10808 {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String use = br.readLine();

		int[] arr = new int[26];
		for(int i = 0 ; i<use.length();i++) {
			arr[use.charAt(i)-'a']++;
		}
		
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
