package collections.lsthash.sets;

public class Employee {
	int empId;
	String sName;
	String dept;

	public Employee(int empId, String sName, String dept) {

		this.empId = empId;
		this.sName = sName;
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
		return "empId:" + empId + " , " + " EmpName:" + sName + " , " + " Dept:" + "dept";

	}
}
