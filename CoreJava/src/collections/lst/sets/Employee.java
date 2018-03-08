package collections.lst.sets;

public class Employee {
	int empId;
	String empName;
	String dept;

	public Employee(int empId, String empName, String dept) {

		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

	public int hashCode() {
		return empId;

	}

	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;

		return (empId == employee.empId);

	}

	public String toString() {
		return empId + " " + empName + " " + dept;

	}

}
