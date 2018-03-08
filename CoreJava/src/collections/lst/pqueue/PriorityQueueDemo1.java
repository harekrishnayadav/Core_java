package collections.lst.pqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<>();

		pQueue.add("A");
		pQueue.add("G");
		pQueue.add("D");
		pQueue.add("G");
		pQueue.add("C");
		pQueue.add("F");

		System.out.println("pQueue with add():" + pQueue);
		pQueue.offer("A");
		pQueue.offer("G");
		pQueue.offer("D");
		pQueue.offer("G");
		pQueue.offer("C");
		pQueue.offer("F");
		System.out.println("pQueue with offer():" + pQueue);
	}

}
