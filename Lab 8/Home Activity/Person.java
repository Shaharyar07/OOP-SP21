package lab8;

public class Person {
	private String name, adress, emailAdress;
	private int phoneNumber;

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void display() {
		System.out.println("------------------");
		System.out.println("Name: " + name + "\nAdddres: " + adress + "\nEmail Address: " + emailAdress
				+ "\nPhone Number: " + phoneNumber);
		
	}

}
