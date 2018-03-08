package collections.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(11, "Anoj");
		hmap.put(17, "Raju");
		hmap.put(10, "Suman");
		hmap.put(13, "Abinash");
		hmap.put(15, "Sujeet");
		System.out.println("HashMap:" + hmap);
		Iterator<Integer> it = hmap.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("HashMap iterate:" + it.next());

		}
		Iterator<Entry<Integer, String>> it1 = hmap.entrySet().iterator();
		while (it1.hasNext()) {
			System.out.println("iterate with EntrySet:" + it1.next());
		}
	}

}
