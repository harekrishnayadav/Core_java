package collections.lst.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List<String> lt = new ArrayList<>();
		lt.add("Sujeet");
		lt.add("Anoj");
		lt.add("Aaryan");
		lt.add("Rana");
		lt.add("Suman");
		System.out.println("List:" + lt);
		Iterator<String> it = lt.iterator();
		while (it.hasNext()) {
			System.out.println("List iterator:" + it.next());
		}

	}

}
