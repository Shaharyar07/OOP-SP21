package lab8;

public class Staff extends Employee {
	private String title;
	private Employee employee;

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void dislay() {
		employee.display();
		System.out.println("Title: " + getTitle());
	}

}
