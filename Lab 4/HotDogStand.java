
public class HotDogStand {
	int id, sold;
	private static int soldtotal=0;

	public HotDogStand(int id, int sold) {
		this.id = id;
		this.sold = sold;
		soldtotal +=sold;

	}

	void justSold() {
		sold++;
		soldtotal++;
	}

	void getHotDogNo() {
		System.out.println("Number of hot dogs Sold: " + sold);
	}
      static int getTotalHotDogNo() {
		System.out.println("Total Number of hot dogs Sold: " + soldtotal);
		return soldtotal;
	}

}
