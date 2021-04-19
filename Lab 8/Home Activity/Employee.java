package lab8;

public class Employee extends Person {
	Person person;
	private int salary;
	private boolean office;
	private Date dateHired;

	public void setOffice(boolean office) {
		this.office = office;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private String getOffice() {
		if (office == true) {
			return "Employee has a Office";

		} else {
			return "Employee does not have a Office";

		}

	}

	void setperson(Person person) {
		this.person = person;

	}

	public Person getPerson() {
		return person;
	}

	public int getSalary() {
		return salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void display() {
		
		person.display();
		System.out.println("Salary: " + salary + "\nDateHired: " + dateHired.display() + "\nOffice Status: " + getOffice());

	}
}
