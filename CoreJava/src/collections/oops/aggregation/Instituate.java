package collections.oops.aggregation;

import java.util.List;

public class Instituate {
	private String Instituatname;
	private List<Department> departments;

	public Instituate(String instituatname, List<Department> departments) {

		Instituatname = instituatname;
		this.departments = departments;
	}

	public int getTotalStudentsInInstitute() {
		int NoOfStudent = 0;
		List<Student> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student std : students) {
				NoOfStudent++;

			}

		}

		return NoOfStudent;

	}
	public int TotalNoOfDept(){
		int TotalNoOfDept=0;
		return 0;
		
	}

}
