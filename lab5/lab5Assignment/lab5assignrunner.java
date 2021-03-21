
public class lab5assignrunner {

	public static void main(String[] args) {

		Fraction user = new Fraction();
		user.setA(6);
		user.setB(10);
		user.display();

		Fraction me = new Fraction();
		me.setA(15);
		me.setB(10);
		me.display();
		System.out.println(Fraction.Equals(user, me));

	}

	

}
