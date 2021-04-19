package lab8;

public class laptop {
	computer Laptop;
	int length, width, height, weight;

	public laptop() {
		length = 1;
		width = 1;
		height = 1;
		weight = 1;
	}

	public laptop(computer a, int i, int j, int k, int l) {
		this.length = i;
		this.width = j;
		this.height = k;
		this.weight = l;
		this.Laptop = a;
	}

	void display() {
		System.out.println("Details of Laptop: ");
		System.out.println("Length: " + length + " Height: " + height + " width: " + width + " weight: " + weight
				+ "\nComputer: " + Laptop.display());
	}
}
