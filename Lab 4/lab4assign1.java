
public class lab4assign1 {

	public static void main(String[] args) {
		HotDogStand user1 = new HotDogStand(11, 6);
		HotDogStand user2 = new HotDogStand(22, 4);
		HotDogStand user3 = new HotDogStand(333, 9);

		user1.justSold();
		user1.justSold();
		user1.justSold();

		user2.justSold();
		user2.justSold();

		user3.justSold();
		user3.justSold();

		System.out.println("HotDogs at User ID:" + user1.id);
		user1.getHotDogNo();
		System.out.println("----------------");

		System.out.println("HotDogs at User ID:" + user2.id);
		user2.getHotDogNo();
		System.out.println("----------------");

		System.out.println("HotDogs at User ID:" + user3.id);
		user3.getHotDogNo();
		System.out.println("----------------");

		HotDogStand.getTotalHotDogNo();

	}

}
