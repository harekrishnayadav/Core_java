package collections.sets.geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDemo {

	static int x = 20;

	public static void main(String[] args) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>();

		insert(s, x);
		System.out.println(s);
		int p = size(s);
		System.out.println("size:"+p);
		print_Contents_Increasing_Order(s);
		print_Contents_Insertion_Order(s);
		erase(s);
		
		

	}

	private static int size(LinkedHashSet<Integer> s) {
		return s.size();
	}

	private static void erase(LinkedHashSet<Integer> s) {
		s.remove(x);
		System.out.println("After remove:" + s);
	}

	private static void print_Contents_Insertion_Order(LinkedHashSet<Integer> s) {
		for (int v : s)
			System.out.println("isertion order:" + v + " ");
	}

	private static void insert(LinkedHashSet<Integer> s, int x) {
		s.add(x);
		s.add(30);
		s.add(5);

	}

	private static void print_Contents_Increasing_Order(LinkedHashSet<Integer> s) {
		List<Integer> l = new ArrayList<>(s);
		Collections.sort(l);
		for (Integer v : l)
			System.out.println("increasing order:" + v + " ");

	}

}
