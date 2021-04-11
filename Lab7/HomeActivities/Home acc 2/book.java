
public class book {
	personAddress author;
	String bookName, publisher;

	public void setAuthor(personAddress author) {
		this.author = author;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void display() {
		
		System.out.println("Book Details: ");
		System.out.println("Book Name: " + bookName);
		System.out.println("Publisher: " + publisher);
		author.Display();

	}

}
