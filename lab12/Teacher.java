import java.util.Scanner;

public class Teacher extends Person implements Association {
	String designation, department;

	public Teacher(String name, String id) {
		super(name, id);

	}

	public String getDepartment() {
		return department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return super.toString() + ", Designation: " + designation + ", Department: " + department;
	}

	@Override
	public void associate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Designation: ");
		this.designation = scanner.next();
		System.out.println("Enter Department: ");
		this.department = scanner.next();
		

	}

}
