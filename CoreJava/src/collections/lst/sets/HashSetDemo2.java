package collections.lst.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("A");
		System.out.println("arr:" + arr);
		HashSet<String> set = new HashSet<>(arr);
		System.out.println("set" + set);
		set.add("Sujeet");
		set.add("Sujeet");
		set.add("Rajesh");
		set.add("Anoj");
		System.out.println("Set :"+set);

	}

}
