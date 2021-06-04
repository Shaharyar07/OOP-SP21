import java.util.Scanner;

public class Student extends Person implements Association {
	private int rollNo, semester;

	public Student(String name, String id) {

		super(name, id);

	}

	public int getRollNo() {
		return rollNo;
	}

	public int getSemester() {
		return semester;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return super.toString() + ", Roll Number: " + rollNo + ", Semester: " + semester;
	}

	@Override
	public void associate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll #: ");
		this.rollNo = scanner.nextInt();
		System.out.println("Enter semester: ");
		this.semester = scanner.nextInt();
		

	}

}
