

public class personAddress {
	Address address;

	public personAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void Display(){
	
		System.out.println("Person Address: ");
		address.Display();
		
	}

}
