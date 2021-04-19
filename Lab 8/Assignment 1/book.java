package lab8;

public class book extends publication {
	private int pageCount;

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	void display() {
		System.out.println("Number of Pages are: " + pageCount);

	}

}
