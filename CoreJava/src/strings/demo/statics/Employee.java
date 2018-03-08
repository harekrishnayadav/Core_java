package strings.demo.statics;

public class Employee {
	int id;
	String sname;
	static String add = "Address";

	public Employee(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", sname=" + sname + ",add=" + add + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(12, "Sujeet");
		Employee emp2 = new Employee(13, "Ajay");
		Employee emp3 = new Employee(14, "Raja");
		System.out.println("emp1:" + emp1 + "   " + "emp2:" + emp2 + "emp3:" + emp3);

	}

}
