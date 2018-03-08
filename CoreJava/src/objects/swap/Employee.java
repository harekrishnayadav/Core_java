package objects.swap;

public class Employee {
	int empId;
	String emp_name;
	String address;

	public Employee(int empId, String emp_name, String address) {

		this.empId = empId;
		this.emp_name = emp_name;
		this.address = address;
	}

	private static void swap(Employee emp1, Employee emp2) {
		int temp = emp1.empId;
		emp1.empId = emp2.empId;
		emp2.empId = temp;
		String temp1 = emp1.emp_name;
		emp1.emp_name = emp2.emp_name;
		emp2.emp_name = temp1;

	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(12, "Archan", "Darbhanga");
		Employee emp2 = new Employee(13, "Sujeet", "Madhubani");
		System.out.println(
				"Before swap:" + "emp1:" + emp1.empId + emp1.emp_name + " " + "emp2:" + emp2.empId + emp2.emp_name);
		swap(emp1, emp2);
		System.out.println(
				"After swap:" + "emp1:" + emp1.empId +"   " +emp1.emp_name + " " + "emp2:" + emp2.empId + emp2.emp_name);

	}

}
