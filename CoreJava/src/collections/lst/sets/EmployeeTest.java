package collections.lst.sets;

import java.util.HashSet;

public class EmployeeTest {

	public static void main(String[] args) {
		HashSet< Employee> set=new HashSet<>();
		set.add(new Employee(12, "Raja", "mca"));
		set.add(new Employee(13, "Rani", "ba"));
		set.add(new Employee(14, "Anoj", "bca"));
		set.add(new Employee(12, "Raja", "mca"));
       System.out.println(set);
	}

}
