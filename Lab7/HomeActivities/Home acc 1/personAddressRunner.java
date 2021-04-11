
public class personAddressRunner {

	public static void main(String[] args) {
		Address user = new Address();
		user.setCity("Faisalabad");
		user.setHouseNo(91);
		user.setCityCode(041);
		user.setStreatNo(14);
		
		personAddress person = new personAddress(user);
		person.Display();

	}

}
