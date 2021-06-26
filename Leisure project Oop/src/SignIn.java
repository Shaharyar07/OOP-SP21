
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SignIn {
	String Pass;
	String id;
	String[] data = new String[100];

	public boolean verify(String idw, String Passw) {
		try {
			FileReader f = new FileReader(idw + ".txt");
			BufferedReader b = new BufferedReader(f);
			Scanner s = new Scanner(b);

			return true;
		} catch (Exception e) {
			JFrame frame = new JFrame("LOGIN FAILED");
			JOptionPane.showMessageDialog(frame, "Invalid ID or PASSWORD");
			return false;
		}
	}

	String[] saa;

	public int lines(String id2) {
		try {
			BufferedReader b1 = new BufferedReader(new FileReader(id2 + ".txt"));

			String x;
			int y = 0;
			while ((x = b1.readLine()) != null) {

				y++;
			}
			return y;
		} catch (Exception e) {
			return 0;
		}
	}

	public String[] fetch(String id)

	{

		try {
			BufferedReader b = new BufferedReader(new FileReader(id + ".txt"));
			int size = lines(id);
			String[] data = new String[size];
			String x;
			int y = 0;
			while ((x = b.readLine()) != null) {
				data[y] = x;
				y++;
			}

			return data;
		}

		catch (Exception e) {
			JFrame frame = new JFrame("FAILED");
			JOptionPane.showMessageDialog(frame, "Sorry Cant Fetch DATA");
			return saa;
		}

	}

}
