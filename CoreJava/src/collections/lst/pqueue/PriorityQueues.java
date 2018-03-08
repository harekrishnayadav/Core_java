package collections.lst.pqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueun = new PriorityQueue<Integer>();
		pQueun.offer(23);
		pQueun.offer(34);
		pQueun.offer(22);
		pQueun.offer(19);
		pQueun.offer(20);
		pQueun.offer(56);
		System.out.println("PriorityQueue:" + pQueun);
		Iterator<Integer> it = pQueun.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator PriorityQueue:" + it.next());

		}
		pQueun.poll();
		System.out.println("After poll():" + pQueun);
		pQueun.peek();
		System.out.println("After peek():" + pQueun);
		pQueun.remove(34);
		System.out.println("After remome:" + pQueun);
		PriorityQueue<String> p1Queue = new PriorityQueue<>();
		p1Queue.offer("B");
		p1Queue.offer("A");
		p1Queue.offer("C");
		p1Queue.offer("F");
		p1Queue.offer("G");
		p1Queue.add("Anoj");
		p1Queue.add("Sujeet");
		p1Queue.add("Raja");
		p1Queue.add("Aaryan");

		System.out.println("p1Queue:" + p1Queue);
		Object[] obj = p1Queue.toArray();
		System.out.println("Value in array");
		for (int i = 0; i < obj.length; i++) {
			System.out.println("value:" + obj[i].toString());

		}

	}

}
