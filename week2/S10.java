package week2;
import java.util.*;
import java.io.*;

public class S10 {
	static Queue<Integer> q = new ArrayDeque<>();
	public static void main(String[] args) {
		// offer = push, poll  = pop
		
		q.offer(here);
		while(!(q.isEmpty())) {
			q.poll();
			for(int there:adj[here])
				q.offer(there;)
		}
	}

}
