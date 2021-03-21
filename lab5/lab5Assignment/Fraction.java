
class Fraction {
	private int a, b;

	Fraction() {
		setA(a);
		setB(b);

	}

	Fraction(int a, int b) {
		this.setA(a);
		this.setB(b);
	}

	public static void ratio(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if (max % min == 0) {
			System.out.println("1" + " : " + max / min);

		}
		for (int i = 2; i <= min; i++) {
			while (max % i == 0 && min % i == 0) {
				max /= i;
				min /= i;
			}
		}
		System.out.println(max + " : " + min);

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	void display() {
		ratio(getA(), getB());

	}
	public static boolean Equals(Fraction user, Fraction me) {
		if (user.equals(me)) {
			return true;
		}
		else {
			return false;
		}

	}

}
