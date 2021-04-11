
public class Line {
	PointXY startPoint, endPoint;

	public void setStartPointXY(PointXY startPoint) {
		this.startPoint = startPoint;

	}

	public void setEndPointXY(PointXY endPoint) {
		this.endPoint = endPoint;

	}

	public PointXY getStartPointXY() {

		return startPoint;
	}

	public PointXY getEndPointXY() {

		return endPoint;
	}

	public String length() {

		double length = Math.sqrt((Math.pow(endPoint.getxCord() - startPoint.getxCord(), 2))
				+ (Math.pow(endPoint.getyCord() - startPoint.getyCord(), 2)));
		return "Length of this line is: "+length;
	}

}
