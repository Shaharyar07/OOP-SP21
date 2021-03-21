
public class lab5hAcc2runner {

	public static void main(String[] args) {
		Books user1 = new Books();
		user1.setAuthor("sherry");
		String chapter1[] = { "ch1", "ch2" };
		user1.setChapterName(chapter1);

		Books user2 = new Books();
		user2.setAuthor("huzaifa");
		String chapter2[] = { "ch1", "ch2", "ch3" };
		user2.setChapterName(chapter2);

		System.out.println(Books.compareBooks(user1, user2));
		System.out.println(Books.compareChapterNames(user1, user2));

	}

}
