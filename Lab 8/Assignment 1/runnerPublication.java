package lab8;

public class runnerPublication {

	public static void main(String[] args) {
		publication publish = new publication();
		publish.setTitle("user1");
		publish.setPrice(1000);
		book myBook = new book();
		myBook.setPageCount(89);
		myBook.display();
		tape myTape = new tape();
		myTape.setPlayTime(300);
		myTape.display();
		

	}

}
