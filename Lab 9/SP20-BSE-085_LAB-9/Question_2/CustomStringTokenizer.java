package lab9;

import java.util.*;

public class CustomStringTokenizer {

	public static void main(String[] args) {

		StringTokenizer str = new StringTokenizer("This is the question 2 of lab ");
		int count = countTokens(str);

		System.out.println("Total tokens : " + count);
	}

	static int countTokens(StringTokenizer st) {

		int count = 0;
		while (st.hasMoreTokens()) {
			boolean status = true;
			try {
				String check = st.nextToken();
				double d = Double.parseDouble(check);
			} catch (NumberFormatException e) {
				status = false;

			}
			if (status != true) {
				count++;
			}
		}
		return count;

	}
}
