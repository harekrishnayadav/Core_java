package collections.oops.association;

public class AssociationTest {

	public static void main(String[] args) {
		Bank bank = new Bank("Axis");
		Employee emp = new Employee("Archna");
		System.out.println(emp.getEmployeeName() + " is bank employee of " + bank.getBankName());

	}

}
