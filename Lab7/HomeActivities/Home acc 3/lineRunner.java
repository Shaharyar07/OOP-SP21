
public class lineRunner {

	public static void main(String[] args) {
		PointXY startPoint = new PointXY();
		startPoint.setxCord(5);
		startPoint.setyCord(3);
		PointXY endPoint = new PointXY();
		endPoint.setxCord(6);
		endPoint.setyCord(5);

		Line userLine = new Line();
		userLine.setStartPointXY(startPoint);
		userLine.setEndPointXY(endPoint);
		System.out.println(userLine.length());

	}

}
