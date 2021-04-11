
public class PizzaOrder {
	static Pizza user[]=new Pizza[3];
        private static int i=0;

	PizzaOrder(Pizza pizza) {
            user[i] = pizza;
            i++;

	}

	public static double calcTotal() {
            double Bill=0;
		for(int j = 0; j < i; j++){
                    double Bill1 = user[j].calcCost();
                    Bill = Bill+Bill1;
			
		}
		System.out.println("Total Bill is: " + Bill);
		return Bill;

	}

}
