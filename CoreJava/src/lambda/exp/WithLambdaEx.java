package lambda.exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithLambdaEx {

	public static void main(String[] args) {
		List<Employee> listEmp = getEmployee();
		/*
		 * Collections.sort(listEmp, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return
		 * o1.getName().compareTo(o2.getName());
		 * 
		 * } });
		 */
		/*
		 * System.out.println("By name"); for (Employee employee : listEmp) {
		 * System.out.println("Employee:" + employee);
		 * 
		 * }
		 */
		listEmp.sort((Employee emp1, Employee emp2) -> emp1.getId() - emp2.getId());
		listEmp.forEach((employee) -> System.out.println(employee));
		listEmp.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		listEmp.forEach((employee) -> System.out.println("BY name:" + employee));
	}

	private static List<Employee> getEmployee() {
		List<Employee> lt = new ArrayList();
		lt.add(new Employee(12, "Sujeet", "Patan"));
		lt.add(new Employee(16, "Raj", "Ara"));
		lt.add(new Employee(19, "Suman", "Bagusarai"));
		lt.add(new Employee(10, "Sumit", "Darbhanga"));
		lt.add(new Employee(14, "Mahon", "Madhubani"));
		return lt;

	}

}
