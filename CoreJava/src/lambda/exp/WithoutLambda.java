package lambda.exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLambda {

	public static void main(String[] args) {
		List<Employee> listEmp = getEmployee();
		System.out.println("Before sort");
		for (Employee employee : listEmp) {
			System.out.println("Employee:" + employee);

		}
		Collections.sort(listEmp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId() - o2.getId();
			}
		});
		System.out.println("Ater sort");
		for (Employee employee : listEmp) {
			System.out.println("Employee:" + employee);

		}
		

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
