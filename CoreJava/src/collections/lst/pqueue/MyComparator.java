package collections.lst.pqueue;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return  (int) (e1.salary-e2.salary);
	}
	

}
