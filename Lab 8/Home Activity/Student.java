package lab8;

public class Student extends Person {
	Person person;

	private boolean Status;

	public void setStatus(boolean status) {
		Status = status;
	}

	String getStatus() {
		if (Status == true) {
			return "Student is Active(Current Student)";

		} else {
			return "Student is not active(Former Student)";

		}

	}

	void setperson(Person person) {
		this.person = person;

	}

	public Person getPerson() {
		return person;
	}

	public void display() {
	
		person.display();
		System.out.println("Status: " + getStatus());
	}

}
