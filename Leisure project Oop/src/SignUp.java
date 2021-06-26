
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SignUp {

	String school;
	String id;
	String name;
	String address;
	String contact;
	protected String password;
	String coach;
	String time;
	String lesson;
	String date;

	public SignUp(String date1, String id1, String name1, String contact1, String address1, String pass, String school1,
			String time1, String coach1, String less) {
		school = school1;
		name = name1;
		password = pass;
		id = id1;
		date = date1;
		address = address1;
		contact = contact1;
		coach = coach1;
		time = time1;
		lesson = less;

		try (FileWriter fw = new FileWriter(id + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(password);

			out.println(name);

			out.println(id);
			out.println(contact);
			out.println(address);

			out.println(school);
			out.print(lesson + "\t   " + coach + "        " + time + "       " + date);
			GUI.saved = 1;

		} catch (IOException e) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "CANT SIGN UP SORRY");
		}

	}

}
