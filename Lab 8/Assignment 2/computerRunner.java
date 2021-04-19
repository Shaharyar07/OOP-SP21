package lab8;

public class computerRunner {

	public static void main(String[] args) {
		computer myComputer = new computer();
		laptop myLaptop = new laptop( myComputer,2,2,3,5);
		System.out.println(myComputer.display());
		myLaptop.display();

	}

}
