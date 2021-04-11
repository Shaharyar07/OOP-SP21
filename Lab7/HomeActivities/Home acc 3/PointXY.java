
public class PointXY {

	private int xCord, yCord;

	public PointXY() {
		this.xCord = 1;
		this.yCord = 1;

	}

	public PointXY(int xCord, int yCord) {
		this.xCord = xCord;
		this.yCord = yCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public int getxCord() {
		return xCord;
	}

	public int getyCord() {
		return yCord;
	}

	void display() {
		System.out.println("X-cordinates are: " + xCord + " Y-cordinates are: " + yCord);
	}

}
