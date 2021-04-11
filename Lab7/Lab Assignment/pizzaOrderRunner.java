
public class pizzaOrderRunner {

	public static void main(String[] args) {
		Pizza me = new Pizza();
		
		me.setSize('l');
		me.setChTopping(2);
		me.setPpTopping(2);
		me.setHamTopping(2);
		
		Pizza you = new Pizza();
		you.setSize('s');
		you.setChTopping(1);
		you.setPpTopping(1);
		you.setHamTopping(1);
		
		System.out.println(me.calcCost());
		System.out.println(you.calcCost());
		System.out.println(me.getDescription());
		System.out.println(you.getDescription());
		
		PizzaOrder order1 = new PizzaOrder(me);
		PizzaOrder order2 = new PizzaOrder(you);
		
		System.out.println(PizzaOrder.calcTotal());

	}

}
