
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Account implements Serializable {
	private String name;
	private int accountNum, bankBalance = 1000;

	Scanner keyboard = new Scanner(System.in);

	public Account(String name, int accountNum) {
		super();
		this.name = name;
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [ name: " + name + " accountNum: " + accountNum + " bankBalance: " + bankBalance + "]\n";
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		this.bankBalance += bankBalance;
	}

	public void withDraw() {

		System.out.println("Enter the amount you want to withdraw: ");
		int cash = keyboard.nextInt();
		bankBalance -= cash;
		System.out.println("Cash has been withdrawn!!! \nbalance: " + bankBalance);

	}

	public void deposit() {

		System.out.println("Enter the amount you want to deposit: ");
		int cash = keyboard.nextInt();
		bankBalance += cash;
		System.out.println("Cash has been deposited!!! \nbalance: " + bankBalance);

	}

	public void balanceCheck() {
		int balance = getBankBalance();
		System.out.println("Your balance is: " + balance);
	}

	public void transfer(Account to, Account from) {

		System.out.println("Enter the amount you want to transfer: ");
		int cash = keyboard.nextInt();
		to.setBankBalance(bankBalance + cash);
		from.setBankBalance(bankBalance - cash);
		System.out.println(cash + " transfered Successfully");

	}

	public static void writeFile(ArrayList<Account> record) {
		FileOutputStream bookStream;
		try {

//			Writing

			bookStream = new FileOutputStream("E:\\Account.txt");
			ObjectOutputStream objectStream = new ObjectOutputStream(bookStream);
			objectStream.writeObject(record.toString());
			objectStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile(ArrayList<Account> record) {

		try {

//				Reading

			FileInputStream inputStream = new FileInputStream("E:\\Account.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			System.out.println(objectInputStream.readObject());

			objectInputStream.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
