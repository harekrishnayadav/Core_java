package collections.ltree.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(10);
		tSet.add(20);
		tSet.add(120);
		tSet.add(12);
		tSet.add(104);
		System.out.println(tSet);
		Iterator<Integer> it = tSet.iterator();
		while (it.hasNext()) {
			System.out.println("TreeSet:" + it.next());
		}

	}

}
