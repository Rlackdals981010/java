package week1;
//import java.util.*;
import java.io.*;

public class Q10988 {
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//회문은 reverse문과 원문의 비교로 풀린다.
		String org = br.readLine();
		StringBuilder rev = new StringBuilder(org).reverse();
		String rv = rev.toString();
		
		
		if(org.equals(rv)) System.out.println("1");
		else System.out.println("0");
	}
}
