
public class Triangle implements Shape {
	public int length, width;

	public Triangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	@Override
	public double area() {
		double area = 0.5 * (length * width);
		return area;
	}
	
}
