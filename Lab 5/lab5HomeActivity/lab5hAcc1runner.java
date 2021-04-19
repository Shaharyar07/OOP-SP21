
public class lab5hAcc1runner {
	public static void main(String[]args) {
		distance user1 = new distance();
		user1.setFeets(4);
		user1.setInches(8);
		user1.Display();
		distance user2 = new distance(7,11);
		user2.Display();
		distance.Add(user1,user2);
	}

}
