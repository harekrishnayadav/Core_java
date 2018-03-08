package collections.lst.pqueue;

import java.util.PriorityQueue;

public class EmployeeTest {

	public static void main(String[] args) {
		MyComparator comparator = new MyComparator();
		PriorityQueue<Employee> pQueue = new PriorityQueue<>(7, comparator);

		pQueue.offer(new Employee("Archna", 3000));
		pQueue.offer(new Employee("Anoj", 3388));
		pQueue.offer(new Employee("Abinash", 4900));
		pQueue.offer(new Employee("Rakesh", 4978));
		pQueue.offer(new Employee("Ravi", 3400));
		System.out.println("pQueue:" + pQueue);

	}

}
