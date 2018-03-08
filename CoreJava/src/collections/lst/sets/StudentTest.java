package collections.lst.sets;

import java.util.HashSet;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {

		HashSet<Student> std = new HashSet<>();
		std.add(new Student(12, "Sujeet", "MCA"));
		std.add(new Student(13, "Anoj", "BCA"));
		std.add(new Student(14, "Archana", "B.Sc"));
		std.add(new Student(15, "Rana", "KVS"));
		std.add(new Student(12, "Sujeet", "MCA"));
		Iterator<Student> it = std.iterator();
		while (it.hasNext()) {
			System.out.println("student by iterator:::" + it.next());
		}
		System.out.println("=================================");
		System.out.println("Student deatils:" + std);

	}

}
