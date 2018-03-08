package collections.oops.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationTest {

	public static void main(String[] args) {
		Student std1 = new Student(12, "Anoj", "CSE");
		Student std2 = new Student(13, "Rav", "CSE");
		Student std3 = new Student(14, "Rahul", "EE");
		Student std4 = new Student(15, "Suman", "EE");
		Student std5 = new Student(18, "Aaryan", "Che");
		Student std6 = new Student(12, "Aanad", "Che");
		List<Student> CSE_Std = new ArrayList<>();
		CSE_Std.add(std1);
		CSE_Std.add(std2);
		List<Student> EE_Std = new ArrayList<>();
		EE_Std.add(std3);
		EE_Std.add(std4);
		List<Student> Che_std = new ArrayList<>();
		Che_std.add(std5);
		Che_std.add(std6);
		Department ESE_dep = new Department("CSE", CSE_Std);
		Department EE_dept = new Department("EE", EE_Std);
		Department Che_dept = new Department("Chem", Che_std);
		List<Department> dept = new ArrayList<>();
		dept.add(ESE_dep);
		dept.add(EE_dept);
		dept.add(Che_dept);
		System.out.println("Total no. of dept:" + dept);
		Instituate inst = new Instituate("BHU", dept);
		System.out.print("Total students in institute:");
		System.out.println(inst.getTotalStudentsInInstitute());

	}

}
