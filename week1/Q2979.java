package week1;

import java.util.*;
import java.io.*;

public class Q2979 {
	
	public static void main(String args[]) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        int[] time = new int[101];
        
        
        tk = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(tk.nextToken());
        int B = Integer.parseInt(tk.nextToken());
        int C = Integer.parseInt(tk.nextToken());
        //시각은 이상미만임. 떠난 시간은 제외해야함
        for(int i = 0 ; i < 3 ; i++) {
        	tk = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(tk.nextToken());
        	int b = Integer.parseInt(tk.nextToken());
        	for(int j = a ; j < b ; j++) time[j]++;
        }
        
        int total=0;
        
        for(int i = 0 ; i < time.length;i++) {
        	if(time[i]==1)total+=A;
        	else if(time[i]==2)total+=B*2;
        	else if(time[i]==3)total+=C*3;        	
        }
        
        System.out.println(total);
        
        
        
        
    }    

}
