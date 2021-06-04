import java.util.ArrayList;

public class HumanResources {
//	private int index = -1;
//	private Person[] batch;
//	Association[] checkResources;
//
//	public void add(String name, String id, String status) {
//
//		if (index != -1) {
//			extend();
//		} else
//			batch = new Person[1];
//
//		index++;
//
//		if (status.equals("Student")) {
//			System.out.println("No :-   " + (index + 1));
//			batch[index] = new Student(name, id);
//			((Student) batch[index]).associate();
//		} else if (status.equals("Teacher")) {
//			System.out.println("No :-   " + (index + 1));
//			batch[index] = new Teacher(name, id);
//			((Teacher) batch[index]).associate();
//		}
//
//	}
//
//	public void extend() {
//		Person[] temp = new Person[index + 2];
//
//		for (int i = 0; i <= index; i++) {
//			temp[i] = batch[i];
//		}
//		batch = new Person[index + 1];
//		batch = temp;
//		temp = null;
//	}
//
//	@Override
//	public String toString() {
//		String str = "";
//		for (int i = 0; i <= index; i++) {
//			str = str + batch[i] + "\n";
//		}
//		return str;
//	}
//
//	public void delete(String name) {
//		Person[] temp = new Person[index];
//		int Xd = 0, j = 0;
//		for (int i = 0; i <= index; i++) {
//			if (!name.equals(batch[i].getName()) && j != index) {
//				temp[j] = batch[i];
//				j++;
//			} else {
//				Xd = 1;
//			}
//
//		}
//		if (Xd == 1) {
//			index--;
//			batch = new Person[index];
//			batch = temp;
//		}
//	}

	
	private ArrayList<Person> checkresources = new ArrayList<Person>();

	public void add(String name, String id, String status) {

		if (status.equals("Student")) {
			checkresources.add(new Student(name, id));
			((Student) checkresources.get(checkresources.size() - 1)).associate();

		} else if (status.equals("Teacher")) {

			checkresources.add(new Teacher(name, id));
			((Teacher) checkresources.get(checkresources.size() - 1)).associate();
		}

	}

//	public void extend() {
//		Person[] temp = new Person[index + 2];
//
//		for (int i = 0; i <= index; i++) {
//			temp[i] = batch[i];
//		}
//		batch = new Person[index + 1];
//		batch = temp;
//		temp = null;
//	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < checkresources.size(); i++) {
			str = str + checkresources.get(i) + "\n";
		}
		return str;
	}

	public void delete(String name) {
		for (int i = 0; i < checkresources.size(); i++) {
			if (name.equals(checkresources.get(i).getName())) {
				checkresources.remove(i);
				System.out.println("Record deleted successfully!!!");
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
}