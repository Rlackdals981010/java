package week2;
import java.util.*;

public class S4 {
	static int V =10;
	static Vector<Integer> adg[] = new Vector[V];
	static boolean vt[] = new boolean[V];
	
	public static void main(String[] args) {
		for(int i=0;i<V;i++)
			adg[i]=new Vector<>();
		
		adg[1].add(2);
		adg[1].add(3);
		
		adg[2].add(1);
		
		adg[3].add(1);
		adg[3].add(4);
		
		adg[4].add(3);

		for(int i=0;i<V;i++) {
				if(vt[i]==false&&!adg[i].isEmpty())
					go(i);			
		}
		
	}
	static void go(int start) {
		System.out.println(start);
		vt[start]=true;
		
		for(int there:adg[start]) {
			if(vt[there])continue;
			go(there);
		}
		return;
	}
}
