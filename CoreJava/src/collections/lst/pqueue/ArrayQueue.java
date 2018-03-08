package collections.lst.pqueue;

import java.util.ArrayDeque;

public class ArrayQueue {

	public static void main(String[] args) {
		ArrayDeque<String> Aqueue = new ArrayDeque<>();
		Aqueue.offer("A");
		Aqueue.offer("B");
		Aqueue.offer("C");
		Aqueue.offer("D");
		System.out.println(Aqueue);
		Aqueue.pop();
		System.out.println(Aqueue);
		Aqueue.pop();
		System.out.println(Aqueue);
		Aqueue.poll();
		System.out.println(Aqueue);

	}

}
