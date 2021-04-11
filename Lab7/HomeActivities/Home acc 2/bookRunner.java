
public class bookRunner {

	public static void main(String[] args) {

		Address userAddress = new Address();

		userAddress.setCity("Faisalabad");
		userAddress.setCityCode(41);
		userAddress.setHouseNo(91);
		userAddress.setStreatNo(14);

		personAddress userPersonAddress = new personAddress(userAddress);
		book user = new book();
		user.setAuthor(userPersonAddress);
		user.setBookName("Java programing");
		user.setPublisher("Sherry");

		user.display();
	}

}
