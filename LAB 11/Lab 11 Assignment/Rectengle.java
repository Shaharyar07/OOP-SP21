
public class Rectengle implements Shape {
	public int length, width;

	public Rectengle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	@Override
	public double area() {
		double area = length * width;
		return area;
	}
	

}
