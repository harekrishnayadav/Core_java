package collections.lsthash.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeTest {

	public static void main(String[] args) {
		LinkedHashSet<Employee> lts = new LinkedHashSet<>();
		lts.add(new Employee(12, "Sujeet", "Mca"));
		lts.add(new Employee(13, "Ravi", "Bca"));
		lts.add(new Employee(14, "Rhaul", "M.sc"));
		lts.add(new Employee(15, "Rana", "B.A"));
		lts.add(new Employee(12, "Sujeet", "Mca"));
		Iterator<Employee> it = lts.iterator();
		while (it.hasNext()) {
			System.out.println("EployeeList:" + it.next());
		}

	}

}
