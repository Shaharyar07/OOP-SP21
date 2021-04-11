
public class Pizza {
	private  char size;
	private  int chTopping, ppTopping, hamTopping;

	public Pizza() {
		this.size = size;
		this.chTopping = 1;
		this.ppTopping = 1;
		this.hamTopping = 1;
	}

	Pizza(char size, int chTopping, int ppTopping, int hamTopping) {
		this.size = size;
		this.chTopping = chTopping;
		this.ppTopping = ppTopping;
		this.hamTopping = hamTopping;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public void setChTopping(int chTopping) {
		this.chTopping = chTopping;
	}

	public void setHamTopping(int hamTopping) {
		this.hamTopping = hamTopping;
	}

	public void setPpTopping(int ppTopping) {
		this.ppTopping = ppTopping;
	}

	public  double calcCost() {
		if (size == 's') {
			int topping = 2;
			double bill = 10 + topping * chTopping + topping * ppTopping + topping * hamTopping;
			return bill;
		}
		if (size == 'm') {
			int topping = 2;
			double bill = 12 + topping * chTopping + topping * ppTopping + topping * hamTopping;
			return bill;
		}
		if (size == 'l') {
			int topping = 2;
			double bill = 14 + topping * chTopping + topping * ppTopping + topping * hamTopping;
			return bill;
		}
		return 0; 
	}

	public String getDescription() {
		System.out.println("Description of your Pizza is as following: ");
		return "Size: "+ size + " Cheese Toppings: " + chTopping + " Peproni Toppings: " + ppTopping + " Ham Toppings: "
				+ hamTopping;

	}

}
