package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Binarytilln {
	public static void main(String[] args) {
		
		Queue <String> queue =new ArrayDeque<>();
		int n=5;
		
		queue.offer("1");
		int count=0;
		while (count<n) {
			String front =queue.poll();
			System.out.println(front);
			
			queue.offer(front+"0");
			queue.offer(front+"1");
			count++;
		}
		
		
	}

}
