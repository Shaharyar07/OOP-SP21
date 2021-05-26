
public class Runner {

	public static void main(String[] args) {
		Shape[] obj = new Shape[3];
		obj[0] = new Circle(5.7);
		obj[1] = new Rectengle(20, 12);
		obj[2] = new Triangle(10, 5);
		double totalArea[] = CalculateAreas.totalArea(obj);
		for (double area : totalArea) {
			System.out.println(area);
		}

	}

}
