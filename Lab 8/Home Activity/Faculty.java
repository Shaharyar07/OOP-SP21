package lab8;

public class Faculty extends Employee {
	Employee employee;
	private int officeHours;
	private char rank;

	public void setRank(char rank) {
		this.rank = rank;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public int getOfficeHours() {
		return officeHours;
	}

	public char getRank() {
		return rank;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}

	public void display() {
		
		employee.display();
		System.out.println("Office Hours: " + officeHours + " Rank: " + rank);

	}


}
