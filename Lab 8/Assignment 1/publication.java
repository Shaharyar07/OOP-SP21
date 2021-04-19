package lab8;

public class publication {
	private String title;
	private int price;

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void display() {
		System.out.println("Title: " + title + " Price: " + price);

	}

}
