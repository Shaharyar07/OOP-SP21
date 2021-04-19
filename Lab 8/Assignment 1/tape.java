package lab8;

public class tape extends publication {
	private int playTime;

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public int getPlayTime() {
		return playTime;
	}

	void display() {
		System.out.println("Playing time in minutes: " + playTime);

	}

}
