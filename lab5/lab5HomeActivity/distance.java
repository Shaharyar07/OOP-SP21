
public class distance {
	private int feets, inches;

	public distance() {
		feets = feets;
		inches = inches;
	}

	public distance(int feets, int inches) {
		this.feets = feets;
		this.inches = inches;

	}

	public void setFeets(int feets) {
		this.feets = feets;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public int getFeets() {
		return feets;
	}

	public int getInches() {
		return inches;
	}

	void Display() {
		System.out.println("Distance is " + "FEET: " + feets + " , " + "INCHES: " + inches);
	}

	public static double Add(distance a, distance b) {
		int total_feets = a.getFeets() + b.getFeets();
		int total_inches = a.getInches() + b.getInches();
		double new_distance = total_feets + total_inches;
		System.out.println("Total Feets: " + total_feets + " , " + "Total inches: " + total_inches);
		return new_distance;

	}

}
