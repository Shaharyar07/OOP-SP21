
public class Runner {

	public static void main(String[] args) {
		
		HumanResources checkResources = new HumanResources();

		checkResources.add("huzaifa", "1", "Student");
		checkResources.add("Mukhtar Azeem", "2", "Teacher");
		checkResources.add("tahir", "3", "Student");

		checkResources.delete("tahir");

		System.out.println(checkResources);

	}

}
