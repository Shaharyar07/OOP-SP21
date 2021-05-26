
public class Circle implements Shape {
	double rad;

	Circle(double rad) {
		this.rad = rad;

	}

	@Override
	public double area() {
		double area = 0.5* 3.14 * (rad * rad);
		return area;

	}
	

}
