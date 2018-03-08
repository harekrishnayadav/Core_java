package collections.lst.iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		List lt = new ArrayList<>();
		lt.add("A");
		lt.add("B");
		lt.add("C");
		lt.add("D");
		lt.add("E");
		lt.add("F");
		lt.add("A");
		System.out.println("List:" + lt);
		// Traversing list using iterator
		Iterator it = lt.iterator();
		while (it.hasNext()) {
			System.out.println("List Iterator:" + it.next());
		}
		Set st = new HashSet<>(lt);
		// Traversing set using iterator
		Iterator it1 = st.iterator();
		while (it1.hasNext()) {
			System.out.println("iterator set:" + it1.next());
		}
		Queue q = new PriorityQueue(lt);
		Iterator it2 = q.iterator();
		while (it2.hasNext()) {
			System.out.println("Queue iterator:" + it2.next());
		}
		ListIterator li = lt.listIterator();
		while (li.hasNext()) {
			System.out.println("ListIterator:" + li.next());
		}
	}

}
