package collections.lst.sets;

public class Student {
	int rollNo;
	String sName;
	String sDept;

	public Student(int rollNo, String sName, String sDept) {

		this.rollNo = rollNo;
		this.sName = sName;
		this.sDept = sDept;
	}

	public int hashCode() {
		return rollNo;

	}

	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return (rollNo == student.rollNo);

	}

	public String toString() {
		return "RollNo."+rollNo + " "+" " + sName + " " + sDept;

	}

}
