package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(33);//add()
		queue.poll();//remove()
		queue.peek();//get()
		queue.offer(34);
		queue.offer(35);
		queue.offer(65);
		queue.offer(66);
		queue.offer(6);
		queue.offer(10);
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);

	}

}
