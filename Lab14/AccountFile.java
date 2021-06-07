
import java.io.FileNotFoundException;

import java.util.ArrayList;

public class AccountFile {

	public static void main(String[] args) throws FileNotFoundException {

		Account user1 = new Account("user1", 11);
		Account user2 = new Account("user2", 22);
		Account user3 = new Account("user3", 33);
		Account user4 = new Account("user4", 44);
		Account user5 = new Account("user5", 55);
		Account user6 = new Account("user6", 66);
		Account user7 = new Account("user7", 77);
		Account user8 = new Account("user8", 88);
		Account user9 = new Account("user9", 99);
		Account user10 = new Account("user10", 100);

		ArrayList<Account> record = new ArrayList<Account>();
		record.add(user1);
		record.add(user2);
		record.add(user3);
		record.add(user4);
		record.add(user5);
		record.add(user6);
		record.add(user7);
		record.add(user8);
		record.add(user9);
		record.add(user10);

		Account.writeFile(record);

		user1.deposit();
		user2.balanceCheck();
		user3.withDraw();
		user4.transfer(user5, user4);
		
		
//		Overwriting the already existing file
		
		Account.writeFile(record);
		Account.readFile(record);

	}

}
