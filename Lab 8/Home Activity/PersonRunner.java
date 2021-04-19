package lab8;

public class PersonRunner {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("sherry");
		person.setAdress("xyz");
		person.setEmailAdress("abc@gmail.com");
		person.setPhoneNumber(347);
		person.display();
		
		Student student = new Student();
		student.setperson(person);
		student.setStatus(true);
		student.display();
	
		Employee employee = new Employee();
		employee.setperson(person);
		employee.setOffice(true);
		Date dateHired = new Date(2, 3, 2008);
		employee.setDateHired(dateHired);
		employee.setSalary(10000);
		employee.display();
		
		Faculty faculty = new Faculty();
		faculty.setEmployee(employee);
		faculty.setOfficeHours(8);
		faculty.setRank('A');
		faculty.display();
		
		Staff staff = new Staff();
		staff.setEmployee(employee);
		staff.setTitle("Manager");
		staff.dislay();
	

	}

}
