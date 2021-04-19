
public class Books {
	private String author;

	private String[] chapterName = new String[100];

	public Books() {
		author = author;
		chapterName = chapterName;

	}

	Books(String author, String[] chapterName) {
		this.author = author;
		this.chapterName = chapterName;
	}

	static boolean compareBooks(Books a, Books b) {
		if (a.getAuthor() == b.getAuthor()) {
			return true;
		} else {
			return false;
		}

	}

	static String compareChapterNames(Books a, Books b) {
		if (a.getChapterName().length > b.getChapterName().length) {
			return a.getAuthor();
		} else {
			return b.getAuthor();
		}
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	String[] getChapterName() {
		return chapterName;
	}

	void setChapterName(String[] chapterName) {
		this.chapterName = chapterName;
	}

}
